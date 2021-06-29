package com.wizardlab.ido_sdk_test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ido.ble.BLEManager
import com.ido.ble.BLESpecialAPI
import com.ido.ble.bluetooth.device.BLEDevice
import com.ido.ble.callback.ScanCallBack
import java.util.*


class ScanDeviceActivity : AppCompatActivity() {

//    private val scanCallBack: ScanCallBack.ICallBack = object : ScanCallBack.ICallBack {
//        override fun onStart() {
//            setTitle(R.string.scanning)
//        }
//
//        override fun onFindDevice(device: BLEDevice) {
//            showList(device)
//            list.add(device)
//            Collections.sort(list)
//        }
//
//        override fun onScanFinished() {
//            if (title.toString() == getText(R.string.connect_state_ing)) {
//                title =
//                    getText(R.string.scan_finish).toString() + "/" + getText(R.string.connect_state_ing)
//            } else if (title.toString() == getText(R.string.connect_state_ok)) {
//            } else {
//                setTitle(R.string.scan_finish)
//            }
//            btnScan.setEnabled(true)
//            if (list.size == 0) {
//            }
//        }
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scan_device)

        BLESpecialAPI.statScanStatus(true)
//        BLEManager.registerScanCallBack(scanCallBack)
    }
}