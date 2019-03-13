package com.example.suporte.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

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
        Call<Empresa> mEmpregados = mRetrofitServices.listFuncionarios();

        mEmpregados.enqueue(new Callback<Empresa>() {
            @Override
            public void onResponse(Call<Empresa> call, Response<Empresa> response) {

                if(!response.isSuccessful()){
                    Log.d(TAG, "onResponse: error"+response.code());
                }else{
                    Empresa mEmpresa = response.body();
                    for(Funcionarios emp: mEmpresa.listFuncionarios){
                        Log.i(TAG,String.format("%s "+emp));
                    }
                }

            }

            @Override
            public void onFailure(Call<Empresa> call, Throwable t) {
                Log.d(TAG, "onFailure: "+t.getMessage());

            }
        });

    }
}
