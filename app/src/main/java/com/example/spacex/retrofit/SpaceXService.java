package com.example.spacex.retrofit;

import com.example.spacex.model.Launch;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SpaceXService {

    @GET("launches/past")
    Observable<List<Launch>> getData(
            @Query("sort") String sortBy,
            @Query("order") String orderBy,
            @Query("limit") int sizeLimit,
            @Query("offset") int offsetLimit
    );
}
