package com.lera.proectone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

private const val HELLO_KEY = "hello"

class SecondActivity : AppCompatActivity() {
    lateinit var helloTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        helloTextView = findViewById(R.id.hello_text_view)

        val helloValye: String? = intent.extras?.getString(HELLO_KEY, "hello")
        helloTextView.text = helloValye

    }

}