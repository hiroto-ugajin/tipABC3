package jp.kanoyastore.hiroto.ugajin.tipabc3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import androidx.core.content.ContextCompat
import jp.kanoyastore.hiroto.ugajin.tipabc3.databinding.ActivityMainBinding
import android.media.MediaPlayer

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        mediaPlayer = MediaPlayer.create(this, R.raw.flute)

        binding.button.setOnClickListener(this)
        binding.button1.setOnClickListener(this)
        binding.button2.setOnClickListener(this)
        binding.button3.setOnClickListener(this)
        binding.button4.setOnClickListener(this)
        binding.button5.setOnClickListener(this)
        binding.button6.setOnClickListener(this)
        binding.button7.setOnClickListener(this)
        binding.button8.setOnClickListener(this)
        binding.button9.setOnClickListener(this)

    }
    override fun onClick(v: View) {
        val imageView = binding.imageView
        when (v.id) {
            R.id.button -> {
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
                if (mediaPlayer.isPlaying) {
                    mediaPlayer.pause() // 音楽の再生を一時停止する
                    mediaPlayer.seekTo(0) // 再生位置を最初に戻す
                }
            }
            R.id.button1 -> {
                imageView.setImageDrawable(null)
                val drawable = ContextCompat.getDrawable(this, R.drawable.b1)
                imageView.setImageDrawable(drawable)
                if (mediaPlayer.isPlaying) {
                    mediaPlayer.pause() // 音楽の再生を一時停止する
                    mediaPlayer.seekTo(0) // 再生位置を最初に戻す
                }
            }
            R.id.button2 -> {
                imageView.setImageDrawable(null)
                val drawable = ContextCompat.getDrawable(this, R.drawable.b2)
                imageView.setImageDrawable(drawable)
                if (mediaPlayer.isPlaying) {
                    mediaPlayer.pause() // 音楽の再生を一時停止する
                    mediaPlayer.seekTo(0) // 再生位置を最初に戻す
                }
            }
            R.id.button3 -> {
                imageView.setImageDrawable(null)
                val drawable = ContextCompat.getDrawable(this, R.drawable.b3)
                imageView.setImageDrawable(drawable)
                if (mediaPlayer.isPlaying) {
                    mediaPlayer.pause() // 音楽の再生を一時停止する
                    mediaPlayer.seekTo(0) // 再生位置を最初に戻す
                }
            }
            R.id.button4 -> {
                imageView.setImageDrawable(null)
                val drawable = ContextCompat.getDrawable(this, R.drawable.b4)
                imageView.setImageDrawable(drawable)
                if (mediaPlayer.isPlaying) {
                    mediaPlayer.pause() // 音楽の再生を一時停止する
                    mediaPlayer.seekTo(0) // 再生位置を最初に戻す
                }
            }
            R.id.button5 -> {
                imageView.setImageDrawable(null)
                val drawable = ContextCompat.getDrawable(this, R.drawable.b5)
                imageView.setImageDrawable(drawable)
                if (mediaPlayer.isPlaying) {
                    mediaPlayer.pause() // 音楽の再生を一時停止する
                    mediaPlayer.seekTo(0) // 再生位置を最初に戻す
                }
            }
            R.id.button6 -> {
                imageView.setImageDrawable(null)
                val drawable = ContextCompat.getDrawable(this, R.drawable.b10)
                imageView.setImageDrawable(drawable)

                if (!mediaPlayer.isPlaying) {
                    mediaPlayer.start() // 音楽の再生を開始する
                }
            }
            R.id.button7 -> {
                imageView.setImageDrawable(null)
                val drawable = ContextCompat.getDrawable(this, R.drawable.b7)
                imageView.setImageDrawable(drawable)
                if (mediaPlayer.isPlaying) {
                    mediaPlayer.pause() // 音楽の再生を一時停止する
                    mediaPlayer.seekTo(0) // 再生位置を最初に戻す
                }
            }
            R.id.button8 -> {
                imageView.setImageDrawable(null)
                val drawable = ContextCompat.getDrawable(this, R.drawable.b8)
                imageView.setImageDrawable(drawable)
                if (mediaPlayer.isPlaying) {
                    mediaPlayer.pause() // 音楽の再生を一時停止する
                    mediaPlayer.seekTo(0) // 再生位置を最初に戻す
                }
            }
            R.id.button9 -> {
                imageView.setImageDrawable(null)
                val drawable = ContextCompat.getDrawable(this, R.drawable.b9)
                imageView.setImageDrawable(drawable)
                if (mediaPlayer.isPlaying) {
                    mediaPlayer.pause() // 音楽の再生を一時停止する
                    mediaPlayer.seekTo(0) // 再生位置を最初に戻す
                }
            }
        }
    }
}