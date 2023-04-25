package com.example.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fitnessapp.Menu.Menu

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //buttonStart.setOnClicklistener{
          //  goToMenuActivity()
        //}

    }

    private fun goToMenuActivity() {
        val activityGoToMenu = Intent(applicationContext, Menu::class.java)
        startActivity(activityGoToMenu)
    }
}