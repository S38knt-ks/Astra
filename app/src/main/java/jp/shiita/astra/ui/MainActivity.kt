package jp.shiita.astra.ui

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import jp.shiita.astra.R

class MainActivity : DaggerAppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}