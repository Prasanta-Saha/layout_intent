package com.example.layout_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var button3=findViewById<Button>(R.id.button3)

        button3.setOnClickListener()
        {
            startActivity(Intent(this@Main3Activity,MainActivity::class.java))
        }
    }
}
