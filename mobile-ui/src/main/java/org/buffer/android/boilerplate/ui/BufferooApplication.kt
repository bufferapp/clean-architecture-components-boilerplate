package org.buffer.android.boilerplate.ui

import android.support.v4.BuildConfig
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import org.buffer.android.boilerplate.ui.injection.DaggerApplicationComponent
import timber.log.Timber

class BufferooApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerApplicationComponent.builder().application(this).build()
    }

    override fun onCreate() {
        super.onCreate()
        setupTimber()
    }

    private fun setupTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

}
