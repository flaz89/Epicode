import { Component, OnInit } from '@angular/core';
import { environment } from 'src/environments/environment';
import { Favourites } from 'src/app/model/favourites.interface';
import { AuthService } from 'src/app/auth/auth.service';
import { AuthData } from 'src/app/model/auth-data.interface';
import { Movies } from 'src/app/model/movies.interface';
import { MoviesService } from 'src/app/services/movies.service';


@Component({
  selector: 'app-favourites',
  templateUrl: './favourites.component.html',
  styleUrls: ['./favourites.component.scss']
})
export class FavouritesComponent implements OnInit {


  constructor(private autSrv: AuthService, private movieSrv:MoviesService) { }

  baseURL = environment.baseURL;
  user!:AuthData;
  favMovies!:Favourites[];
  favMoviesToShow:Movies[] = [];



  showFav() {
    this.favMovies.forEach((movie)=> {
      if(movie.movieId) {
        this.movieSrv.movieDetail(movie.movieId).subscribe((movie)=>{
          this.favMoviesToShow.push(movie);
        })
      }
    })
  }

  ngOnInit(): void {

    const userData = localStorage.getItem("user");
    if (userData) {
      this.user = JSON.parse(userData);
      //this.getLikesArr(this.user.user.id);
    }
    setTimeout(()=>{
      this.movieSrv.getFavourites(this.user.user.id).subscribe((likes:Favourites[])=>{
        this.favMovies = likes;
        this.showFav();
        console.log(this.favMoviesToShow);
        console.log(this.favMovies);

      })
    },1000)

  }

}
