package th.ac.kku.cis.mobileapp.cislist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import th.ac.kku.cis.mobileapp.cislist.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {

    private  lateinit var  binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone")
        val country = intent.getStringExtra("country")
        val university = intent.getStringExtra("university")
        val advisor = intent.getStringExtra("advisor")
        val imageId = intent.getIntExtra("imageId",R.drawable.a)

        binding.nameProfile.text = name
        binding.phoneProfile.text = phone
        binding.countryProfile.text = country
        binding.universityProfile.text = university
        binding.advisorProfile.text = advisor
        binding.profileImge.setImageResource(imageId)
    }
}