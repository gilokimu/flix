package me.gilo.flix.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import me.gilo.flix.MainActivity;
import me.gilo.flix.ui.home.HomeActivity;
import me.gilo.flix.ui.user.onboarding.SignInActivity;
import me.gilo.flix.ui.user.onboarding.SignUpActivity;

/**
 * Created by amrro <amr.elghobary@gmail.com> on 7/22/17.
 * <p>
 * Injects {@link android.app.Activity}s
 */

@Module
abstract class ActivitiesModule {

    @ContributesAndroidInjector
    abstract MainActivity contributesMainActivity();

    @ContributesAndroidInjector
    abstract HomeActivity contributesHomeActivity();

    @ContributesAndroidInjector
    abstract SignInActivity contributesSignInActivity();

    @ContributesAndroidInjector
    abstract SignUpActivity contributesSignUpActivity();

}
