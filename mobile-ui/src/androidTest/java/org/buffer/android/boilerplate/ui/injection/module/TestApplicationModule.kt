package org.buffer.android.boilerplate.ui.injection.module

import android.app.Application
import android.content.Context
import com.nhaarman.mockito_kotlin.mock
import dagger.Binds
import dagger.Module
import dagger.Provides
import org.buffer.android.boilerplate.cache.PreferencesHelper
import org.buffer.android.boilerplate.data.executor.JobExecutor
import org.buffer.android.boilerplate.data.repository.BufferooCache
import org.buffer.android.boilerplate.data.repository.BufferooRemote
import org.buffer.android.boilerplate.domain.executor.PostExecutionThread
import org.buffer.android.boilerplate.domain.executor.ThreadExecutor
import org.buffer.android.boilerplate.domain.repository.BufferooRepository
import org.buffer.android.boilerplate.remote.BufferooService
import org.buffer.android.boilerplate.ui.UiThread
import org.buffer.android.boilerplate.ui.injection.scopes.PerApplication

@Module
abstract class TestApplicationModule {

    @Binds
    abstract fun bindContext(application: Application): Context
}