package kr.co.tjoeun.library_20200718

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        callBtn.setOnClickListner {


            val phoneNumUri = Uri.parse("tel:${phoneNumTxt.text}")
            val phoneIntent =
        }

        goToPhotoViewBtn.setOnClickListener {

            val myIntent = Intent(mContext, ProfilePhotoActivity::class.java)
            startActivity(myIntent)

        }

    }

    override fun setValues() {

        val imageUrl = ""

        Glide.with(mContext).load(imageUrl).into(profileImg)

    }


}