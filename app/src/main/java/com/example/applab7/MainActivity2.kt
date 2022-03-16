package com.example.applab7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val name = intent.getStringExtra("username")
        Log.d("myTag", name.toString())
        if(name.toString().trim().isNotEmpty() ||
            name.toString().trim().isNotBlank()) {
            val helloText = findViewById<TextView>(R.id.hello_text)
            Log.d("myTag", helloText.toString())
            Log.d("myTag", "hello $name")
            helloText.text = "Hello $name !!"
        }


        val typeofmenu = resources.getStringArray(R.array.type_of_menu)
        val spinner1 = findViewById<Spinner>(R.id.spinner_type_of_menu)
        if(spinner1!=null){
            val adapter = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, typeofmenu)
            spinner1.adapter = adapter
        }

        val drinks = resources.getStringArray(R.array.drinks)
        val spinner2 = findViewById<Spinner>(R.id.spinner_drinks)
        if(spinner2!=null){
            val adapter = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, drinks)
            spinner2.adapter = adapter
        }

        val starters = resources.getStringArray(R.array.starters)
        val spinner3 = findViewById<Spinner>(R.id.spinner_starters)
        if(spinner3!=null){
            val adapter = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, starters)
            spinner3.adapter = adapter
        }

        val maindish = resources.getStringArray(R.array.Main_dish)
        val spinner4 = findViewById<Spinner>(R.id.spinner_main_dish)
        if(spinner4!=null){
            val adapter = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, maindish)
            spinner4.adapter = adapter
        }

        val deserts = resources.getStringArray(R.array.Deserts)
        val spinner5 = findViewById<Spinner>(R.id.spinner_deserts)
        if(spinner5!=null){
            val adapter = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, deserts)
            spinner5.adapter = adapter
        }
    }
}