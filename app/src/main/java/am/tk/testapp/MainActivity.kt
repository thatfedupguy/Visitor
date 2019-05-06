package am.tk.testapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import com.camerakit.CameraKitView
import kotlinx.android.synthetic.main.activity_main.*
import android.os.Environment.getExternalStorageDirectory
import android.util.Log
import android.view.View
import java.io.File
import java.io.FileOutputStream


class MainActivity : AppCompatActivity() {

    val TAG : String = "MainActivity"

    var cameraKitView : CameraKitView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cameraKitView = findViewById(R.id.camera)
        image_button.setOnClickListener {
            val captureIntent = Intent(this@MainActivity, captureActivity::class.java)
            startActivity(captureIntent)
            finish()
        }
    }

}
