import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { PostsService } from '../services/posts.service';
import { MatDialogRef } from '@angular/material/dialog'
import { Post } from '../post';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-dialog',
  templateUrl: './dialog.component.html',
  styleUrls: ['./dialog.component.css']
})
export class DialogComponent implements OnInit {

  postForm!: FormGroup;
  constructor(private formBuilder: FormBuilder, private postSvc:PostsService, private dialogRef: MatDialogRef<DialogComponent> ) { }

  post:Post = new Post('','')

  formAction:string = 'create'

  posts:Post[] = [];


  ngOnInit(): void {
    this.postForm = this.formBuilder.group({

      title:['', Validators.required],
      content:['', Validators.required ],
      date:['', Validators.required ],
    })

  }

  addPost(){
    console.log(this.postForm.value)
    if(this.postForm.valid){
      this.postSvc.addPost(this.postForm.value)
      .subscribe({
          next:(res)=>{
            Swal.fire({
              position: 'center',
              icon: 'success',
              title: 'TPost added!',
              text:``,
              showConfirmButton: false,
              timer: 3000
          })
            this.postForm.reset();
            this.dialogRef.close('save');
            this.posts.push(res);
            this.post = new Post('','')
          },
          error:(res)=>{
            alert("Error while adding the post! ")
          }
        }
      )
       return this.getPosts();

    }
  }

  getPosts() {
    this.postSvc.getPost().subscribe(res => {
      this.posts = res})


  }

}
