import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthData } from 'src/app/model/auth-data.interface';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {
  hiddenBtn:boolean = false;

  user!:AuthData;
  userIn!:boolean;


  constructor(private router:Router) { }

  userHome() {
    this.router.navigate(['/movies']);
  }

  ngOnInit(): void {
    const userData = localStorage.getItem("user");
    userData ? this.userIn = true : this.userIn = false;
    if (userData) {
      this.user = JSON.parse(userData);
    }
  }

}
