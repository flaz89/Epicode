import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthData } from 'src/app/model/auth-data.interface';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavbarComponent implements OnInit {

  user!:AuthData;

  constructor(private router:Router) { }


  ngOnInit(): void {
    const userData = localStorage.getItem("user");

    if (userData !== null) {
      this.user = JSON.parse(userData);
      console.log(this.user);
    }
  }

  logout() {
    localStorage.removeItem("user");
    alert(`Hope to see you soon again! CIAO ${this.user.user.name} `)
    this.router.navigate(['/home']);
  }
}
