package org.buffer.android.boilerplate.ui.injection.module

import com.nhaarman.mockito_kotlin.mock
import dagger.Binds
import dagger.Module
import dagger.Provides
import org.buffer.android.boilerplate.data.executor.JobExecutor
import org.buffer.android.boilerplate.domain.executor.ThreadExecutor
import org.buffer.android.boilerplate.domain.repository.BufferooRepository
import javax.inject.Singleton

@Module
abstract class TestDataModule {

    @Module
    companion object {

        @Provides
        @JvmStatic
        @Singleton
        fun provideBufferooRepository(): BufferooRepository {
            return mock()
        }
    }

    @Binds
    abstract fun bindThreadExecutor(jobExecutor: JobExecutor): ThreadExecutor
}
