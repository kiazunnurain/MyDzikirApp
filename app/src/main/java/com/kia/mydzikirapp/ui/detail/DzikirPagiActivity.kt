package com.kia.mydzikirapp.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kia.mydzikirapp.R
import com.kia.mydzikirapp.adapter.DzikirDoaAdapter
import com.kia.mydzikirapp.model.DataDzikirDoa

class DzikirPagiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_dzikir_pagi)

        val rvDzikirPagi = findViewById<RecyclerView>(R.id.rv_dzikir_pagi)
        rvDzikirPagi.layoutManager = LinearLayoutManager(this)
        rvDzikirPagi.adapter = DzikirDoaAdapter(DataDzikirDoa.listDzikirPagi)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}