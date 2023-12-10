package com.example.daggerusage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.internal.DaggerGenerated
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
     lateinit var cargo : Cargo
     @Inject
     lateinit var internet: Internet
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerAppComponent.builder().build().inject(this)
        // With dagger we can manage dependencies way better than this.
//        cargo = Cargo()
        cargo.sendCargo()
//        internet = Internet()
        internet.makeAnApplication()
        // consumer, component, module


    }
}