package com.example.volumebutton

import android.media.MediaPlayer
import androidx.test.filters.MediumTest
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@MediumTest
@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest {

    lateinit var mediaPlayer: MediaPlayer

    @Rule
//    var rule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Before
    fun setUp() {
    }

    @Test
    fun getMediaPlayer() {

    }

    @Test
    fun setMediaPlayer() {
    }

    @Test
    fun getAudioManager() {
    }

    @Test
    fun setAudioManager() {
    }

    @Test
    fun onCreate() {
    }

//    companion object {
//        @Deployment
//        fun createDeployment(): JavaArchive {
//            return ShrinkWrap.create(JavaArchive::class.java)
//                .addClass(MainActivity::class.java)
//                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml")
//        }
//    }
}
