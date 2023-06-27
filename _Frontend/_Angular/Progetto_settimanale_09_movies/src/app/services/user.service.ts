import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { HttpClient } from '@angular/common/http';
import { Friends } from '../model/friends.interface';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  baseUrl = environment.baseURL;

  constructor(private http:HttpClient) { }

  getUser() {
    return this.http.get<Friends>(this.baseUrl + "users");
  }
}
