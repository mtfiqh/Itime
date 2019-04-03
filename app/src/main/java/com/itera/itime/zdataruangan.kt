package com.itera.itime

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.fdataruangan.*

class zdataruangan : AppCompatActivity() {
    lateinit var ref: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zdataruangan)
        ref = FirebaseDatabase.getInstance().getReference("USERS")

        btnSavedataruangan.setOnClickListener {
            savedata()
        }
    }

    private fun savedata(){
        val namagedung = inputnamaruangan.text.toString()
        val gedung = inputgedung.text.toString()

        val user = fDataRuanganFB(namagedung, gedung)
        val userId = ref.push().key.toString()

        ref.child(userId).setValue(user).addOnCompleteListener {
            Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
            inputnamaruangan.setText("")
            inputgedung.setText("")
        }
    }
}