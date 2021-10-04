package com.example.application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private var Next: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Next = findViewById<View>(R.id.btn_Next) as Button


        Next!!.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this@MainActivity, LoginActivity::class.java))
            finish()
        })
    }
}