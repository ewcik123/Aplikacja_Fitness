package com.example.fitnessapp.RunTraining

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.ImageButton
import com.example.fitnessapp.Menu.Menu
import com.example.fitnessapp.R

class RunTraining : AppCompatActivity() {

    private lateinit var countDownTimer: CountDownTimer
    private var timeLeft = 60000
    private var isTimerRunning = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_run_training)

        val buttonClickStart = findViewById<Button>(R.id.startButton)
        buttonClickStart.setOnClickListener {
          //  startTimer()

        }





    }


    //private fun startTimer(){
        //countDownTimer = object: CountDownTimer(timeLeft.toLong(),1000){
           // override fun onTick(millisUntilFinished: Long) {
               // timeLeft = millisUntilFinished.toInt()
               // updateCountdownText()
           // }

           // override fun onFinish(){
           //     isTimerRunning = false
             //   updateButtons()
           // }
      //  }
       // countDownTimer.start()
       // isTimerRunning = true
       // updateButtons()
    //}
}