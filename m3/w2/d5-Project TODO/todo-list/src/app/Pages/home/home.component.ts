import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Todo } from 'src/app/Models/todo';
import { TodosService } from 'src/app/todos.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})


export class HomeComponent implements OnInit {

  allTodos: Todo[] = [];
  noContent:boolean = false;
  newTodo:Todo = new Todo('', false)
  router: any;

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

  add():void{
    this.todoSvc.addTodo(this.newTodo)
    this.newTodo = new Todo('', false)
    setTimeout(() => {
      this.getAll();
    },50)

  }

  delete(todo:Todo){

    this.todoSvc.deleteTodo(todo)
    setTimeout(() => {
      this.getAll();
    },50)

}


  completed(todo:Todo){
    if(todo.completed == false){
       todo.completed = true

      this.todoSvc.completedTodo(todo)

} else {
  todo.completed = false
  this.todoSvc.completedTodo(todo)
}
}

editingTodo!: Todo;



  edit(){
    this.todoSvc.updateTodo(this.editingTodo)


  this.router.navigate([''])

  }


}
