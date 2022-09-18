import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  public signupForm !: FormGroup;
  constructor(private formBuilder: FormBuilder, private http: HttpClient, private router:Router) { }

  ngOnInit(): void {
    this.signupForm = this.formBuilder.group({
      fullname: [''],
      email: [''],
      password: [''],
      mobile: [''],
    })
  }

  signUp(){
    this.http.post<any>("http://localhost:3000/signupUsers", this.signupForm.value)
.subscribe(res=>{
  Swal.fire({
    icon: 'success',
    title: 'Signup succesfully!',
    showConfirmButton: false,
    timer: 1800,
    timerProgressBar: true
});
this.signupForm.reset();
 this.router.navigate(['login']);

  }, err=>{
    alert("Something went wrong!")
  })

  }}
