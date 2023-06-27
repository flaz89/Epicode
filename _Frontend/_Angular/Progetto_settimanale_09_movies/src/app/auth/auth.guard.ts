import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';
import { AuthService } from './auth.service';
import { map, take } from 'rxjs';


@Injectable({
  providedIn: 'root'
})


export class AuthGuard implements CanActivate {

  constructor(private autSrv: AuthService, private router: Router) { }



  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
    return this.autSrv.user$.pipe(
      take(1),
      map((user) => {
        if (user) {
          return true
        }
        //alert("You have to log In to visualize the content.");
        return this.router.createUrlTree(['/**']);
      })
    );
  }

}
