package org.buffer.android.boilerplate.ui.injection.module

import android.app.Application
import android.arch.lifecycle.ViewModelProvider
import android.arch.persistence.room.Room
import android.content.Context
import dagger.Binds
import dagger.Module
import dagger.Provides
import org.buffer.android.boilerplate.cache.BufferooCacheImpl
import org.buffer.android.boilerplate.cache.PreferencesHelper
import org.buffer.android.boilerplate.cache.db.BufferoosDatabase
import org.buffer.android.boilerplate.cache.mapper.BufferooEntityMapper
import org.buffer.android.boilerplate.data.BufferooDataRepository
import org.buffer.android.boilerplate.data.executor.JobExecutor
import org.buffer.android.boilerplate.data.mapper.BufferooMapper
import org.buffer.android.boilerplate.data.repository.BufferooCache
import org.buffer.android.boilerplate.data.repository.BufferooRemote
import org.buffer.android.boilerplate.data.source.BufferooDataStoreFactory
import org.buffer.android.boilerplate.domain.executor.PostExecutionThread
import org.buffer.android.boilerplate.domain.executor.ThreadExecutor
import org.buffer.android.boilerplate.domain.repository.BufferooRepository
import org.buffer.android.boilerplate.remote.BufferooRemoteImpl
import org.buffer.android.boilerplate.remote.BufferooService
import org.buffer.android.boilerplate.remote.BufferooServiceFactory
import org.buffer.android.boilerplate.ui.BuildConfig
import org.buffer.android.boilerplate.ui.UiThread
import org.buffer.android.boilerplate.ui.injection.scopes.PerApplication

/**
 * Module used to provide dependencies at an application-level.
 */
@Module
abstract class ApplicationModule {

    @Binds
    abstract fun bindContext(application: Application): Context
}
