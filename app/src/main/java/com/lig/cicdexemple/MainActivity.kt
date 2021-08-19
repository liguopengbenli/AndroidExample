package com.lig.cicdexemple

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.helloBtn)
        val textView = findViewById<TextView>(R.id.greetingTextView)
        val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        button.setOnClickListener {
            textView.text = "Hello ${editText.text} how are you today"
        }
    }
}
