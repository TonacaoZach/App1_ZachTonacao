package com.example.transferdataaudioapril172024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.media.MediaPlayer
import android.net.Uri
import android.widget.Button


class AudioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audio)

        var play = findViewById<Button>(R.id.button2)
        var stop = findViewById<Button>(R.id.button3)
        var mp = MediaPlayer()

        mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.audio1))

        mp.prepare()
        mp.start()

        play.setOnClickListener {
            mp.setDataSource(this,Uri.parse("android.resource://"+this.packageName+"/"+R.raw.audio1))
            mp.prepare()
            mp.start()

        }

        stop.setOnClickListener {
            mp.stop()
            mp.release()
            mp=MediaPlayer()
        }

        val btn2 = findViewById<Button>(R.id.fordbutton)
        btn2.setOnClickListener(){
            val intent = Intent(this,ToastMessage::class.java)
            startActivity(intent)
        }
    }
}