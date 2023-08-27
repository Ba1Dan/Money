package com.example.money.core

sealed class LoadableData<out T> {

    data class Content<T>(val value: T) : LoadableData<T>()

    object Loading : LoadableData<Nothing>()

    object Initial : LoadableData<Nothing>()

    data class Error(val message: String) : LoadableData<Nothing>()
}


val <T> LoadableData<T>.isInitial: Boolean
    get() = this is LoadableData.Initial

val <T> LoadableData<T>.isLoading: Boolean
    get() = this is LoadableData.Loading

val <T> LoadableData<T>.isContent: Boolean
    get() = this is LoadableData.Content

val <T> LoadableData<T>.isError: Boolean
    get() = this is LoadableData.Error