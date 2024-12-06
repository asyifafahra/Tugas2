package com.asyifafahra.tugas2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var Username : TextView
    private lateinit var Password : TextView
    private lateinit var btnLogin : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        Username = findViewById(R.id.Username)
        Password = findViewById(R.id.Password)
        btnLogin = findViewById(R.id.btnLogin)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnLogin.setOnClickListener() {
            val username = Username.text.toString()
            val password = Password.text.toString()

            btnLogin.setOnClickListener() {
                val username = Username.text.toString()
                val password = Password.text.toString()

                if (username == "admin" && password == "123456") {
                    val intent4 = Intent(this@MainActivity,Page2::class.java)
                    startActivity(intent4)
                } else {
                    Toast.makeText(this, "username atau password salah", Toast.LENGTH_SHORT).show()
                }

            }

        }
    }
}