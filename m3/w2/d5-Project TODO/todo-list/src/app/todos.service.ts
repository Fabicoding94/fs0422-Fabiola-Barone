import { Injectable } from '@angular/core';
import { Todo } from './Models/todo';


@Injectable({
  providedIn: 'root'
})
export class TodosService{
  getallTodo() {
    throw new Error('Method not implemented.');
  }
  editTodo(todo: Todo, id: number | undefined) {
    throw new Error('Method not implemented.');
  }


  constructor(){}

   todosUrl:string = 'http://localhost:3000/todos'


   getAllTodos():Promise<Todo[]>{
    return new Promise<Todo[]>((resolve) => {
       setTimeout(() =>{
         let call = fetch(this.todosUrl).then(res => res.json())
         resolve(call)
       },2000)
   })
  }

  addTodo(todo:Todo):void{
    fetch(this.todosUrl, {
      method: 'POST',
      body: JSON.stringify(todo),
      headers:{
        "content-type":"application/json"
    }
    })
    .then(res => res.json())
  }

  completedTodo(todo:Todo):void{
      fetch(this.todosUrl+'/'+todo.id,{
      method: 'PUT',
      body: JSON.stringify(todo),
      headers:{
          "content-type":"application/json"
      }})
      .then(res => res.json())
  }

  updateTodo(todo:Todo):void{
    fetch(this.todosUrl+'/'+todo.id,{
      method: 'PUT',
      body: JSON.stringify(todo),
      headers:{
          "content-type":"application/json"
      }
  })
    .then(res => res.json())
  }


  deleteTodo(todo:Todo):void{
    fetch(this.todosUrl+'/'+todo.id,{
    method: 'DELETE',
    body: JSON.stringify(todo),
    headers:{
        "content-type":"application/json"
    }})
    .then(res => res.json())
}
}
