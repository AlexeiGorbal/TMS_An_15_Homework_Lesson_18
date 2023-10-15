package com.example.tms_an_15_homework_lesson_18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class RegistrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login = findViewById<AppCompatEditText>(R.id.login)
        val password = findViewById<AppCompatEditText>(R.id.password)
        val button = findViewById<AppCompatButton>(R.id.button)

        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra(LOGIN, login.text.toString())
        intent.putExtra(PASSWORD, password.text.toString())

        button.setOnClickListener {
            if ((login.length() >= VALID_LENGTH) && (password.length() >= VALID_LENGTH)) {
                startActivity(intent)
            }
        }
    }

    companion object {
        const val VALID_LENGTH = 6
        const val LOGIN = "login"
        const val PASSWORD = "password"
    }
}