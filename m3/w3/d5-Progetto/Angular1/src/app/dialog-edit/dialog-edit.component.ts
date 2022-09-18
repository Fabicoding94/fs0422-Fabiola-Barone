import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatDialogRef } from '@angular/material/dialog';
import Swal from 'sweetalert2';
import { Post } from '../post';
import { PostsService } from '../services/posts.service';

@Component({
  selector: 'app-dialog-edit',
  templateUrl: './dialog-edit.component.html',
  styleUrls: ['./dialog-edit.component.css']
})
export class DialogEditComponent implements OnInit {

  postForm!: FormGroup;
  constructor(private formBuilder: FormBuilder, private postSvc:PostsService, private dialogEdit: MatDialogRef<DialogEditComponent> ) { }

  post:Post = new Post('','')

  formAction:string = 'create'

  posts:Post[] = [];


  ngOnInit(): void {
    this.postForm = this.formBuilder.group({

      title:['', Validators.required],
      content:['', Validators.required ],
      data:['', Validators.required ],
    })

  }

  getPosts() {
    this.postSvc.getPost().subscribe(posts => {
      this.posts = posts})


  }

  addPost(){
    if(this.postForm.valid){
      this.postSvc.addPost(this.postForm.value)
      .subscribe({
          next:(res)=>{
            Swal.fire({
              position: 'center',
              icon: 'success',
              title: 'Post edited succesfully!',
              text:``,
              showConfirmButton: false,
              timer: 3000
          })
            this.postForm.reset();
            this.dialogEdit.close('save');
            this.posts.push(res);
            this.post = new Post('','')


          },

          error:(res)=>{
            alert("Error while adding the post! ")
          }

        }

      )


    }



  }

}
