package com.example.suporte.retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    public String TAG = " MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(RetrofitServices.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RetrofitServices mRetrofitServices = retrofit.create(RetrofitServices.class);
        Call<List<Funcionarios>> mEmpregados = mRetrofitServices.listFuncionarios();

        mEmpregados.enqueue(new Callback<List<Funcionarios>>() {
            @Override
            public void onResponse(Call<List<Funcionarios>> call, Response<List<Funcionarios>> response) {
                Log.w("AJ", Arrays.toString(response.body().toArray()));
            }

            @Override
            public void onFailure(Call<List<Funcionarios>> call, Throwable t) {

            }
        });

    }
}
