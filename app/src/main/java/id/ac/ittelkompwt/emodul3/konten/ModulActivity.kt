package id.ac.ittelkompwt.emodul3.konten

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.ittelkompwt.emodul3.MainActivity
import id.ac.ittelkompwt.emodul3.R
import id.ac.ittelkompwt.emodul3.konten.modul.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_modul.*
import kotlinx.android.synthetic.main.activity_modul.btn_myhome

class ModulActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modul)
        btn_modul_11.setOnClickListener {
            startActivity(Intent(this, Modul11Activity::class.java))
        }
        btn_modul_12.setOnClickListener {
            startActivity(Intent(this, Modul12Activity::class.java))
        }
        btn_modul_13.setOnClickListener {
            startActivity(Intent(this, Modul13Activity::class.java))
        }
        btn_modul_21.setOnClickListener {
            startActivity(Intent(this, Modul21Activity::class.java))
        }
        btn_modul_22.setOnClickListener {
            startActivity(Intent(this, Modul22Activity::class.java))
        }
        btn_modul_23.setOnClickListener {
            startActivity(Intent(this, Modul23Activity::class.java))
        }
        btn_myhome.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        btn_modul_01.setOnClickListener {
            startActivity(Intent(this, ModulPengantarActivity::class.java))
        }
        btn_modul_02.setOnClickListener {
            startActivity(Intent(this, ModulKompetensiActivity::class.java))
        }
        btn_modul_03.setOnClickListener {
            startActivity(Intent(this, ModulRangkumanActivity::class.java))
        }
        btn_modul_04.setOnClickListener {
            startActivity(Intent(this, ModulLatihanActivity::class.java))
        }
        btn_modul_05.setOnClickListener {
            startActivity(Intent(this, DaftarPustakaActivity::class.java))
        }
    }
}