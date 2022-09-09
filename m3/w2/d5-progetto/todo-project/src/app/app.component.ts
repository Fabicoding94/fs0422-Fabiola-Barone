import { Component } from '@angular/core';
import { Todo } from 'src/models/todo.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
 todos: Todo[] =  [
  new Todo(1, 'Fare la spesa', false),
  new Todo(2, 'Pulire casa', false)
 ];

}
