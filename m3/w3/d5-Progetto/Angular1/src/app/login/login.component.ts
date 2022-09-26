import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {


  public loginForm!: FormGroup;
  formIsValid!: boolean;
  constructor(private formBuilder: FormBuilder, private http: HttpClient, private router:Router) { }

  ngOnInit(): void {
    this.loginForm = this.formBuilder.group({

      email: ['', Validators.required],
      password: ['', Validators.required, Validators.minLength(5)],

    })
  }

  login(){

    this.http.get<any>("http://localhost:3000/signupUsers")
    .subscribe(res=>{


      const user = res.find((a:any)=>{
        return a.email === this.loginForm.value.email &&
        a.password === this.loginForm.value.password
      }
      );
      if(user){
        Swal.fire({
          icon: 'success',
          title: 'Login with success!',
          showConfirmButton: false,
          timer: 1800,
          timerProgressBar: true
      });
      this.loginForm.reset();
 this.router.navigate(['blog']);

      }else{
        alert("user not found!")}


      }, err=> {
        alert("Something went wrong!")
      })

      }

}
