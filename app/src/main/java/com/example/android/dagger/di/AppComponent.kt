package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.login.LoginComponent
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.registration.RegistrationComponent
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import com.example.android.dagger.settings.SettingsActivity
import com.example.android.dagger.user.UserManager
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class, AppSubcomponents::class])
interface AppComponent{

    // factory to create instances of AppComp...
    @Component.Factory
    interface Factory{
        //With @BindsInstance, the context passed in will be available in the graph
        fun create(@BindsInstance context: Context): AppComponent
    }

    //Expose RegistrationComponent factory from the graph
    //for the Registration Activity to create instances of Reg..Comp..
    fun registrationComponent(): RegistrationComponent.Factory
    fun loginComponent(): LoginComponent.Factory
    fun userManager(): UserManager

    //Classes that can be injected by this component
    //fun inject(activity: RegistrationActivity)
    //fun inject(activity: MainActivity)
    //fun inject(fragment: EnterDetailsFragment)
    //fun inject(fragment: TermsAndConditionsFragment)
    //fun inject(activity: SettingsActivity)
}