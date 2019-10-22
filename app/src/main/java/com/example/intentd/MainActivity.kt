package com.example.intentd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var nim: EditText = findViewById(R.id.nim_a)
        var nama: EditText = findViewById(R.id.nama_b)
        var nilai: EditText = findViewById(R.id.nilai_c)


        btn_proses.setOnClickListener{

            intent = Intent(this, Activity_2 ::class.java)
            intent.putExtra("nim",nim.getText())
            intent.putExtra("nama",nama.getText())
            intent.putExtra("nilai",nilai.getText())
            startActivity(intent)
        }

    }
}