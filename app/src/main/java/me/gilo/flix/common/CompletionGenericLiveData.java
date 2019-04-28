package me.gilo.flix.common;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;


public final class CompletionGenericLiveData<T> extends LiveData<Resource<T>> implements OnCompleteListener<T> {


    public CompletionGenericLiveData() {
        setValue(new Resource<>(Status.LOADING));
    }

    @Override
    public final void onComplete(@NonNull Task<T> task) {
        if (task.isSuccessful()) {
            setValue(new Resource<T>(task.getResult()));
        } else {
            setValue(new Resource<>(task.getException()));
        }
    }
}

