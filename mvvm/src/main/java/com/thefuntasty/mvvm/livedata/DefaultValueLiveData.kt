package com.thefuntasty.mvvm.livedata

import androidx.lifecycle.MutableLiveData

class DefaultValueLiveData<T : Any>(defaultValue: T) : MutableLiveData<T>() {

    init {
        value = defaultValue
    }

    override fun getValue(): T = super.getValue() ?: throw NullPointerException("Value is null")
}
