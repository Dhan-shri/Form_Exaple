package com.example.sampleexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

            val intent = intent

            val email = intent.getStringExtra("email")
            val name = intent.getStringExtra("name")
            val phone = intent.getStringExtra("phone")
            val city = intent.getStringExtra("city")

            val email1 = findViewById<TextView>(R.id.Email)
            val name1 = findViewById<TextView>(R.id.name)
            val phone1 = findViewById<TextView>(R.id.phone)
            val city1 = findViewById<TextView>(R.id.city)


            email1.text = "email :- "+email.toString()
            name1.text =  "Name :- "+name.toString()
            phone1.text = "Phone no :- "+phone.toString()
            city1.text=  "city name :- "+city.toString()

        val butback = findViewById<Button>(R.id.butback)
        butback.setOnClickListener{
            val intent= Intent(this@NextActivity,MainActivity::class.java)
            startActivity(intent)
        }


    }
}