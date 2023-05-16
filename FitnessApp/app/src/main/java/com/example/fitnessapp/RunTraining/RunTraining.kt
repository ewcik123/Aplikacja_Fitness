package com.example.fitnessapp.RunTraining

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
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
            startTimer()
        }

        val buttonClickStop = findViewById<Button>(R.id.stopButton)
        buttonClickStop.setOnClickListener {
            stopTimer()
        }

        val buttonClickClear = findViewById<Button>(R.id.clearButton)
        buttonClickClear.setOnClickListener {
            clearTimer()
        }

        val buttonAddMinute = findViewById<Button>(R.id.addMinuteButton)
        buttonAddMinute.setOnClickListener {
            addMinuteToTimer()
        }

        val buttonSubstractMinute = findViewById<Button>(R.id.substractMinuteButton)
        buttonSubstractMinute.setOnClickListener {
            substractMinuteToTimer()
        }

        val button15 = findViewById<Button>(R.id.button15s)
        button15.setOnClickListener {
            clearTimer()
            set15()
        }
        val button30 = findViewById<Button>(R.id.button30s)
        button30.setOnClickListener {
            clearTimer()
            set30()
        }

        val button1 = findViewById<Button>(R.id.button1min)
        button1.setOnClickListener {
            clearTimer()

        }



    }


    private fun startTimer(){
        countDownTimer = object: CountDownTimer(timeLeft.toLong(),1000){
            override fun onTick(millisUntilFinished: Long) {
                timeLeft = millisUntilFinished.toInt()
                updateCountdownText()
            }

           override fun onFinish(){
                isTimerRunning = false
                updateButtons()
            }
        }
        countDownTimer.start()
        isTimerRunning = true
        updateButtons()
    }
    private fun updateCountdownText(){
        val minutes  =(timeLeft/1000)/60
        val seconds =(timeLeft/1000) % 60
        val timeLeftFormated = String.format("%02d:%02d",minutes,seconds)
        val countdownText = findViewById<TextView>(R.id.countdownText)
        countdownText.text = timeLeftFormated

    }

    private fun updateButtons()
    {
        if( isTimerRunning )
        {
            findViewById<Button>(R.id.startButton).isEnabled = false
            findViewById<Button>(R.id.stopButton).isEnabled = true
            findViewById<Button>(R.id.clearButton).isEnabled = false
            findViewById<Button>(R.id.addMinuteButton).isEnabled = false
            findViewById<Button>(R.id.substractMinuteButton).isEnabled = false
            findViewById<Button>(R.id.button15s).isEnabled = false
            findViewById<Button>(R.id.button30s).isEnabled = false
            findViewById<Button>(R.id.button1min).isEnabled = false
        }
        else
        {
            findViewById<Button>(R.id.startButton).isEnabled = true
            findViewById<Button>(R.id.stopButton).isEnabled = false
            findViewById<Button>(R.id.clearButton).isEnabled = true
            findViewById<Button>(R.id.addMinuteButton).isEnabled = true
            findViewById<Button>(R.id.substractMinuteButton).isEnabled = true
            findViewById<Button>(R.id.button15s).isEnabled = true
            findViewById<Button>(R.id.button30s).isEnabled = true
            findViewById<Button>(R.id.button1min).isEnabled = true
        }
    }
    private fun stopTimer()
    {
        countDownTimer.cancel()
        isTimerRunning = false
        updateButtons()
    }

    private fun clearTimer()
    {
        timeLeft = 60000
        updateCountdownText()
        isTimerRunning = false
        updateButtons()
    }
    private fun  addMinuteToTimer()
    {
        timeLeft +=60000
        updateCountdownText()
        updateButtons()

    }
    private fun substractMinuteToTimer()
    {
        timeLeft -=60000
        if(timeLeft<0){
            timeLeft = 0
        }
        updateCountdownText()
        updateButtons()
    }


    private fun set15()
    {
        val timeLeftFormated = String.format("%02d:%02d",0,15)
        val countdownText = findViewById<TextView>(R.id.countdownText)
        countdownText.text = timeLeftFormated
        timeLeft = 15000

    }

    private fun set30()
    {
        val timeLeftFormated = String.format("%02d:%02d",0,30)
        val countdownText = findViewById<TextView>(R.id.countdownText)
        countdownText.text = timeLeftFormated
        timeLeft = 30000

    }


}