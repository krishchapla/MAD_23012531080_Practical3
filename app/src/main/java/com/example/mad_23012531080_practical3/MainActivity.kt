package com.example.mad_23012531080_practical3

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.net.URL

private val Unit.ACTION_SHOW_ALARM: Any
    get() {
        TODO()
    }

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
        val dialButton: Button = findViewById(R.id.button)
        val webButton: Button = findViewById(R.id.button7)
        val gallerybutton:Button= findViewById(R.id.button3)
        val cambutton:Button = findViewById(R.id.button4)
        val alarmbutton:Button = findViewById(R.id.button5)

        dialButton.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:99999999") // Replace with desired number or leave empty
            }
            startActivity(dialIntent)
        }


        webButton.setOnClickListener {
            val webIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
            startActivity(webIntent)
        }

        gallerybutton.setOnClickListener {
            val galleryIntent = Intent(Intent.ACTION_VIEW).apply { type="image/*" }
            startActivity(galleryIntent)
          }
        cambutton.setOnClickListener {
            val cameraIntent = Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(cameraIntent)
        }
        alarmbutton.setOnClickListener {
            val alarmIntent = Intent(android.provider.AlarmClock.ACTION_SHOW_ALARMS)
            startActivity(alarmIntent)
        }


    }
}


