
package com.movieapp.tmdb_api.dto;

import java.util.List;

public class TmdbMovieResponse {

    private Integer page;
    private List<MovieDto> results;

    public TmdbMovieResponse() {
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public List<MovieDto> getResults() {
        return results;
    }

    public void setResults(List<MovieDto> results) {
        this.results = results;
    }
}


