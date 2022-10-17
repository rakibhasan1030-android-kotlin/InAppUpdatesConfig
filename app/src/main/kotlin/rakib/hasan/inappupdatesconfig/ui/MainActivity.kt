package rakib.hasan.inappupdatesconfig.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.play.core.appupdate.AppUpdateManagerFactory
import rakib.hasan.inappupdatesconfig.R
import rakib.hasan.inappupdatesconfig.databinding.ActivityMainBinding
import rakib.hasan.inappupdatesconfig.in_app_update.UpdateManager

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var updateManager : UpdateManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        updateManager = UpdateManager(this)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        updateManager.onActivityResult(requestCode,resultCode, data)
    }

    override fun onResume() {
        super.onResume()
        updateManager.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
        updateManager.onDestroy()
    }

}