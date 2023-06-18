import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router} from '@angular/router';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.scss']
})
export class SignupComponent implements OnInit {

  form!: FormGroup;


  constructor(private fb:FormBuilder, private authSrv:AuthService, private router:Router) { }


  ngOnInit(): void {
    this.form = this.fb.group(
      {
        name:["", Validators.required],
        email:["", [Validators.required, Validators.email]],
        password:["", Validators.required]
    })
    console.log(this.form.value);
  }

  signIn(form:FormGroup) {
    if(form.valid) {
      try {
          this.authSrv.register(form.value).subscribe(()=>{
            console.log(form.value);
            this.router.navigate(['/home'])
          })
        }
        catch (error:any){
          if(error.status == 400) {
            alert("Email already exist");
            this.router.navigate(["/signup"]);
          }
        }
    } else {
      alert("form invalid")
    }
  }
}
