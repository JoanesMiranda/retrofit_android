package com.example.suporte.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitServices {

    String BASE_URL = "http://dummy.restapiexample.com/api/v1/";
    @GET("employees")
    Call<List<Funcionarios>> listFuncionarios();
}
