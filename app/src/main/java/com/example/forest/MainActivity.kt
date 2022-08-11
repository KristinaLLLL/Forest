package com.example.forest


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val test_lumber = Lumber(1, 50, 50, 3.0, 25)
        val stock: String
        //val txt: TextView = findViewById(R.id.stock)
        //txt.text = test_lumber.toString()
        val buttonLumber : Button = findViewById(R.id.lumberBut)
        buttonLumber.setOnClickListener{
            val intent = Intent(this, LumberActivity::class.java)
            startActivity(intent)
        }
        println("Пиломатериалы: $test_lumber")
    }
}