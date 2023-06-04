import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavbarComponent implements OnInit {

  isActive:boolean = false;
  activeLink:string = "/";

  constructor() { }

  activateLink(link:string) {
    this.activeLink = link;
  }

  ngOnInit(): void {
  }

}
