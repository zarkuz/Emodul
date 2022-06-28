package id.ac.ittelkompwt.emodul3.konten.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import id.ac.ittelkompwt.emodul3.MainActivity
import id.ac.ittelkompwt.emodul3.R
import kotlinx.android.synthetic.main.activity_main.*

class SoalLimaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soal_lima)


        val pilihanA: RadioButton = findViewById(R.id.btn_quiz_a)
        val pilihanB: RadioButton = findViewById(R.id.btn_quiz_b)
        val pilihanC: RadioButton = findViewById(R.id.btn_quiz_c)
        val pilihanD: RadioButton = findViewById(R.id.btn_quiz_d)
        val btn_submit: Button = findViewById(R.id.btn_quiz_submit)
        var skor:Int = intent.getStringExtra("skor").toString().toInt()
        btn_submit.setOnClickListener {
            val intent = Intent(this, SoalEnamActivity::class.java)
            if (pilihanB.isChecked){
                skor++
            }
            intent.putExtra("skor", skor.toString())
            startActivity(intent)
        }

        btn_myhome.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    override fun onBackPressed() {
    }
}