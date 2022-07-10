package id.ac.ittelkompwt.emodul3.konten

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import id.ac.ittelkompwt.emodul3.MainActivity
import id.ac.ittelkompwt.emodul3.R
import id.ac.ittelkompwt.emodul3.konten.quiz.SoalSatuActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_quiz.*
import kotlinx.android.synthetic.main.activity_quiz.btn_myhome

class QuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        btn_quiz_submit.setOnClickListener {
            val bundle = Bundle()
            val intent = Intent(this, SoalSatuActivity::class.java)
            //Bundle Soal
            bundle.putString("s1","0")
            bundle.putString("s2","0")
            bundle.putString("s3","0")
            bundle.putString("s4","0")
            bundle.putString("s5","0")
            bundle.putString("s6","0")
            bundle.putString("s7","0")
            bundle.putString("s8","0")
            bundle.putString("s9","0")
            bundle.putString("s10","0")
            bundle.putString("s11","0")
            bundle.putString("s12","0")
            bundle.putString("s13","0")
            bundle.putString("s14","0")
            bundle.putString("s15","0")
            bundle.putString("ts","0")

            //Bundle Jawaban
            bundle.putString("a1","a")
            bundle.putString("a2","c")
            bundle.putString("a3","d")
            bundle.putString("a4","a")
            bundle.putString("a5","b")
            bundle.putString("a6","d")
            bundle.putString("a7","d")
            bundle.putString("a8","a")
            bundle.putString("a9","b")
            bundle.putString("a10","c")
            bundle.putString("a11","c")
            bundle.putString("a12","c")
            bundle.putString("a13","b")
            bundle.putString("a14","b")
            bundle.putString("a15","a")

            intent.putExtras(bundle)

            startActivity(intent)
        }
        btn_myhome.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    override fun onBackPressed() {

    }
}