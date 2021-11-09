package com.example.colorgame

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
 //Completed
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        activateListeners()
    }

    private fun activateListeners(){
        val box1 = findViewById<TextView>(R.id.box1)
        val box2 = findViewById<TextView>(R.id.box2)
        val box3 = findViewById<TextView>(R.id.box3)
        val box4 = findViewById<TextView>(R.id.box4)
        val box5 = findViewById<TextView>(R.id.box5)
        val clickableBoxes : List<View> = listOf(box1,box2,box3,box4,box5)

        for(box in clickableBoxes){
         box.setOnClickListener{ colorChange(it)}
        }
    }
    private fun colorChange(view : View) = when(view.id){
        R.id.box1 -> view.setBackgroundColor(Color.RED)
        R.id.box2 -> view.setBackgroundColor(Color.BLUE)
        R.id.box3 -> view.setBackgroundColor(Color.GREEN)
        R.id.box4 -> view.setBackgroundColor(Color.MAGENTA)
        R.id.box5 -> view.setBackgroundColor(Color.CYAN)

        else -> view.setBackgroundColor(Color.DKGRAY)

    }

}