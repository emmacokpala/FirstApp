package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextButton : Button = findViewById(R.id.button)
        val image : ImageView = findViewById(R.id.imageView)
        val background : ConstraintLayout = findViewById(R.id.currentLayout)
        val recipient : TextView = findViewById(R.id.textView)
        val text1 : TextView = findViewById(R.id.textView3)

        image.visibility = View.INVISIBLE

        nextButton.setOnClickListener {
            nextButton.text = getString(R.string.sender)
            image.visibility = View.VISIBLE
            background.setBackgroundColor(resources.getColor(R.color.limegreen))
            text1.visibility = View.INVISIBLE
            recipient.visibility = View.INVISIBLE
            nextButton.visibility = View.INVISIBLE


        }







    }
}