import { Injectable } from '@angular/core';
import { Todo } from '../interfaces/todo.interface';

@Injectable({
  providedIn: 'root'
})
export class TodosService {
  todos:Todo[] = [];

  constructor() { }

  //metodo che aggiunge il todo all'array
  addToDo(todo:string):void {
    const newtodo:Todo = {
      id: this.todos.length + 1,
      title: todo,
      completed: false,
      isLoading:false
    }
    this.todos.push(newtodo);
    console.log("aggiunto un todo", this.todos);

  }

  //metodo che completa il ToDo selezionato
  completeTodo(todo:Todo) {
    todo.completed = true;
    console.log("E' stato completato questo todo:", todo);

  }

  //metodo che cancella il todo selezionato dall'array
  deleteToDo(todo:Todo):void {
    const toDoIndex = this.todos.indexOf(todo);
    this.todos.splice(toDoIndex, 1);
    console.log("E' stato cancellato questo todo:", todo);
  }

}
