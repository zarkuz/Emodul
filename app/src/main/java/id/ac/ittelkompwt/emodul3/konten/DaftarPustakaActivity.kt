package id.ac.ittelkompwt.emodul3.konten

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.ittelkompwt.emodul3.MainActivity
import id.ac.ittelkompwt.emodul3.R
import kotlinx.android.synthetic.main.activity_main.*

class DaftarPustakaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_pustaka)

        btn_myhome.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}