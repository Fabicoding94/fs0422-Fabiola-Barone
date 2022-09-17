import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Post} from '../post'

@Injectable({
  providedIn: 'root'
})
export class PostsService {
  getPosts() {
    throw new Error('Method not implemented.');
  }

  constructor(private http:HttpClient) { }

  apiUrl:string = 'http://localhost:3000/posts'

  getPost() :Observable<Post[]>{
    return this.http.get<Post[]>(this.apiUrl)
  }

  addPost(post: Post) {
    return this.http.post<Post>(this.apiUrl,post)
  }

  editPost(post: Post) {
    return this.http.patch<Post>(this.apiUrl+'/'+post.id,post)
  }

  deletePost(post: Post) {
    return this.http.delete<Post>(this.apiUrl+'/'+post.id)//'http://localhost:3000/posts/5'
  }

}
