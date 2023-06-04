import { Component, OnInit } from '@angular/core';
import { TodosService } from '../services/todos.service';
import { Todo } from '../interfaces/todo.interface';


@Component({
  selector: 'app-completati',
  templateUrl: './completati.component.html',
  styleUrls: ['./completati.component.scss']
})
export class CompletatiComponent implements OnInit {

  completedTodos!:Todo[];
  isLoading:boolean = false;


  constructor(private todosSrv:TodosService) {
    this.completedTodos = todosSrv.todos;
  }

  get noCompleteTodos(): boolean {
    return this.completedTodos.every(todo => !todo.completed);
  }


  deleteToDo(todo:Todo) {
    todo.isLoading = true;
    setTimeout(()=> {
      this.todosSrv.deleteToDo(todo);
      todo.isLoading = false;
    }, 1500)
  }

  ngOnInit(): void {
  }

}
