package sc.com.movie.service;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import sc.com.movie.model.Movie;

public class MoviesServiceImpl {

    private static final String API_KEY = "43a7ea280d085bd0376e108680615c7f";

    public Call<List<Movie>> getMovies(String apiKey) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org/3/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MovieService movieService = retrofit.create(MovieService.class);

        return movieService.getMovies(API_KEY);
    }

    public Call<Movie> getMovie(String apiKey, int movieId) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org/3/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MovieService movieService = retrofit.create(MovieService.class);

        return movieService.getMovie(API_KEY, movieId);
    }
}
