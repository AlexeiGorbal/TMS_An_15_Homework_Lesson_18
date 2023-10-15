package com.example.tms_an_15_homework_lesson_18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatTextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val login = findViewById<AppCompatTextView>(R.id.login2)
        login.text = intent.getStringExtra(RegistrationActivity.LOGIN)

        val passwordView = findViewById<AppCompatTextView>(R.id.password2)
        passwordView.text = intent.getStringExtra(RegistrationActivity.PASSWORD)
    }
}