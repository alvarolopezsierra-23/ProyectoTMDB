import React from "react";
import "../styles/MovieCard.css";

function MovieCard({ movie }) {
  const posterUrl = movie.poster_path
    ? `https://image.tmdb.org/t/p/w300${movie.poster_path}`
    : "https://via.placeholder.com/300x450?text=No+Image";

  return (
    <div className="movie-card">
      <img src={posterUrl} alt={movie.original_title} className="movie-poster" />
      <div className="movie-info">
        <h3 className="movie-title">{movie.title}</h3>
        <p className="movie-rating">⭐ {movie.vote_average}</p>
        <p className="movie-release">{movie.release_date}</p>
      </div>
    </div>
  );
}

export default MovieCard;
