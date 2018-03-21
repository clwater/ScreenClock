package clwater.screenclock

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clockText.setText("123")

        Log.d("gzb" , "" + clockText.scaleX)
        clockText.scaleX = 2.5F
        clockText.scaleY = 2.5F
    }
}
