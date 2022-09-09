import { Component, OnInit } from '@angular/core';
import { Post } from 'src/app/post';
import { PostsService } from 'src/app/posts.service';

@Component({
  selector: 'app-posts',
  templateUrl: './posts.component.html',
  styleUrls: ['./posts.component.scss']
})
export class PostsComponent implements OnInit {

  constructor(private postSvc:PostsService) {

  posts: Post[] = [];

  ngOnInit(): void {
    this.postSvc.getAllPosts()
    .then
  }

}
