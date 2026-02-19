package com.movieapp.tmdb_api.component;

import com.movieapp.tmdb_api.dto.MovieDto;
import com.movieapp.tmdb_api.dto.TmdbMovieResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class TmdbClient {

    private final RestTemplate restTemplate;
    private final String apiKey;

    @Value("${tmdb.base-url}")
    private String baseUrl;

    public TmdbClient(RestTemplate restTemplate,
                      @Value("${tmdb.api.key}") String apiKey) {
        this.restTemplate = restTemplate;
        this.apiKey = apiKey;
    }

    public List<MovieDto> searchMovie(String query) {

        String url = baseUrl
                + "/search/movie?api_key=" + apiKey
                + "&query=" + query;

        TmdbMovieResponse response =
                restTemplate.getForObject(url, TmdbMovieResponse.class);

        return response.getResults();
    }

    public List<MovieDto> searchTopRatedMovie() {

        String url = baseUrl
                + "/movie/top_rated?api_key=" + apiKey;

        TmdbMovieResponse response =
                restTemplate.getForObject(url, TmdbMovieResponse.class);

        return response.getResults();
    }

    public List<MovieDto> searchNowPlayingMovies() {

        String url = baseUrl
                + "/movie/now_playing?api_key=" + apiKey;

        TmdbMovieResponse response =
                restTemplate.getForObject(url, TmdbMovieResponse.class);

        return response.getResults();
    }
}

