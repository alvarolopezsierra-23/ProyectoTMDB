package com.movieapp.tmdb_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class MovieDto {

    private String title;

    @JsonProperty("poster_path")
    private String poster;
    
    @JsonProperty("vote_average")
    private Double rating;

    @JsonProperty("release_ReleaseDate")
    private Date releaseDate;

    public MovieDto() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
