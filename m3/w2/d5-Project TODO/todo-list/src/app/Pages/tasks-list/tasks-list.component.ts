import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Todo } from 'src/app/Models/todo';
import { TodosService } from 'src/app/todos.service';

@Component({
  selector: 'app-tasks-list',
  templateUrl: './tasks-list.component.html',
  styleUrls: ['./tasks-list.component.scss']
})
export class TasksListComponent implements OnInit {

  allTodos: Todo[] = [];
  noContent:boolean = false;
  newTodo:Todo = new Todo('', false)

  @Input() todo: Todo | undefined
  @Output()
  todoClicked: EventEmitter<void> = new EventEmitter()

  constructor(private todoSvc: TodosService) { }

  ngOnInit(): void {
    this.getAll()
  }



  getAll():void{
    this.todoSvc.getAllTodos().then((res: Todo[]) => {
      this.allTodos = res
      if(this.allTodos.length == 0){
        this.noContent = true;
      }else{
        this.noContent = false;
      }
    });
  }

  delete(todo:Todo){

    this.todoSvc.deleteTodo(todo)
    setTimeout(() => {
      this.getAll();
    },50)

}



//al click sul btn completed cambio il booleano di completed nel db.json
completed(todo : Todo){
 todo.completed = !todo.completed;
 this.todoSvc.updateTodo(todo)
 setTimeout(( ) => {
  this.todoSvc.getAllTodos()
  .then(res => {
    this.allTodos = res.filter(todo => todo.completed === true)
  })
 }, 2300)

}







}
