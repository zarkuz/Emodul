package id.ac.ittelkompwt.emodul3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        btn_splash_mulai.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}