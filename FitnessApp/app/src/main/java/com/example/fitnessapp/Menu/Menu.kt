package com.example.fitnessapp.Menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.fitnessapp.AddExercise.AddExercise
import com.example.fitnessapp.AllExercise.AllExercises
import com.example.fitnessapp.MainActivity
import com.example.fitnessapp.Modele.Exercise
import com.example.fitnessapp.R
import com.example.fitnessapp.RunTraining.RunTraining

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val buttonClickAddExercise = findViewById<ImageButton>(R.id.buttonAddExcercise)
        buttonClickAddExercise.setOnClickListener {
            val intent = Intent(this, AddExercise::class.java)
            startActivity(intent)
        }

        val buttonClickBack = findViewById<ImageButton>(R.id.buttonBack)
            buttonClickBack.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }

        val buttonRunTraining = findViewById<ImageButton>(R.id.buttonRunTraining)
        buttonRunTraining.setOnClickListener {
            val intent = Intent(this, RunTraining::class.java)
            startActivity(intent)
        }


        val buttonClickAllExercises = findViewById<ImageButton>(R.id.buttonAllExcercise)
        buttonClickAllExercises.setOnClickListener {
            val intent = Intent(this, AllExercises::class.java)
            startActivity(intent)
        }
    }
}


