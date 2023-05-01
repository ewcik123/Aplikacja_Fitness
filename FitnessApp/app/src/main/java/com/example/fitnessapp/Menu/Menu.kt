package com.example.fitnessapp.Menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.fitnessapp.MainActivity
import com.example.fitnessapp.R

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

       // findViewById<Button>(R.id.buttonBack).setOnClickListener {
        //    goToMainActivity()
        //}

    }
    //private fun goToMainActivity() {
       // val activityGoMainActivity = Intent(applicationContext, MainActivity::class.java)
       // startActivity(activityGoMainActivity)
    //}
}


