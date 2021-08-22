package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.storage.SharedPreferencesStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module
import dagger.Provides

//Tells dagger this is a dagger module
@Module
abstract class StorageModule{

    /*
    //Makes dagger provide SharedPref... when a Storage type is requested
    @Binds
    abstract fun provideStorage(storage: SharedPreferencesStorage): Storage
    */

    @Provides
    fun provideStorage(context: Context): Storage{
        return SharedPreferencesStorage(context)
    }

}