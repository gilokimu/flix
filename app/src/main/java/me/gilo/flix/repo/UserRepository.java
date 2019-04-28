package me.gilo.flix.repo;

import me.gilo.flix.common.CallBackLiveData;
import me.gilo.flix.data.API;
import me.gilo.flix.data.RestAdapter;
import me.gilo.flix.data.body.LoginBody;
import me.gilo.flix.data.response.ApiResponse;
import me.gilo.flix.data.response.LoginResponse;
import me.gilo.flix.models.User;

import javax.inject.Inject;


public class UserRepository{

    @Inject
    public UserRepository() {

    }

    public CallBackLiveData<LoginResponse> login(String username, String password) {
        final CallBackLiveData<LoginResponse> callBack = new CallBackLiveData();
        API apiService = RestAdapter.createAPI();
        apiService.login(new LoginBody(username, password)).enqueue(callBack);

        return callBack;
    }
    public CallBackLiveData<ApiResponse> register(User user) {
        final CallBackLiveData<ApiResponse> callBack = new CallBackLiveData();
        API apiService = RestAdapter.createAPI();
        apiService.register(user).enqueue(callBack);

        return callBack;
    }

}
