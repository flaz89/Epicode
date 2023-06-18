import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/services/user.service';
import { Friends } from 'src/app/model/friends.interface';
import { AuthData } from 'src/app/model/auth-data.interface';

@Component({
  selector: 'app-friends',
  templateUrl: './friends.component.html',
  styleUrls: ['./friends.component.scss']
})
export class FriendsComponent implements OnInit {

  friends!:Friends[];
  user!:AuthData;



  constructor(private userSrv:UserService) { }

  online():number {
    const random = Math.random();
    return random;
  }

  serial():number {
    const random = Math.floor(Math.random() * 10000) + 1;
    return random;
  }

  ngOnInit(): void {
    const userData = localStorage.getItem("user");

    if (userData !== null) {
      this.user = JSON.parse(userData);
      console.log(this.user);
    }

    setTimeout(()=>{
      console.log("ciao");
      this.userSrv.getUser().subscribe((response:any) => {
      console.log(response);
      this.friends = response.filter((friend:Friends) => friend.id !== this.user.user.id);
    });
    }, 1000)
  }
}
