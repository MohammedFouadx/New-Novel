package sim.coder.novelheaders

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_readBook.setOnClickListener {
            var i = Intent(Intent(this, BookPage::class.java))
            startActivity(i)

            Toast.makeText(this, "جيل يقراء", Toast.LENGTH_LONG).show()
        }


    }}
