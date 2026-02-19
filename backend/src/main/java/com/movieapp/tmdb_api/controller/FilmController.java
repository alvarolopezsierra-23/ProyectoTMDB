package com.movieapp.tmdb_api.controller;

import com.movieapp.tmdb_api.dto.MovieDto;
import com.movieapp.tmdb_api.service.FilmService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/films")
public class FilmController {

    private final FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<MovieDto>> search(@RequestParam String query) {
        return ResponseEntity.ok(filmService.findMovies(query));
    }

    @GetMapping("/top-rated")
    public ResponseEntity<List<MovieDto>> topRated() {
        return ResponseEntity.ok(filmService.findTopRatedMovies());
    }

    @GetMapping("/now-playing")
    public ResponseEntity<List<MovieDto>> nowPlaying() {
        return ResponseEntity.ok(filmService.findNowPlayingMovies());
    }
}
