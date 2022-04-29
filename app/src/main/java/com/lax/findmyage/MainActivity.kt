package com.lax.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun BuClickEvent(view:View){
        val userDOB:String=findViewById<EditText>(R.id.etDOB).text.toString()
        if (userDOB.toInt()>=2023){
            findViewById<TextView>(R.id.tvyourage).text="Invalid input"
            return
        }
        val year:Int=Calendar.getInstance().get(Calendar.YEAR)
        val MyAge = year-userDOB.toInt()
        findViewById<TextView>(R.id.tvyourage).text="Your age is $MyAge"
    }
}