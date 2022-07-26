package com.example.constraintlayout

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners(){
        val boxOneTV = findViewById<TextView>(R.id.box1)
        val boxTwoTV: TextView = findViewById(R.id.boxTwo)
        val boxThreeTV = findViewById<TextView>(R.id.BoxThree)
        val boxFourTV = findViewById<TextView>(R.id.BoxFour)
        val boxFiveTV = findViewById<TextView>(R.id.BoxFive)

        val clickableViews: List<View> =
            listOf(
                boxOneTV,boxTwoTV,boxThreeTV,boxFourTV,boxFiveTV
            )

        for(item in clickableViews){
            item.setOnClickListener { makecolored(it) }
        }
    }

    private fun makecolored(view:View){
        when (view.id){
            R.id.box1 -> view.setBackgroundColor(Color.RED)
            R.id.boxTwo -> view.setBackgroundColor(Color.BLUE)
            R.id.BoxThree -> view.setBackgroundColor(Color.CYAN)
            R.id.BoxFour -> view.setBackgroundColor(Color.MAGENTA)
            R.id.BoxFive -> view.setBackgroundColor(Color.GREEN)
            else -> view.setBackgroundColor(Color.GRAY)

        }
    }
}