package me.gilo.flix.data;


import me.gilo.flix.data.body.LoginBody;
import me.gilo.flix.data.response.ApiResponse;
import me.gilo.flix.data.response.LoginResponse;
import me.gilo.flix.models.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface API {

    @POST("login")
    @Headers({"Content-Type:application/json"})
    Call<LoginResponse> login(
            @Body LoginBody data
    );

    @POST("register")
    @Headers({"Content-Type:application/json"})
    Call<ApiResponse> register(
            @Body User data
    );

}