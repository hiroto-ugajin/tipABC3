package jp.kanoyastore.hiroto.ugajin.tipabc3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.speech.tts.TextToSpeech
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.Toast
import java.util.*

class SecondActivity : AppCompatActivity() {

    val wordArray = arrayOf("ant", "boy", "cake", "doll", "egg", "flute", "girl", "house", "island")

    private lateinit var textToSpeech: TextToSpeech
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val imageView = findViewById<ImageView>(R.id.imageView)

        val listView = findViewById<ListView>(R.id.listView)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, wordArray)
        listView.adapter = adapter

        textToSpeech = TextToSpeech(this) { status ->
            if (status == TextToSpeech.SUCCESS) {
                // TextToSpeechの初期化成功
                val result = textToSpeech.setLanguage(Locale.US)
                if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                    // 使用する言語がサポートされていない場合の処理
                }
            } else {
                // TextToSpeechの初期化失敗
                Toast.makeText(this, "初期化失敗しました", Toast.LENGTH_SHORT).show()
            }
        }

        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val word = wordArray[position]
            textToSpeech.speak(word, TextToSpeech.QUEUE_FLUSH, null)
            if (word == "flute") {
                imageView.setImageResource(R.drawable.b6)

                val handler = Handler()
                handler.postDelayed({
                    imageView.setImageDrawable(null)
                }, 2000) // 2秒後に画像を非表示にする
            }
        }
    }
}