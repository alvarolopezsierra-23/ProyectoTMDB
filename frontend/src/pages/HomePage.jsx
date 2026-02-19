import { useEffect, useState } from "react";
import MovieCard from "../components/MovieCard";
import "../styles/HomePage.css";

function HomePage() {
  const [movies, setMovies] = useState([]);
  const [category, setCategory] = useState("top-rated");

  useEffect(() => {
    fetch(`http://localhost:8080/films/${category}`)
      .then(res => res.json())
      .then(setMovies)
      .catch(console.error);
  }, [category]);

  const getTitle = () => {
    if (category === "top-rated") return "Top Rated Movies";
    if (category === "now-playing") return "Now Playing";
    return "Movies";
  };

  return (
    <div className="home-container">

      {/* MENU */}
      <div className="menu">
        <button
          className={category === "top-rated" ? "active" : ""}
          onClick={() => setCategory("top-rated")}
        >
          Top Rated
        </button>

        <button
          className={category === "now-playing" ? "active" : ""}
          onClick={() => setCategory("now-playing")}
        >
          Now Playing
        </button>
      </div>

      <h1 className="home-title">{getTitle()}</h1>

      <div className="movies-grid">
        {movies.map(movie => (
          <MovieCard key={movie.id} movie={movie} />
        ))}
      </div>

    </div>
  );
}

export default HomePage;
