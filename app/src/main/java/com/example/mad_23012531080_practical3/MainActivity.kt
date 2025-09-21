package com.example.mad_23012531080_practical3

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.net.URL

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    private lateinit var editurl: EditText
    private lateinit var phone: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        findViewById<Button>(R.id.button6).setOnClickListener {
            val loginintent = Intent(this, LoginActivity::class.java)
            startActivity(loginintent)
            }

        findViewById<Button>(R.id.button7).setOnClickListener {
            val url = editurl.text.toString()
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = android.net.Uri.parse(url)
            startActivity(intent)
        }
        findViewById<Button>(R.id.button).setOnClickListener {
            val phone = phone.text.toString()
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = android.net.Uri.parse("tel:$phone")
            startActivity(intent)

        }


    }
}


