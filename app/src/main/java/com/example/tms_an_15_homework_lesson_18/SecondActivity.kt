package com.example.tms_an_15_homework_lesson_18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        var login: String?
        var password: String?

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        login = intent.getStringExtra("login")
        password=intent.getStringExtra("password")


    }
}