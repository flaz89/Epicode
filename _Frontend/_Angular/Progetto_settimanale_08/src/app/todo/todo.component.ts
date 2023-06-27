import { Component, Input, OnInit } from '@angular/core';
import { TodosService } from '../services/todos.service';
import { Todo } from '../interfaces/todo.interface';


@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.scss']
})
export class TodoComponent implements OnInit {


  newTodo!:string; // varaibile per immagazzinare la stringa ricevuta poi dall'input
  todosArr!:Todo[]; // array dei todon di questo component
  showContent:boolean = false; // semaforo per mostrare il contenuto dopo Oninit


  constructor(private todosSrv:TodosService) {
    this.todosArr = todosSrv.todos;
  }

  addToDo() {
    this.newTodo ? this.todosSrv.addToDo(this.newTodo) : alert("insert new ToDo");
    this.newTodo = "";
  }

  deleteToDo(todo:Todo) {
    todo.isLoading = true;
    setTimeout(()=> {
      this.todosSrv.deleteToDo(todo);
      todo.isLoading = false;
    }, 1500)
  }

  completeToDo(todo:Todo) {
    todo.isLoading = true;
    setTimeout(()=> {
      this.todosSrv.completeTodo(todo);
      todo.isLoading = false;
    }, 1500)
  }

  ngOnInit(): void {
    setTimeout(() => {
      this.showContent = true;
      console.log(this.showContent);
    }, 2000)

  }

}
