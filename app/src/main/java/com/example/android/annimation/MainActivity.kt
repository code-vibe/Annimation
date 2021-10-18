package com.example.android.annimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var my_Icon:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        my_Icon = findViewById(R.id.my_Icon)

        my_Icon.alpha = 0f
        my_Icon.scaleX = 0f
        my_Icon.scaleY = 0f

        my_Icon.animate().apply {
            duration= 4000 //1second
            alpha(1f)
            scaleX(1f)
            scaleY(1f)

            withEndAction(Runnable {
                Toast.makeText(applicationContext, "Wow", Toast.LENGTH_SHORT).show()
            })
        }
    }
}