package tw.edu.pu.s1092788.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txv: TextView = findViewById<TextView>(R.id.txv)
        //txv.text = "Hello tcyang"
        //TestDEV()
        //TestMaster()
        txv.text = "嗨，我是楊子青"

    }

}