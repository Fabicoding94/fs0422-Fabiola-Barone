import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';
import { NgForm, NgModel } from '@angular/forms';

@Component({
  selector: 'app-ng-submit',
  templateUrl: './ng-submit.component.html',
  styleUrls: ['./ng-submit.component.scss']
})
export class NgSubmitComponent implements OnInit {

  //@ViewChild('form') form!:NgModel; //grazie a questa prop posso raggiungere il riferimento al form da qualunque punto della classe

  constructor() { }

  ngOnInit(): void {


  }

  ngAfterViewInit(): void {

    //console.log(this.form)
  }

  checkValidity(field:NgModel){
    return field.invalid && field.touched && field.dirty
  }

  submit(form:NgForm){
    console.dir(form)
    console.log(form.value)
  }
}
