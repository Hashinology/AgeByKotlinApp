package com.hashinology.agebykotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getAge(view: View) {
        val usrTyped = etAge.text.toString()
        val age = 2022 - usrTyped.toInt()

        if (age > -1){
            tvDisplay.text = age.toString()
        }else{
            tvDisplay.text = "Wrong Age"
        }

    }
}