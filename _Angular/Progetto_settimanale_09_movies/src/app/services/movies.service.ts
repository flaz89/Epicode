import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { Movies } from '../model/movies.interface';
import { HttpClient } from '@angular/common/http';
import { Favourites } from '../model/favourites.interface';


@Injectable({
  providedIn: 'root'
})
export class MoviesService {

  baseUrl = environment.baseURL;

  constructor( private http:HttpClient) { }

  getMovies() {
    return this.http.get<Movies[]>(this.baseUrl + "movies-popular");
  }

  addFavourites(fav:Favourites) {
    return this.http.post<Favourites>(this.baseUrl + "favorites", fav);
  }

  removeFavourites(removeFav:number) {
    return this.http.delete(this.baseUrl + "favorites/" + removeFav);
  }

  getFavourites(userId: number) {
    return this.http.get<Favourites[]>(this.baseUrl+ "favorites?userId=" + userId);
  }

  movieDetail(movieId: number) {
    return this.http.get<Movies>(this.baseUrl + "movies-popular/" + movieId);
  }

}
