package com.example.transferdataaudioapril172024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import io.github.muddz.styleabletoast.StyleableToast

class ToastMessage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast_message)

        var btn = findViewById<Button>(R.id.toast_btn)
        btn.setOnClickListener {
            StyleableToast.makeText(this, "This is a CUSTOM TOAST MESSAGE!", R.style.exampleToast).show();
        }


        val button3 = findViewById<Button>(R.id.backbtn)
        button3.setOnClickListener(){
            val intent = Intent(this,AudioActivity::class.java)
            startActivity(intent)
        }
    }
}