package com.example.android.dagger.registration

import com.example.android.dagger.di.ActivityScope
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import dagger.Subcomponent
import javax.inject.Inject
//classes annotated with @ActivityScope will have a unique instance in this component
@ActivityScope
@Subcomponent
interface RegistrationComponent{

    //factory to create instances of RegistrationComp..
    @Subcomponent.Factory
    interface Factory{
        fun create(): RegistrationComponent
    }

    fun inject(activity: RegistrationActivity)
    fun inject(fragment: EnterDetailsFragment)
    fun inject(fragment: TermsAndConditionsFragment)
}