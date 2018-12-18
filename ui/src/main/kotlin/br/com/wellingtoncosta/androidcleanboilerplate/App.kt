package br.com.wellingtoncosta.androidcleanboilerplate

import android.app.Application
import com.github.kittinunf.fuel.core.FuelManager

/**
 * @author Wellington Costa on 17/12/2018.
 **/
class App : Application() {

    override fun onCreate() {
        super.onCreate()

        FuelManager.instance.basePath = "https://my-collections-api.herokuapp.com"

        // TODO configure Koin modules
    }

}