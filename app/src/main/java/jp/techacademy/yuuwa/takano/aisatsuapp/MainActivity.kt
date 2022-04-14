package jp.techacademy.yuuwa.takano.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        watch.setOnClickListener(this)
    }

    override fun onClick(v: View) {
            showTimePickerDialog()

    }

     fun showTimePickerDialog() {


        var timePickerDialog = TimePickerDialog(

                this,
                TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                    if (hour < 2 && minute <59) {
                        hi.text = "こんばんは"
                    }else if (hour < 10 && minute <59) {
                        hi.text = "おはよう"
                    }else if (hour < 17 && minute <59) {
                        hi.text = "こんにちは"
                    }else if (hour < 23 && minute <59){
                        hi.text = "こんばんは"
                    }
                },
                13, 0, true)
        timePickerDialog.show()


    }}