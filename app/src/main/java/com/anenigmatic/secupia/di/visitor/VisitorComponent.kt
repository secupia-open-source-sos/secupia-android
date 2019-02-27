package com.anenigmatic.secupia.di.visitor

import com.anenigmatic.secupia.screens.visitors.core.VisitorListViewModelFactory
import dagger.Subcomponent

@Subcomponent(modules = [])
interface VisitorComponent {

    fun inject(factory: VisitorListViewModelFactory)
}