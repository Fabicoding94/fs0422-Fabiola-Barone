import { Injectable } from '@angular/core';
import { Post } from './Models/post';

@Injectable({
  providedIn: 'root'
})
export class PostService {

  constructor() { }

  allPosts: Post[] = [];

  getAllPosts(){
    return this.allPosts
  }

  getPostById(id:string):Post | boolean{
    let foundPost = this.allPosts.find(post => post.id === id )
return foundPost
  }

  addPost(post:Post):void{
    post = Object.assign({}, post)
    this.allPosts.push(post);
  }

  deletePost(id:string):void{
    this.allPosts = this.allPosts.filter((p:Post) => p.id != id)
  }

  editPost(id:string):void{
    let index = this.allPosts.findIndex((p:Post) => p.id == post.id)
  this.allPosts.splice(index, 1 , post)
  }
}
