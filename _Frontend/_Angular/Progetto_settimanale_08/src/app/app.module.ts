import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { Route, RouterModule } from '@angular/router'; //importo i package delle rotte
import { FormsModule } from '@angular/forms'; //recupero i dati dall'input con il 2ways-DataBinding

import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { TodoComponent } from './todo/todo.component';
import { CompletatiComponent } from './completati/completati.component';

// creo le rotte per il passaggio da un componente all'altro
const routes: Route[] = [
  {
    path:"",
    component: TodoComponent,
  },
  {
    path:"completati",
    component: CompletatiComponent,
  }
]

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    TodoComponent,
    CompletatiComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes), // importo i moduli delle rotte,
    FormsModule, // importo i moduli dei form per utilizzare ngModel,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
