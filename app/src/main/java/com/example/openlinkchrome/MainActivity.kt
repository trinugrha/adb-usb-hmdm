package com.example.openlinkchrome

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast

class MainActivity : Activity() {

    companion object {
        private const val URL = "https://adb-hmdm.netlify.app/"
        private const val CHROME_PACKAGE = "com.android.chrome"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        openInChrome()
        finish()
    }

    private fun openInChrome() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(URL)).apply {
            addCategory(Intent.CATEGORY_BROWSABLE)
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }

        try {
            // Paksa buka lewat Chrome
            startActivity(Intent(intent).setPackage(CHROME_PACKAGE))
        } catch (e: ActivityNotFoundException) {
            // Chrome tidak terpasang: buka lewat browser default
            try {
                startActivity(intent)
                Toast.makeText(this, "Chrome tidak ditemukan, memakai browser lain", Toast.LENGTH_SHORT).show()
            } catch (e2: ActivityNotFoundException) {
                Toast.makeText(this, "Tidak ada browser yang terpasang", Toast.LENGTH_LONG).show()
            }
        }
    }
}
