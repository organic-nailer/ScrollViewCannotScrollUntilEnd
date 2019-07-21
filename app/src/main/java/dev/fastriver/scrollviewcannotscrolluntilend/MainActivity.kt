package dev.fastriver.scrollviewcannotscrolluntilend

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lbt = findViewById(R.id.leftButton) as AppCompatButton
        val rbt = findViewById(R.id.rightButton) as AppCompatButton

        lbt.setOnClickListener {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.container, WrongScroll.newInstance())
            transaction.commit()
        }
        rbt.setOnClickListener {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.container, RightScroll.newInstance())
            transaction.commit()
        }
    }
}
