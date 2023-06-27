import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';
import { NgForm} from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {


  constructor(private autSrv:AuthService, private router:Router) { }

  enter(form:NgForm) {
    try{
      this.autSrv.login(form.value).subscribe(()=> {
        console.log(form.value);
        alert("You logged in!");
        this.router.navigate(['/intro']);
      });
    }catch (error) {
      console.log(error);
      alert("Something went wrong!");
      this.router.navigate(['/home/login']);
    }
  }

  ngOnInit(): void {
  }
}
