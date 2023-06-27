import { Component, OnInit } from '@angular/core';
import { AuthData } from 'src/app/model/auth-data.interface';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.scss']
})
export class ProfileComponent implements OnInit {

  constructor() { }

  user!:AuthData;
  serial:number = Math.floor(Math.random() * 10000) + 1;

  ngOnInit(): void {
    const userData = localStorage.getItem("user");

    if (userData !== null) {
      this.user = JSON.parse(userData);
      console.log(this.user);
    }
  }

}
