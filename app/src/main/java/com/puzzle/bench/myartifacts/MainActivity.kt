package com.puzzle.bench.myartifacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.puzzle.bench.myartifact.MyArtifactActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_navigate.setOnClickListener { startActivity(MyArtifactActivity.newIntent(this)) }

    }
}
