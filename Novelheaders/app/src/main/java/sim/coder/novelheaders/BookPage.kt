package sim.coder.novelheaders

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_book_page.*




class BookPage : AppCompatActivity() {
      

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_page)

        pdf.fromAsset("novel.pdf")
            .password(null)
            .defaultPage(0)
            .enableSwipe(true)
            .swipeHorizontal(false)
            .enableDoubletap(true)
            .enableAnnotationRendering(true)
            .cha
            .load()


    }

}
