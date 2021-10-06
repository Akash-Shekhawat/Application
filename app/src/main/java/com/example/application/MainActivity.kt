package com.example.application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    private var next: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        next = findViewById<View>(R.id.btn_Next) as Button


        next?.setOnClickListener {
            startActivity(Intent(this@MainActivity, LoginActivity::class.java))
            finish()
        }
    }
    fun fragmentChange(view: View){
       var fragmant: Fragment

       if(view== findViewById(R.id.button1)){
           fragmant=FragmentOne()
           val fm = supportFragmentManager
           val ft: FragmentTransaction = fm.beginTransaction()
           ft.replace(R.id.Frag1,fragmant)
           ft.commit()

       }
        if(view== findViewById(R.id.button2)){
            fragmant=FragmentTwo()
            val fm = supportFragmentManager
            val ft: FragmentTransaction = fm.beginTransaction()
            ft.replace(R.id.Frag1,fragmant)
            ft.commit()
        }
    }
}