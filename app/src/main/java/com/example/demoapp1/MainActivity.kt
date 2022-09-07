package com.example.demoapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

const val EXTRA_MESSAGE = "com.example.demoapp1.MESSAGE"
const val CURRENT_LETTER = "com.example.demoapp1.LETTER"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun  sendMessage(view: View) {
        val intent = Intent(this, LetterActivity::class.java)
        startActivity(intent)
    }
}