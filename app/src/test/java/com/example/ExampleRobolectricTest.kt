package com.example

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.example.data.repository.ChemistryQuestionsData
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [34])
class ExampleRobolectricTest {

    @Test
    fun `read string from context`() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val appName = context.getString(R.string.app_name)
        assertEquals("রসায়ন পর্যায়বৃত্ত", appName)
    }

    @Test
    fun `verify all 28 question types exist`() {
        assertEquals(28, ChemistryQuestionsData.typeInfoList.size)
        assertTrue(ChemistryQuestionsData.allMCQQuestions.isNotEmpty())
        assertTrue(ChemistryQuestionsData.allWrittenQuestions.isNotEmpty())
    }
}
