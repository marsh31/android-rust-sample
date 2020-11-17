package xyz.wonder_wonder.android.rust_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

object HelloWorld {
    external fun hello(input: String?): String?

    init {
        System.loadLibrary("rust")
    }
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var text_view = findViewById<android.widget.TextView>(R.id.text_view)
        text_view.setText(HelloWorld.hello("Rust"))
    }
}