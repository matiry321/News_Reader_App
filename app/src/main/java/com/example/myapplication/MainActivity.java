package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerview;
    private Adapter_class adapter;
    private Object ModelClass;
    private ArrayList<ModelClass> aa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerview = findViewById(R.id.recyclerview);
        aa = new ArrayList();
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://uniqueandrocode.000webhostapp.com/hiren/retrofit/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        PostEndPoint endPoint = retrofit.create(PostEndPoint.class);
        Call<List<ModelClass>> call = endPoint.getNews();
        call.enqueue(new Callback<List<ModelClass>>() {
            @Override
            public void onResponse(Call<List<ModelClass>> call, Response<List<ModelClass>> response)
            {
                aa= (ArrayList<com.example.myapplication.ModelClass>) response.body();
                adapter=new Adapter_class(aa,MainActivity.this);
                recyclerview.setAdapter(adapter);
            }

          /*  private void loadDataList(List<com.example.myapplication.ModelClass> body) {
                recyclerview = findViewById(R.id.recyclerview);
                adapter = new Adapter_class(aa,MainActivity.this);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
                recyclerview.setLayoutManager(layoutManager);
                recyclerview.setAdapter(adapter);
            }*/

            @Override
            public void onFailure(Call<List<ModelClass>> call, Throwable t) {
                t.printStackTrace();
            }
        });




    }
}