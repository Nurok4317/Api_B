package com.example.api_b.remote_data;

import com.example.api_b.models.ModelDo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DoApi {
    @GET("api/activity")
    Call<ModelDo> getActivities();

    @GET("/api/activity/{key}")
    Call<ModelDo> getActivitiesByKey(
            @Query("key") String key);

    @GET("/api/activity?price")
    Call<ModelDo> getActivitiesByPrice(
            @Query("price") double price);

    @GET("/api/activity?link")
    Call<ModelDo> getActivitiesByLink(
            @Query("link") String link);

    @GET("/api/activity?type")
    Call<ModelDo> getActivitiesByType(
            @Query("type") String type);

    @GET("/api/activity?accessibility")
    Call<ModelDo> getActivitiesByAccessibility(
            @Query("accessibility") String accessibility);
}