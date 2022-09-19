import { Component, OnInit } from '@angular/core';
import { Post } from '../post';
import { PostsService } from '../services/posts.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private postSvc:PostsService) { }
  posts:Post[] = [];

  ngOnInit(): void {
    this.getPosts()

  }

  getPosts(): void {
    this.postSvc.getPost().subscribe(posts =>
      this.posts = posts)
  }

}
