package com.example.retrofitremv.data;

import com.example.retrofitremv.pojo.PostModel;

import java.sql.ClientInfoStatus;
import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PostClient {
    private static final String BASE_URL ="https://jsonplaceholder.typicode.com/";
    private Postinterface postinterface;
    private static PostClient INSETANCE;
    public PostClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).build();
        postinterface = retrofit.create(Postinterface.class);
    }

    public static PostClient getINSETANCE() {
        if(null==INSETANCE){
            INSETANCE =new PostClient();
        }
        return INSETANCE;
    }
    public Call<List<PostModel>> getPosts(){
        return postinterface.getPosts();
    }
}
