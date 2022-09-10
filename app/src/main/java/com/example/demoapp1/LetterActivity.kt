package com.example.demoapp1

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
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
    var queue = mutableListOf<Any>()
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

    override fun onBackPressed() {
        if (queue.isEmpty()) {
            super.onBackPressed()
        }
        else {
            if (queue.size==1) {
                val img = findViewById<GifImageView>(R.id.currentLetter).apply {
                    setImageResource(queue[0] as Int)
                }
                currentLetter = letters2.indexOf(queue[0] as Int)
                queue = mutableListOf<Any>()
                Toast.makeText(applicationContext, "In list: "+ queue, Toast.LENGTH_LONG).show()
            }
            else {
                val img = findViewById<GifImageView>(R.id.currentLetter).apply {
                    setImageResource(queue[queue.size-1] as Int)
                }
                currentLetter = letters2.indexOf(queue[queue.size-1] as Int)
                queue = queue.dropLast(1) as MutableList<Any>
                Toast.makeText(applicationContext, "In list: "+ queue, Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onRestart() {
        queue = mutableListOf<Any>()
        super.onRestart()
    }
    fun goToA(view: View) {
        queue.add(R.drawable.a)
        val img = findViewById<GifImageView>(R.id.currentLetter).apply {
            setImageResource(R.drawable.a)
            currentLetter=0
            Toast.makeText(applicationContext, "In list: "+ queue, Toast.LENGTH_LONG).show()
        }
    }

    fun goToZ(view: View) {
        queue.add(R.drawable.z)
        val img = findViewById<GifImageView>(R.id.currentLetter).apply {
            setImageResource(R.drawable.z)
            currentLetter=25
            Toast.makeText(applicationContext, "In list: "+ queue, Toast.LENGTH_LONG).show()
        }
    }

    fun goToNext(view: View) {
        queue.add(letters2[currentLetter])
        val img = findViewById<GifImageView>(R.id.currentLetter).apply {
            setImageResource(letters2[++currentLetter])
            Toast.makeText(applicationContext, "In list: "+ queue, Toast.LENGTH_LONG).show()
        }
    }

    fun goToPrev(view: View) {
        queue.add(letters2[currentLetter])
        val img = findViewById<GifImageView>(R.id.currentLetter).apply {
            setImageResource(letters2[--currentLetter])
            Toast.makeText(applicationContext, "In list: "+ queue, Toast.LENGTH_LONG).show()
        }
    }
}