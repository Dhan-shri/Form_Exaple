package com.example.sampleexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextemail = findViewById<EditText>(R.id.editTextemail)
        val editTextName =findViewById<EditText>(R.id.editTextName)
        val editTextphone = findViewById<EditText>(R.id.editTextphone)
        val editTextcity = findViewById<EditText>(R.id.editTextcity)



        val butfirst = findViewById<Button>(R.id.butfirst)
        butfirst.setOnClickListener{
            val intent = Intent(this@MainActivity,NextActivity::class.java)


            val email = editTextemail.text.toString()
            val name = editTextName.text.toString()
            val phonenu = editTextphone.text.toString()
            val city = editTextcity.text.toString()


            intent.putExtra("email",email)
            intent.putExtra("name",name)
            intent.putExtra("phone",phonenu)
            intent.putExtra("city",city)

            startActivity(intent)

        }
    }
}
