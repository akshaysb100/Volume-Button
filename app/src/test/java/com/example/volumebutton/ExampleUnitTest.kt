package com.example.volumebutton

import android.media.MediaPlayer
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class ExampleUnitTest {
    lateinit var mediaPlayer: MediaPlayer

    lateinit var mainActivity: MainActivity

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun ensureListViewIsPresent() {
        mainActivity.onCreate(null)
//        verify(mainActivity).setContentView(R.layout.activity_main)
    }
}
