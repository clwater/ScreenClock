package clwater.screenclock

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.clock_text.view.*

class ClockText : LinearLayout{

    constructor(context: Context) : super(context){
        initView()
    }
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs){
        initView()

    }

    fun initView(){
        LayoutInflater.from(context).inflate(R.layout.clock_text, this, true)
        //获取根布局对象
    }

    fun setText(text :String){
        textview_lastText.text = text
    }

    fun text(text :String){
        textview_lastText.text = text
    }
}