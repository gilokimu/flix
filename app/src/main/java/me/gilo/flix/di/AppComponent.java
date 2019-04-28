package me.gilo.flix.di;


import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;
import me.gilo.flix.StarterApp;

import javax.inject.Singleton;


@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        ViewModelModule.class,
        FirebaseModule.class,
        ActivitiesModule.class,
})
interface AppComponent extends AndroidInjector<DaggerApplication> {

    void inject(StarterApp app);

}
