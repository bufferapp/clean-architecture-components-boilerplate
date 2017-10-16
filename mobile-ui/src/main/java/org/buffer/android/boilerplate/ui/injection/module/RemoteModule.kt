package org.buffer.android.boilerplate.ui.injection.module

import dagger.Binds
import dagger.Module
import dagger.Provides
import org.buffer.android.boilerplate.data.repository.BufferooRemote
import org.buffer.android.boilerplate.remote.BufferooRemoteImpl
import org.buffer.android.boilerplate.remote.BufferooService
import org.buffer.android.boilerplate.remote.BufferooServiceFactory
import org.buffer.android.boilerplate.ui.BuildConfig

/**
 * Module that provides all dependencies from the repository package/layer.
 */
@Module
abstract class RemoteModule {

    /**
     * This companion object annotated as a module is necessary in order to provide dependencies
     * statically in case the wrapping module is an abstract class (to use binding)
     */
    @Module
    companion object {
        @Provides
        @JvmStatic
        fun provideBufferooService(): BufferooService {
            return BufferooServiceFactory.makeBuffeoorService(BuildConfig.DEBUG)
        }
    }

    @Binds
    abstract fun bindBufferooRemote(bufferooRemoteImpl: BufferooRemoteImpl): BufferooRemote
}