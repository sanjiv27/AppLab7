package com.example.applab7

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import com.example.applab7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etusername = findViewById<EditText>(R.id.et_user_name)
        val etpassword = findViewById<EditText>(R.id.et_password)
        val btnsubmit = findViewById<Button>(R.id.btn_submit)

        btnsubmit.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val username = etusername.text.toString()
            intent.putExtra("username", username)
            startActivity(intent)
        }
    }
}