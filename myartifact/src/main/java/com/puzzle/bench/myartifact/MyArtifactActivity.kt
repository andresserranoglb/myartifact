package com.puzzle.bench.myartifact

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MyArtifactActivity : AppCompatActivity() {

    companion object {
        fun newIntent(context: Context): Intent {
            val intent = Intent(context, MyArtifactActivity::class.java)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_myartifact)
    }
}
