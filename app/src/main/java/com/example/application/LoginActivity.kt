package com.example.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    private var userName: EditText? = null
    private  var userPassword:EditText? = null
    private  var userEmail:EditText? = null
    private  var userPhoneNumber:EditText? = null
    private var SignUpButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        userName = findViewById<View>(R.id.etUserName) as EditText
        userPassword = findViewById<View>(R.id.etUserPassword) as EditText
        userEmail = findViewById<View>(R.id.etUserEmail) as EditText
        userPhoneNumber = findViewById<View>(R.id.etUserPhoneNumber) as EditText
        SignUpButton = findViewById<View>(R.id.btnSignUP) as Button

        SignUpButton!!.setOnClickListener { view: View? ->
            if (validate()!!) {
                val user_name = userName!!.text.toString().trim { it <= ' ' }
                val user_email = userEmail!!.text.toString().trim { it <= ' ' }
                val user_phonenumber = userPhoneNumber!!.text.toString().trim { it <= ' ' }
            }


            finish()
        }

    }

    private fun validate(): Boolean? {
        var result = false
        val name = userName!!.text.toString()
        val password = userPassword!!.text.toString()
        val phonenumber = userPhoneNumber!!.text.toString()
        val email = userEmail!!.text.toString()
        if (name.isEmpty() || password.isEmpty() || phonenumber.isEmpty()|| email.isEmpty()) {
            Toast.makeText(this, "Please enter all the details", Toast.LENGTH_SHORT).show()
        } else {
            result = true
        }
        return result
    }
}