package com.example.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.view.Menu
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.fitnessapp.Menu.Menu
import com.example.fitnessapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var username: EditText
    lateinit var  password: EditText
    lateinit var button2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener(View.OnClickListener {
            if (binding.username.text.toString() == "user" && binding.password.text.toString() == "1234") {
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
                goToMenuActivity()
            } else {
                Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun goToMenuActivity(){
        val activityGoToMenu = Intent(applicationContext, Menu::class.java)
        startActivity(activityGoToMenu)
    }

}

