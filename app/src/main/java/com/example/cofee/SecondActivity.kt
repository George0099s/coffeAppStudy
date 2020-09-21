package com.example.cofee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.cofee.databinding.SecondActivityBinding
import kotlinx.android.synthetic.main.second_activity.view.*

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: SecondActivityBinding
    private val ints = arrayListOf(1, 2, 3, 4, 5, 5, 6)
    private var ints1 = ArrayList<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SecondActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        for (i in 0 until 100)
        ints1.add(i)

        binding.root.list.apply {
            adapter =
                ArrayAdapter<Int>(this@SecondActivity, android.R.layout.simple_list_item_1, ints1)
        }
    }
}