export async function getTopRatedMovies() {
  const response = await fetch("http://localhost:8080/films/top-rated");

  if (!response.ok) {
    throw new Error("Error fetching movies");
  }

  return response.json();
}
