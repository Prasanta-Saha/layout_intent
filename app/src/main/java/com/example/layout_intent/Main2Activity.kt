package com.example.layout_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var button2=findViewById<Button>(R.id.button2)

        button2.setOnClickListener()
        {
            startActivity(Intent(this@Main2Activity,Main3Activity::class.java))
        }
    }
}
