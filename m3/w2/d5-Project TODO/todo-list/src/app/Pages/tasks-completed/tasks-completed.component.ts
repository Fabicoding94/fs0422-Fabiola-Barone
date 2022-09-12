import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Todo } from 'src/app/Models/todo';
import { TodosService } from 'src/app/todos.service';

@Component({
  selector: 'app-tasks-completed',
  templateUrl: './tasks-completed.component.html',
  styleUrls: ['./tasks-completed.component.scss']
})
export class TasksCompletedComponent implements OnInit {

  allTodos: Todo[] = [];


  constructor(private todoSvc:TodosService) { }

  ngOnInit(): void {
    this.todoSvc.getAllTodos()
    .then(res => {
      this.allTodos = res.filter(todo => todo.completed === true)
    })
  }

  getAllCompleted(): void {
    this.todoSvc.getAllTodos()
    .then(res => {
      this.allTodos = res.filter(todo => todo.completed === true)
    })

  }

  delete(todo:Todo){

    this.todoSvc.deleteTodo(todo)
    setTimeout(() => {
      this.ngOnInit();
    },50)

}


}
