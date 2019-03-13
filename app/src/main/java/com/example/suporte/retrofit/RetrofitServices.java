package com.example.suporte.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitServices {

    String BASE_URL = "http://dummy.restapiexample.com/api/v1/";
    @GET("employees")
    Call<Empresa> listFuncionarios();
}
