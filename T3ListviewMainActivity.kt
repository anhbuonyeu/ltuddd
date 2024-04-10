package com.example.tuan3.tuan3

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tuan3.R

class T3ListviewMainActivity : AppCompatActivity() {
    var adapter: T3Adapter?=null
    var ls = ArrayList<T3Contact>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_t3_listview_main)
        var lv=findViewById<ListView>(R.id.t3Listview)

        ls.add(T3Contact("Nguyen Van A","29",R.drawable.android))
        ls.add(T3Contact("Nguyen Van A","29",R.drawable.android))
        ls.add(T3Contact("Nguyen Van A","29",R.drawable.android))
        ls.add(T3Contact("Nguyen Van A","29",R.drawable.android))
        ls.add(T3Contact("Nguyen Van A","29",R.drawable.android))
        ls.add(T3Contact("Nguyen Van A","29",R.drawable.android))

        adapter=T3Adapter(ls, this)
        lv!!.adapter=adapter

    }
}