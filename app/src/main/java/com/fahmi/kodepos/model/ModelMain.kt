package com.fahmi.kodepos.model

import io.realm.RealmObject
import java.io.Serializable


open class ModelMain() : RealmObject(), Serializable {

    var strProvinsi: String? = null
    var strKabupaten: String? = null
    var strKecamatan: String? = null
    var strKelurahan: String? = null
    var strKodePos: String? = null

}