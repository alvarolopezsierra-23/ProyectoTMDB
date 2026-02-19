package com.movieapp.tmdb_api.service;

import com.movieapp.tmdb_api.component.TmdbClient;
import com.movieapp.tmdb_api.dto.MovieDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {

    private final TmdbClient tmdbClient;

    public FilmService(TmdbClient tmdbClient) {
        this.tmdbClient = tmdbClient;
    }

    public List<MovieDto> findMovies(String query) {
        return tmdbClient.searchMovie(query);
    }

    public List<MovieDto> findTopRatedMovies() {
        return tmdbClient.searchTopRatedMovie();
    }
}

