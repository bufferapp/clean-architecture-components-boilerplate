package org.buffer.android.boilerplate.ui.injection.module

import android.app.Application
import android.arch.persistence.room.Room
import com.nhaarman.mockito_kotlin.mock
import dagger.Module
import dagger.Provides
import org.buffer.android.boilerplate.cache.PreferencesHelper
import org.buffer.android.boilerplate.cache.db.BufferoosDatabase
import org.buffer.android.boilerplate.data.repository.BufferooCache
import javax.inject.Singleton

@Module
object TestCacheModule {

    @Provides
    @JvmStatic
    fun provideBufferoosDatabase(application: Application): BufferoosDatabase {
        return Room.databaseBuilder(
                application.applicationContext,
                BufferoosDatabase::class.java, "bufferoos.db")
                .build()
    }

    @Provides
    @JvmStatic
    @Singleton
    fun provideBufferooCache(): BufferooCache {
        return mock()
    }

    @Provides
    @JvmStatic
    @Singleton
    fun providePreferencesHelper(): PreferencesHelper {
        return mock()
    }

}