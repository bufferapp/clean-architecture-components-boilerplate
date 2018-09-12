package org.buffer.android.boilerplate.ui.injection.module

import dagger.Binds
import dagger.Module
import org.buffer.android.boilerplate.data.BufferooDataRepository
import org.buffer.android.boilerplate.data.executor.JobExecutor
import org.buffer.android.boilerplate.domain.executor.ThreadExecutor
import org.buffer.android.boilerplate.domain.repository.BufferooRepository

@Module
abstract class DataModule {

    @Binds
    abstract fun bindBufferooRepository(bufferooDataRepository: BufferooDataRepository): BufferooRepository

    @Binds
    abstract fun bindThreadExecutor(jobExecutor: JobExecutor): ThreadExecutor
}