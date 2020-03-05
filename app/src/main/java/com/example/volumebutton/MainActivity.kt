package com.example.volumebutton

import android.content.Context
import android.media.AudioManager
import android.os.Build
import android.os.Bundle
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var mediaPlayer: SeekBar? = null
    var audioManager: AudioManager? = null

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        mediaPlayer = findViewById(R.id.seekBar2) as SeekBar

        audioManager = getSystemService(Context.AUDIO_SERVICE) as AudioManager

        mediaPlayer!!.max = audioManager!!.getStreamMaxVolume(AudioManager.STREAM_MUSIC)

        mediaPlayer!!.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
                audioManager!!.setStreamVolume(AudioManager.STREAM_MUSIC, i, 0)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {}
            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })

    }
}
