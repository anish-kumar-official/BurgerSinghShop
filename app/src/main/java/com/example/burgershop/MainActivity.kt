package com.example.burgershop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnOrder.setOnClickListener {
            val vegId = rgVeg.checkedRadioButtonId
            val veg = findViewById<RadioButton>(vegId)
            val NonvegId = rgNonveg.checkedRadioButtonId
            val Nonveg = findViewById<RadioButton>(NonvegId)
            val cheese = cbCheese.isChecked
            val egg = cbEgg.isChecked
            val mayo = cbMayo.isChecked
            val ketchup = cbKetchup.isChecked

            var result = "You have ordered a Big bada wala Burger With "+
                    "${veg.text} & ${Nonveg.text}"+
                    (if(cheese) "\ncheese" else "")+
                    (if(egg) "\nEgg" else "")+
                    (if(mayo) "\nMayo" else "")+
                    (if(ketchup) "\nKetchup" else "")

            tvResult.text = result.toString()
        }
    }
}