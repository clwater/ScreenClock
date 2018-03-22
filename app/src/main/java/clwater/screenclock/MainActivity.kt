package clwater.screenclock

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import android.opengl.ETC1.getWidth
import android.content.Context.WINDOW_SERVICE
import android.view.WindowManager
import android.opengl.ETC1.getHeight
import android.view.ViewTreeObserver





class MainActivity : AppCompatActivity() {

    lateinit var context : Context
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        context = this

        clockText.setText("123")

        Log.d("gzb" , "" + clockText.scaleX)
        clockText.scaleX =10.5F
        clockText.scaleY = 10.5F



        val wm = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        val screenWidth = wm.defaultDisplay.width
        Log.d("gzb03" , "screenWidth" + screenWidth)
        Log.d("gzb03" , "clockText.width" + clockText.measuredWidth)
    }


}
