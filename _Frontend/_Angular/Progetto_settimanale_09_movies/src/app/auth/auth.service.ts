import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Router } from '@angular/router';
import { AuthData } from '../model/auth-data.interface';
import { User } from '../model/user.interface';

import { BehaviorSubject, tap} from 'rxjs';
import { JwtHelperService } from '@auth0/angular-jwt';


@Injectable({
  providedIn: 'root'
})
export class AuthService {

  baseURL = environment.baseURL
  user!:AuthData;

  jwtHelper = new JwtHelperService();
  private authSubj = new BehaviorSubject<null | AuthData>(null);
  user$ = this.authSubj.asObservable();

  constructor(private http:HttpClient, router:Router) { }


  login(data:{email:string, password:string}){
    return this.http.post<AuthData>(this.baseURL + "login", data).pipe(tap((data => {
      console.log(data);
      this.authSubj.next(data);
      this.user = data;
      localStorage.setItem("user", JSON.stringify(data));
    })))
  }

  register(data:User) {
    return this.http.post(this.baseURL + "users", data);
  }

}
