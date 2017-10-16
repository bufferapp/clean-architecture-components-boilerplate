package org.buffer.android.boilerplate.ui.injection.module

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.MapKey
import dagger.Module
import dagger.multibindings.IntoMap
import org.buffer.android.boilerplate.presentation.ViewModelFactory
import org.buffer.android.boilerplate.presentation.browse.BrowseBufferoosViewModel
import kotlin.reflect.KClass

/**
 * Annotation class to identify view models by classname.
 */
@MustBeDocumented
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
annotation class ViewModelKey(val value: KClass<out ViewModel>)

/**
 * Module that provides all dependencies from the presentation package/layer.
 */
@Module
abstract class PresentationModule {
    @Binds
    @IntoMap
    @ViewModelKey(BrowseBufferoosViewModel::class)
    abstract fun bindBrowseBufferoosViewModel(viewModel: BrowseBufferoosViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}

