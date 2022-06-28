package id.ac.ittelkompwt.emodul3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import id.ac.ittelkompwt.emodul3.konten.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        id_main_profil.setOnClickListener {
            startActivity(Intent(this, ProfilActivity::class.java))
        }
        id_main_modul.setOnClickListener {
            startActivity(Intent(this, ModulActivity::class.java))
        }
        id_main_glosarium.setOnClickListener {
            startActivity(Intent(this, GlosariumActivity::class.java))
        }
        id_main_dapus.setOnClickListener {
            startActivity(Intent(this, DaftarPustakaActivity::class.java))
        }
        id_main_quiz.setOnClickListener {
            startActivity(Intent(this, QuizActivity::class.java))
        }
        id_main_tujuan.setOnClickListener {
            startActivity(Intent(this, TujuanActivity::class.java))
        }
        btn_myhome.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    override fun onBackPressed() {

    }
}