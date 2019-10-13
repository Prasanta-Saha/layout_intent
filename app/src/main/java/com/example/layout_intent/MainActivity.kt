package com.example.layout_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button1=findViewById<Button>(R.id.button1)

        button1.setOnClickListener()
        {
            startActivity(Intent(this@MainActivity,Main2Activity::class.java))
        }

    }
}
