package com.example.layoutlearing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var registerName : TextView
    private lateinit var registerEmail : TextView
    private lateinit var registerPassword : TextView
    private lateinit var registerNameText : EditText
    private lateinit var registerEmailText : EditText
    private lateinit var registerPasswordText : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        registerName = findViewById(R.id.registerNameTextPrint)
        val registerButton = findViewById<Button>(R.id.registerButton)
        registerNameText = findViewById(R.id.registerNameText)
        registerEmail = findViewById(R.id.registerEmailTextPrint)
        registerEmailText = findViewById(R.id.registerEmailText)
        registerPassword = findViewById(R.id.registerPasswordTextPrint)
        registerPasswordText = findViewById(R.id.registerPasswordText)
        registerButton.setOnClickListener(){
            registerName.text = registerNameText.text.toString()
            registerEmail.text = registerEmailText.text.toString()
            registerPassword.text = registerPasswordText.text.toString()

        }
    }
}