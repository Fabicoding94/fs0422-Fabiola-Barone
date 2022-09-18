import { Component, OnInit } from '@angular/core';
import {MatDialog} from '@angular/material/dialog';
import Swal from 'sweetalert2';
import { DialogEditComponent } from '../dialog-edit/dialog-edit.component';
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

  }

  getPosts(): void {
    this.postSvc.getPost().subscribe(posts =>
      this.posts = posts)
  }



  openDialog() {
    const dialogRef = this.dialog.open(DialogComponent, {
      width:'30%'
    });

    dialogRef.afterClosed().subscribe(result => {
      this.getPosts()

    });




  };


  deletePost(post:Post){
    Swal.fire({
      title: 'Do you want to remove your Post?',
      showDenyButton: true,
      showCancelButton: true,
      confirmButtonText: 'Yes',
      denyButtonText: `No!`,
    }).then((result) => {
      if (result.isConfirmed) {
        Swal.fire({
          icon: 'success',
          title: 'Post Removed!',
          showConfirmButton: false,
          timer: 2500,
          timerProgressBar: true
        })


    this.postSvc.deletePost(post).subscribe(res => {
      let index = this.posts.findIndex(p => p.id === post.id)
      this.posts.splice(index,1)
    })
  } else if (result.isDenied) {
    Swal.fire({
      icon: 'error',
      title: 'Changes are not saved!',
      showConfirmButton: false,
      timer: 2500,
      timerProgressBar: true
    })
  }
})
}


  editPost(post:Post){


    const dialogEdit = this.dialog.open(DialogEditComponent, {
      width:'30%',

    });
    dialogEdit.afterClosed().subscribe(result => {

      this.getPosts()
      this.postSvc.deletePost(post).subscribe(res => {
        let index = this.posts.findIndex(p => p.id === post.id)
        this.posts.splice(index,1)
      })


    });




  }





}


