package id.ac.smpn8bks.ardiansyah.intentexample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.smpn8bks.ardiansyah.intentexample2.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val received = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)
        binding.tvReceived.text = received ?: "Tidak ada data diterima"

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}
