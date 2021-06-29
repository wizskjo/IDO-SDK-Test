package com.wizardlab.ido_sdk_test

import android.app.Application
import android.content.Context
import com.ido.ble.BLEManager

/**
 * IDO_SDK_Test
 * Class: APP
 * Created by Wizardlab
 *
 * Description:
 */
class APP : Application() {
    override fun onCreate() {
        super.onCreate()
        application = this
        BLEManager.onApplicationCreate(this)
//        CrashHandler.getInstance().init(this)
//
//        // 添加facebookc插件
//        Stetho.initializeWithDefaults(this)
//
//        //百度地图
//        SDKInitializer.initialize(this)
//        SDKInitializer.setCoordType(CoordType.BD09LL)
    }

    companion object {
        private var application: Application? = null
        val appContext: Context
            get() = application!!.applicationContext
    }
}
