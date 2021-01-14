package com.example.retrofitremv.data;

import com.example.retrofitremv.pojo.PostModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Postinterface {
    @GET("posts")
    public Call<List<PostModel>> getPosts();
}
