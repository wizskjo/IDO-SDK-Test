package com.wizardlab.ido_sdk_test

import android.Manifest
import android.annotation.TargetApi
import android.app.Activity
import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ido.ble.BLEManager
import com.ido.ble.LocalDataManager
import java.util.*

/**
 * IDO_SDK_Test
 * Class: SplashActivity
 * Created by Wizardlab
 *
 * Description:
 */
class SplashActivity : Activity() {

    private val SDK_PERMISSION_REQUEST = 127

    private val permissionList: MutableList<String> = ArrayList()
    private var requestPermissionCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        permissionList.add(Manifest.permission.ACCESS_FINE_LOCATION)
        permissionList.add(Manifest.permission.ACCESS_COARSE_LOCATION)
        permissionList.add(Manifest.permission.WRITE_EXTERNAL_STORAGE)
        permissionList.add(Manifest.permission.READ_EXTERNAL_STORAGE)
        permissionList.add(Manifest.permission.BLUETOOTH_ADMIN)
        permissionList.add(Manifest.permission.BLUETOOTH)
        getPermission()
    }

    @TargetApi(23)
    private fun getPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && requestPermissionCount < 5) {
            if (permissionList.size != 0) {
                requestPermissionCount++
                requestPermissions(permissionList.toTypedArray(), SDK_PERMISSION_REQUEST)
            } else {
                initSDK()
                jumpNextPage()
            }
        } else {
            initSDK()
            jumpNextPage()
        }
    }

    private fun jumpNextPage() {
//        window.decorView.postDelayed({
//            if (LocalDataManager.isBind()) {
//                startActivity(Intent(this@SplashActivity, HomeActivity::class.java))
//            } else {
//                startActivity(Intent(this@SplashActivity, ScanDeviceActivity::class.java))
//            }
//            finish()
//        }, 500)

        window.decorView.postDelayed({
                startActivity(Intent(this@SplashActivity, ScanDeviceActivity::class.java))
            finish()
        }, 500)
    }

    private fun initSDK() {
        BLEManager.init()
    }

}