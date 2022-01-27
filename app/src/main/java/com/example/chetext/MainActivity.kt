package com.example.chetext

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ma = ""
        var piep = ""
        var piec = ""
        var j = ""
        var ml = ""

        val maslo = findViewById<CheckBox>(R.id.checkBox)
        val jajka = findViewById<CheckBox>(R.id.checkBox2)
        val pieprz = findViewById<CheckBox>(R.id.checkBox3)
        val pieczywo = findViewById<CheckBox>(R.id.checkBox4)
        val mleko = findViewById<CheckBox>(R.id.checkBox5)
        val text = findViewById<TextView>(R.id.textView)

        findViewById<Button>(R.id.button).setOnClickListener {
            if (mleko.isChecked) {
                ml = "mleko "
            }
            else{
                ml = ""
            }
            if (maslo.isChecked) {
                ma = "maslo "
            }
            else{
                ma = ""
            }
            if (pieprz.isChecked) {
                piep = "pieprz "
            }
            else{
                piep = ""
            }
            if (pieczywo.isChecked) {
                piec = "pieczywo "
            }
            else{
                piec = ""
            }

            if (jajka.isChecked) {
                j = "jajka "
            }
            else{
                j = ""
            }

            text.setText("Wybrałeś $ml$j$piep$piec$ma")
        }
    }
}