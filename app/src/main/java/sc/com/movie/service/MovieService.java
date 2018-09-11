package sc.com.movie.service;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.Path;
import sc.com.movie.model.Movie;

import retrofit2.http.GET;

public interface MovieService {

    @GET("/search/movie")
    Call<List<Movie>> getMovies(@Header("Authorization") String apiKey);

    @GET("/movie/{id}")
    Call<Movie> getMovie(@Header("Authorization") String apiKey, @Path("id") int movieId);

}
