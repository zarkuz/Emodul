package id.ac.ittelkompwt.emodul3.konten.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import id.ac.ittelkompwt.emodul3.MainActivity
import id.ac.ittelkompwt.emodul3.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.btn_myhome
import kotlinx.android.synthetic.main.activity_soal_satu.*

class SoalDelapanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soal_delapan)


        val pilihanA: RadioButton = findViewById(R.id.btn_quiz_a)
        val pilihanB: RadioButton = findViewById(R.id.btn_quiz_b)
        val pilihanC: RadioButton = findViewById(R.id.btn_quiz_c)
        val pilihanD: RadioButton = findViewById(R.id.btn_quiz_d)



        val bundles = intent.extras
        var status =0
        if (bundles?.getString("s8").toString()=="a"){
            pilihanA.isChecked=true
            status=1
        } else if (bundles?.getString("s8").toString()=="b") {
            pilihanB.isChecked=true
        } else if (bundles?.getString("s8").toString()=="c") {
            pilihanC.isChecked=true
        } else if (bundles?.getString("s8").toString()=="d") {
            pilihanD.isChecked=true
        }

        var skor = bundles?.getString("ts").toString().toInt()
        btn_quiz_forward.setOnClickListener {
            var jawaban = '0'
            val intent = Intent(this, SoalSembilanActivity::class.java)
            if (pilihanA.isChecked){
                skor = skor - status +1
                jawaban = 'a'
            } else if (pilihanB.isChecked) {
                skor = skor - status
                jawaban = 'b'
            } else if (pilihanC.isChecked) {
                skor = skor - status
                jawaban = 'c'
            } else if (pilihanD.isChecked) {
                skor = skor - status
                jawaban = 'd'
            }
            val bundle = Bundle()
            //Bundle Soal
            bundle.putString("s1", bundles?.getString("s1").toString())
            bundle.putString("s2",bundles?.getString("s2").toString())
            bundle.putString("s3",bundles?.getString("s3").toString())
            bundle.putString("s4",bundles?.getString("s4").toString())
            bundle.putString("s5",bundles?.getString("s5").toString())
            bundle.putString("s6",bundles?.getString("s6").toString())
            bundle.putString("s7",bundles?.getString("s7").toString())
            bundle.putString("s8",jawaban.toString())
            bundle.putString("s9",bundles?.getString("s9").toString())
            bundle.putString("s10",bundles?.getString("s10").toString())
            bundle.putString("s11",bundles?.getString("s11").toString())
            bundle.putString("s12",bundles?.getString("s12").toString())
            bundle.putString("s13",bundles?.getString("s13").toString())
            bundle.putString("s14",bundles?.getString("s14").toString())
            bundle.putString("s15",bundles?.getString("s15").toString())
            bundle.putString("ts",skor.toString())
            intent.putExtras(bundle)


            startActivity(intent)
        }

        btn_quiz_back.setOnClickListener {
            var jawaban = '0'
            val intent = Intent(this, SoalTujuhActivity::class.java)
            if (pilihanA.isChecked){
                skor = skor - status +1
                jawaban = 'a'
            } else if (pilihanB.isChecked) {
                skor = skor - status
                jawaban = 'b'
            } else if (pilihanC.isChecked) {
                skor = skor - status
                jawaban = 'c'
            } else if (pilihanD.isChecked) {
                skor = skor - status
                jawaban = 'd'
            }
            val bundle = Bundle()
            //Bundle Soal
            bundle.putString("s1", bundles?.getString("s1").toString())
            bundle.putString("s2",bundles?.getString("s2").toString())
            bundle.putString("s3",bundles?.getString("s3").toString())
            bundle.putString("s4",bundles?.getString("s4").toString())
            bundle.putString("s5",bundles?.getString("s5").toString())
            bundle.putString("s6",bundles?.getString("s6").toString())
            bundle.putString("s7",bundles?.getString("s7").toString())
            bundle.putString("s8",jawaban.toString())
            bundle.putString("s9",bundles?.getString("s9").toString())
            bundle.putString("s10",bundles?.getString("s10").toString())
            bundle.putString("s11",bundles?.getString("s11").toString())
            bundle.putString("s12",bundles?.getString("s12").toString())
            bundle.putString("s13",bundles?.getString("s13").toString())
            bundle.putString("s14",bundles?.getString("s14").toString())
            bundle.putString("s15",bundles?.getString("s15").toString())
            bundle.putString("ts",skor.toString())
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