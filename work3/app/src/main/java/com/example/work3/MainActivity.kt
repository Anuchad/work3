package com.example.work3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var number1 = number.text.toString().toInt()

        add.setOnClickListener {
            if(number1 in 0..8){
                number1 += 1
                number.setText(number1.toString())
            }else{
                Toast.makeText(applicationContext,"ไม่สามารถเพิ่มค่าได้แล้ว", Toast.LENGTH_SHORT).show()
            }
        }

        minus.setOnClickListener {
            if(number1 in 1..9){
                number1 -= 1
                number.setText(number1.toString())
            }else{
                Toast.makeText(applicationContext,"ไม่สามารถลดค่าได้แล้ว", Toast.LENGTH_SHORT).show()
            }
        }

        reset.setOnClickListener {
            number1 = 0
            number.setText(number1.toString())
        }


    }
}