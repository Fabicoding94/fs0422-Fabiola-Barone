import { Component, OnInit } from '@angular/core';
import {MatDialog} from '@angular/material/dialog';
import { DialogComponent } from '../dialog/dialog.component';
import { Post } from '../post';
import { PostsService } from '../services/posts.service';

@Component({
  selector: 'app-blog',
  templateUrl: './blog.component.html',
  styleUrls: ['./blog.component.css']
})
export class BlogComponent implements OnInit {



  constructor(private dialog: MatDialog, private postSvc:PostsService) { }

  post:Post = new Post('','')

  formAction:string = 'create'

  posts:Post[] = [];


  ngOnInit(): void {

    this.getPosts()


  };

  getPosts() {
    return this.postSvc.getPost().subscribe(posts => {
      this.posts = posts})


  };

  deleteMyPost() {};


  openDialog() {
    const dialogRef = this.dialog.open(DialogComponent, {
      width:'30%'
    });

    dialogRef.afterClosed().subscribe(result => {
      console.log(`Dialog result: ${result}`);
    });
  };








}
