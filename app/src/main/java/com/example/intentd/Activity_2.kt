package com.example.intentd

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_2.*

class Activity_2 : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val bundle= intent.extras
        val nim = bundle?.get("nim")
        val nama = bundle?.get("nama")
        val nilaix = bundle?.get("nilai")
        var nilai = nilaix.toString()
        var nilaiy = nilai.toInt()

        if (nilaiy >= 80){
            keterangan.setText("A")
        }
        else if(nilaiy >= 60){
            keterangan.setText("B")
        }
        else if(nilaiy >= 40){
            keterangan.setText("C")
        }
        else if(nilaiy >= 20){
            keterangan.setText("D")
        }
        else{
            keterangan.setText("E")
        }
        nim_tampil.setText(""+nim)
        nama_tampil.setText(""+nama)
        nilai_tampil.setText(""+nilaix)

        button.setOnClickListener(){
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }


    }

}