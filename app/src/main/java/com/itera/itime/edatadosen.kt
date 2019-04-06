package com.itera.itime

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.edatadosen.*

class edatadosen: Fragment(){
    lateinit var ref: DatabaseReference

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return LayoutInflater.from(container?.context).inflate(R.layout.edatadosen, container, false)
        ref = FirebaseDatabase.getInstance().getReference("DATADOSEN")
        btnSavedatadosen.setOnClickListener {
            savedata()
        }
    }

    private fun savedata(){
        val namadosen = inputnamadosen.text.toString()
        val dosen = inputdosen.text.toString()

        val user = fDataDosenFB(namadosen, dosen)
        val userId = ref.push().key.toString()

        ref.child(userId).setValue(user).addOnCompleteListener {
            inputnamadosen.setText("")
            inputdosen.setText("")
        }
    }
}