package id.ac.ittelkompwt.emodul3.konten.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.ittelkompwt.emodul3.MainActivity
import id.ac.ittelkompwt.emodul3.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_quiz_hasil.*
import kotlinx.android.synthetic.main.activity_quiz_hasil.btn_myhome

class QuizHasilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_hasil)

        val bundles = intent.extras
        var skor:Double = bundles?.getString("ts").toString().toDouble()
        var nilai:Double = Math.round((skor/15.0)*1000.0)/10.0
        tv_hasilquiz_final.setText(nilai.toString())
        btn_quiz_home.setOnClickListener {
            startActivity(Intent(this, QuizHasilActivity::class.java))
        }

        btn_myhome.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    override fun onBackPressed() {
    }
}