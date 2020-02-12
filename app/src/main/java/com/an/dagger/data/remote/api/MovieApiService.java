package com.an.dagger.data.remote.api;


import com.an.dagger.data.remote.model.MovieApiResponse;
import io.reactivex.Observable;
import retrofit2.http.GET;

public interface MovieApiService {

    @GET("movie/popular?api_key=0aba4f721d8337287b06a15824fe55c4&language=en-US&region=US&page=1")
    Observable<MovieApiResponse> fetchMovies();
}
