import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Todo } from 'src/models/todo.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
 todos: Todo[] =  [
  new Todo('Fare la spesa', false),
  new Todo('Pulire casa', false)
 ];



onSubmit(form: NgForm,){

let todo = new Todo(form.value.title, false)
this.todos.push(todo)
form.resetForm()
}

onComplete(id: Guid){
let todo = this.todos.filter(x=>x.id === id)[0];
 todo.isCompleted = true;
  }

onDelete(id: Guid){
  let todo = this.todos.filter(x=>x.id === id)[0];
  let index = this.todos.indexOf(todo,0)
  if(index > -1){
    this.todos.splice(index,1)
  }
  }

}
