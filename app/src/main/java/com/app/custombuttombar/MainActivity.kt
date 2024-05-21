package com.app.custombuttombar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.ScaleAnimation
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var selectedTab: Int = 1

        val homeLayout: LinearLayout = findViewById(R.id.homeLayout)
        val likeLayout: LinearLayout = findViewById(R.id.likeLayout)
        val notificationLayout: LinearLayout = findViewById(R.id.notificationLayout)
        val profileLayout: LinearLayout = findViewById(R.id.profileLayout)

        val homeImage: ImageView = findViewById(R.id.homeImage)
        val likeImage: ImageView = findViewById(R.id.likeImage)
        val notificationImage: ImageView = findViewById(R.id.notificationImage)
        val profileImage: ImageView = findViewById(R.id.profileImage)

        val homeTxt: TextView = findViewById(R.id.homeTxt)
        val likeTxt: TextView = findViewById(R.id.likeTxt)
        val notificationTxt: TextView = findViewById(R.id.notificationTxt)
        val profileTxt: TextView = findViewById(R.id.profileTxt)

        //set home fragment by default
        supportFragmentManager.beginTransaction()
            .setReorderingAllowed(true)
            .replace(R.id.fragmentContainer, HomeFragment::class.java, null)
            .commit()


        //Click en HomeLayout
        homeLayout.setOnClickListener{
            if (selectedTab != 1) {

                supportFragmentManager.beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragmentContainer, HomeFragment::class.java, null)
                    .commit()

                // unselect other tabs except home tab
                likeTxt.visibility = View.GONE
                notificationTxt.visibility = View.GONE
                profileTxt.visibility = View.GONE

                likeImage.setImageResource(R.drawable.like_icon)
                notificationImage.setImageResource(R.drawable.notifications_icon)
                profileImage.setImageResource(R.drawable.profile_icon)

                likeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent, null))
                notificationLayout.setBackgroundColor(resources.getColor(android.R.color.transparent, null))
                profileLayout.setBackgroundColor(resources.getColor(android.R.color.transparent, null))

                // select home tab
                homeTxt.visibility = View.VISIBLE
                homeImage.setImageResource(R.drawable.home_selected_icon)
                homeLayout.setBackgroundResource(R.drawable.round_back_home_100)

                //Create animation
                val scaleAnimation = ScaleAnimation(0.8f, 1.0f, 1.0f, 1.0f, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f)
                scaleAnimation.duration = 200
                scaleAnimation.fillAfter = true
                homeLayout.startAnimation(scaleAnimation)

                //Set 1st tab as selected tab
                selectedTab = 1

            }

        }

        //Click en likeLayout
        likeLayout.setOnClickListener{
            if (selectedTab != 2) {

                supportFragmentManager.beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragmentContainer, LikesFragment::class.java, null)
                    .commit()

                // unselect other tabs except like tab
                homeTxt.visibility = View.GONE
                notificationTxt.visibility = View.GONE
                profileTxt.visibility = View.GONE

                homeImage.setImageResource(R.drawable.home_icon)
                notificationImage.setImageResource(R.drawable.notifications_icon)
                profileImage.setImageResource(R.drawable.profile_icon)

                homeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent, null))
                notificationLayout.setBackgroundColor(resources.getColor(android.R.color.transparent, null))
                profileLayout.setBackgroundColor(resources.getColor(android.R.color.transparent, null))

                // select like tab
                likeTxt.visibility = View.VISIBLE
                likeImage.setImageResource(R.drawable.like_selected_icon)
                likeLayout.setBackgroundResource(R.drawable.round_back_like_100)

                //Create animation
                val scaleAnimation = ScaleAnimation(0.8f, 1.0f, 1.0f, 1.0f, Animation.RELATIVE_TO_SELF, 1.0f, Animation.RELATIVE_TO_SELF, 0.0f)
                scaleAnimation.duration = 200
                scaleAnimation.fillAfter = true
                likeLayout.startAnimation(scaleAnimation)

                //Set 1st tab as selected tab
                selectedTab = 2

            }
        }

        //Click en notificationLayout
        notificationLayout.setOnClickListener{

            supportFragmentManager.beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.fragmentContainer, NotificationFragment::class.java, null)
                .commit()

            if (selectedTab != 3) {
                // unselect other tabs except notification tab
                homeTxt.visibility = View.GONE
                likeTxt.visibility = View.GONE
                profileTxt.visibility = View.GONE

                homeImage.setImageResource(R.drawable.home_icon)
                likeImage.setImageResource(R.drawable.like_icon)
                profileImage.setImageResource(R.drawable.profile_icon)

                homeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent, null))
                likeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent, null))
                profileLayout.setBackgroundColor(resources.getColor(android.R.color.transparent, null))

                // select like tab
                notificationTxt.visibility = View.VISIBLE
                notificationImage.setImageResource(R.drawable.notifications_selected_icon)
                notificationLayout.setBackgroundResource(R.drawable.round_back_notification_100)

                //Create animation
                val scaleAnimation = ScaleAnimation(0.8f, 1.0f, 1.0f, 1.0f, Animation.RELATIVE_TO_SELF, 1.0f, Animation.RELATIVE_TO_SELF, 0.0f)
                scaleAnimation.duration = 200
                scaleAnimation.fillAfter = true
                notificationLayout.startAnimation(scaleAnimation)

                //Set 1st tab as selected tab
                selectedTab = 3

            }
        }

        //Click en profile Layout
        profileLayout.setOnClickListener{
            if (selectedTab != 4) {

                supportFragmentManager.beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragmentContainer, ProfileFragment::class.java, null)
                    .commit()

                // unselect other tabs except profile tab
                homeTxt.visibility = View.GONE
                likeTxt.visibility = View.GONE
                notificationTxt.visibility = View.GONE

                homeImage.setImageResource(R.drawable.home_icon)
                likeImage.setImageResource(R.drawable.like_icon)
                notificationImage.setImageResource(R.drawable.notifications_icon)

                homeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent, null))
                likeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent, null))
                notificationLayout.setBackgroundColor(resources.getColor(android.R.color.transparent, null))

                // select like tab
                profileTxt.visibility = View.VISIBLE
                profileImage.setImageResource(R.drawable.profile_selected_icon)
                profileLayout.setBackgroundResource(R.drawable.round_back_profile_100)

                //Create animation
                val scaleAnimation = ScaleAnimation(0.8f, 1.0f, 1.0f, 1.0f, Animation.RELATIVE_TO_SELF, 1.0f, Animation.RELATIVE_TO_SELF, 0.0f)
                scaleAnimation.duration = 200
                scaleAnimation.fillAfter = true
                profileLayout.startAnimation(scaleAnimation)

                //Set 1st tab as selected tab
                selectedTab = 4

            }
        }
    }
}