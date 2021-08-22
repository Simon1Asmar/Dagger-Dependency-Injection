package com.example.android.dagger

import com.example.android.dagger.storage.FakeStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module

@Module
abstract class TestStorageModule{
    //Makes Dagger provide FakeStorage when a type is requested
    @Binds
    abstract fun provideStorage(storage: FakeStorage):Storage
}