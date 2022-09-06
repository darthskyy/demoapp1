package com.example.demoapp1

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import pl.droidsonroids.gif.GifImageView as GifImageView

class LetterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_letter)
    }

    val currentImage = findViewById<GifImageView>(R.id.currentLetter)

    fun goToA(view: View) {
        val img = findViewById<GifImageView>(R.id.currentLetter).apply {
            setImageResource(R.drawable.a)

        }
    }

    fun goToZ(view: View) {
        val img = findViewById<GifImageView>(R.id.currentLetter).apply {
            setImageResource(R.drawable.z)
        }
    }

    fun goToNext(view: View) {
        val img = findViewById<GifImageView>(R.id.currentLetter).apply {
            setImageResource(R.drawable.a)
        }
    }
}