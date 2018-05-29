/*
 *  Created by Oliinyk Volodymyr on 29.05.18 14:44
 *  Copyright (c) 2018 . All rights reserved.
 *  Last modified 29.05.18 14:42
 */

package com.shprot.example

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("com.shprot.easy.adapter", appContext.packageName)
    }
}
