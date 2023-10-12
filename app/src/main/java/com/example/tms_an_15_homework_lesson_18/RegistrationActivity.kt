package com.example.tms_an_15_homework_lesson_18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class RegistrationActivity : AppCompatActivity() {

    lateinit var login: EditText
    lateinit var password: EditText
    lateinit var button: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login = findViewById(R.id.login)
        password = findViewById(R.id.password)
        button = findViewById(R.id.button)

        button.setOnClickListener() {

            if ((login.length() >= 6) && (password.length() >= 6)) {
                startActivity(Intent(this, SecondActivity::class.java))
            }
        }
    }
}