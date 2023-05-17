package dev.abdujabbor.recyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.abdujabbor.recyclerview.adpaters.RvAdapter
import dev.abdujabbor.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var list:ArrayList<String>
    lateinit var rvAdapter: RvAdapter

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        list = ArrayList()
        for (i in 0..40){
            list.add("Item $i")
        }
        rvAdapter = RvAdapter(list)
        binding.rv.adapter = rvAdapter
        binding.savebtn.setOnClickListener {
            val text = binding.edittext.text.toString()
            list.add(text)
            rvAdapter.notifyDataSetChanged()
        }
        setContentView(binding.root)
    }
}