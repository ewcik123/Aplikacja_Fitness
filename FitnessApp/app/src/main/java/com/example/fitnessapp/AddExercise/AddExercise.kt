package com.example.fitnessapp.AddExercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.fitnessapp.MainActivity
import com.example.fitnessapp.Menu.Menu
import com.example.fitnessapp.R

class AddExercise : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_exercise)

        val buttonClickBack = findViewById<ImageButton>(R.id.buttonBack)
        buttonClickBack.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }




    }
}