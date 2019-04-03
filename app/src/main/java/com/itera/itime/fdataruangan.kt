package com.itera.itime

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.fdataruangan.*

class fdataruangan: Fragment(){
    lateinit var ref: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
            inputnamaruangan.setText("")
            inputgedung.setText("")
        }
    }
}