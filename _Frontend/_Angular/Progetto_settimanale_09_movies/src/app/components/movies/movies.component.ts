import { Component, OnInit } from '@angular/core';
import { MoviesService } from 'src/app/services/movies.service';
import { Movies } from 'src/app/model/movies.interface';
import { DomSanitizer, SafeResourceUrl } from '@angular/platform-browser';
import { Favourites } from 'src/app/model/favourites.interface';
import { AuthData } from 'src/app/model/auth-data.interface';


@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.scss']
})
export class MoviesComponent implements OnInit {
[x: string]: any;


constructor(private moviesSrv:MoviesService, private sanitizer: DomSanitizer) { }

  movies!:Movies[];
  cardExpanded:boolean = false;
  expandedIndex: number = -1;
  user!:AuthData;
  favMovies!:Favourites[];

  liked:boolean = false;




  getSafeVideoUrl(videoUrl: string): SafeResourceUrl {
    return this.sanitizer.bypassSecurityTrustResourceUrl(videoUrl);
  }


  expand(index: number) {
    if (this.expandedIndex === index) {
      this.expandedIndex = -1;
    } else {
      this.expandedIndex = index;
    }
  }

  toggleLike(event: Event, movie: Movies): void {
    event.stopPropagation();

    if (this.isLiked(movie.id)) {
      this.removeLike(movie.id);
    } else {
      this.addLike(movie.id);
    }
  }


  addLike(movieId:number):void {

    const fav:Favourites = {
      movieId: movieId,
      userId: this.user.user.id
    }

    this.moviesSrv.addFavourites(fav).subscribe(()=> {
      this.getLikesArr(this.user.user.id);
      console.log(this.favMovies);
      this.liked = true;
    });
  }

  removeLike(movieId: number): void {
    const idFavMovie = this.getIdFav(movieId);

    if (idFavMovie) {
      this.moviesSrv.removeFavourites(idFavMovie).subscribe(() => {
        this.favMovies = this.favMovies.filter((movie) => movie.id !== idFavMovie);
        this.liked = false;
      });
    }
  }

  getIdFav(movieFavId: number): number | undefined {
    const fav = this.favMovies.find((movie) => movie.movieId === movieFavId);
    return fav?.id;
}

  getLikesArr(userId:number) :void {
    this.moviesSrv.getFavourites(userId).subscribe((likes:Favourites[]) => {
      this.favMovies = likes;
    })
  }

  isLiked(movieId:number):boolean {
    console.log(this.favMovies);
    const isIn = this.favMovies.some((f) => f.movieId === movieId );
    console.log(isIn);
    return isIn;
  }



  ngOnInit(): void {
    this.moviesSrv.getMovies().subscribe((response:Movies[]) => {
      this.movies = response;
      console.log(this.movies);
    })

    const userData = localStorage.getItem("user");
    if (userData) {
      this.user = JSON.parse(userData);
      this.getLikesArr(this.user.user.id);
    }
  }

}
