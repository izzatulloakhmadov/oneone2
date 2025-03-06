package com.example.oneone

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        

        val regstat=findViewById<TextView>(R.id.reges)
        regstat.setOnClickListener{
            val intent=Intent(this,signup::class.java)
            startActivity(intent)
        }

        val loginbutton=findViewById<Button>(R.id.loginbutton)
        loginbutton.setOnClickListener{
            val intent=Intent(this,LOGINB::class.java)
            startActivity(intent)
        }

    }
}