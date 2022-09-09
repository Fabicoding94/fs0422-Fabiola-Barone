import { Injectable } from '@angular/core';
import { Post } from './post';

@Injectable({
  providedIn: 'root'
})
export class PostsService {

  constructor() { },


  postArray:Post[] = []


  getAllPost(post:Post){
    return fetch(posturl).then(res = > res.json())

  }
}
