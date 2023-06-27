import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { Route, RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule, FormsModule} from '@angular/forms';
import { TokenInterceptor } from './auth/token.interceptor';
import { HTTP_INTERCEPTORS } from '@angular/common/http';



import { AppComponent } from './app.component';
import { MoviesComponent } from './components/movies/movies.component';
import { ProfileComponent } from './components/profile/profile.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './auth/login/login.component';
import { SignupComponent } from './auth/signup/signup.component';
import { Error404Component } from './components/error404/error404.component';
import { FooterComponent } from './components/footer/footer.component';
import { MainloginComponent } from './components/mainlogin/mainlogin.component';
import { FavouritesComponent } from './components/favourites/favourites.component';
import { FriendsComponent } from './components/friends/friends.component';
import { AuthGuard } from './auth/auth.guard';
import { IntroComponent } from './components/intro/intro.component';

const routes:Route[] = [
  {path:"", redirectTo:"home", pathMatch:"full"},
  {path:"home", component: HomeComponent, children:[{path:"login", component:LoginComponent}]},
  {path:"movies", component: MoviesComponent, canActivate: [AuthGuard]},
  {path:"personal", component: ProfileComponent, canActivate: [AuthGuard], children:[{path:"favourites", component:FavouritesComponent}, {path:"friends", component:FriendsComponent}]},
  {path:"mainlogin", component: MainloginComponent},
  {path:"signup", component: SignupComponent},
  {path:"intro", component:IntroComponent, canActivate: [AuthGuard]},
  {path:"**", component:Error404Component},

]

@NgModule({
  declarations: [
    AppComponent,
    MoviesComponent,
    ProfileComponent,
    NavbarComponent,
    HomeComponent,
    Error404Component,
    FooterComponent,
    MainloginComponent,
    FavouritesComponent,
    SignupComponent,
    LoginComponent,
    FriendsComponent,
    IntroComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes), //gli passo come parametro la variabile rotte che ho creato
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [{provide:HTTP_INTERCEPTORS, useClass:TokenInterceptor, multi:true}],
  bootstrap: [AppComponent]
})
export class AppModule { }
