import { useEffect, useState } from "react";
import MovieCard from "../components/MovieCard";
import "../styles/HomePage.css";

function HomePage() {
  const [movies, setMovies] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/films/top-rated")
      .then(res => res.json())
      .then(setMovies)
      .catch(console.error);
  }, []);

  return (
    <div className="home-container">
      <h1 className="home-title">Top Rated Movies</h1>
      <div className="movies-grid">
        {movies.map(movie => (
          <MovieCard key={movie.id} movie={movie} />
        ))}
      </div>
    </div>
  );
}

export default HomePage;
