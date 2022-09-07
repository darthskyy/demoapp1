package com.example.demoapp1

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import pl.droidsonroids.gif.GifImageView

class LetterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_letter)
    }

    var currentLetter = 0

//        val prevBtn = findViewById<Button>(R.id.previous_btn).apply {
//            isEnabled = (currentLetter!=0)
////            isClickable = (currentLetter!=0)
//        }
//
//        val nextBtn = findViewById<Button>(R.id.next_btn).apply {
//            isEnabled = (currentLetter!=25)
////            isClickable = (currentLetter!=25)
//        }

    val letters2 = arrayOf(
        R.drawable.a,
        R.drawable.b,
        R.drawable.c,
        R.drawable.d,
        R.drawable.e,
        R.drawable.f,
        R.drawable.g,
        R.drawable.h,
        R.drawable.i,
        R.drawable.j,
        R.drawable.k,
        R.drawable.l,
        R.drawable.m,
        R.drawable.n,
        R.drawable.o,
        R.drawable.p,
        R.drawable.q,
        R.drawable.r,
        R.drawable.s,
        R.drawable.t,
        R.drawable.u,
        R.drawable.v,
        R.drawable.w,
        R.drawable.x,
        R.drawable.y,
        R.drawable.z,
    )

    fun goToA(view: View) {
        val img = findViewById<GifImageView>(R.id.currentLetter).apply {
            setImageResource(R.drawable.a)
            currentLetter=0
        }
    }

    fun goToZ(view: View) {
        val img = findViewById<GifImageView>(R.id.currentLetter).apply {
            setImageResource(R.drawable.z)
            currentLetter=25
        }

    }

    fun goToNext(view: View) {
        val img = findViewById<GifImageView>(R.id.currentLetter).apply {
            setImageResource(letters2[++currentLetter])
        }
    }

    fun goToPrev(view: View) {
        val img = findViewById<GifImageView>(R.id.currentLetter).apply {
            setImageResource(letters2[--currentLetter])
        }
    }
}