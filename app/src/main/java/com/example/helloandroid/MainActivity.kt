package com.example.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tvInfo: TextView //延迟初始化

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvInfo = findViewById(R.id.tvInfo)
        tvInfo.text = "Hello"

        var counter:Int=0

        val btnTest: Button =findViewById(R.id.btnTest)
        btnTest.setOnClickListener{
            counter++
            tvInfo.text="I'm clicked $counter"
        }

    }
}