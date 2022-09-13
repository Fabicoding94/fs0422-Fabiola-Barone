import { Component, OnInit } from '@angular/core';
import { AbstractControl, FormArray, FormControl, FormGroup, ValidationErrors, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactive-forms',
  templateUrl: './reactive-forms.component.html',
  styleUrls: ['./reactive-forms.component.scss']
})
export class ReactiveFormsComponent implements OnInit {

  constructor() { }

  form!:FormGroup

  ngOnInit(): void {

    this.form = new FormGroup({
      name: new FormControl(null,[Validators.required,this.userNameValidator]),
      lastname: new FormControl(null,[
        Validators.required,
        Validators.minLength(2)
      ]),
      email: new FormControl(null,
        [Validators.required, Validators.email],
        this.emailAllowedValidator//asincrono
        ),
      userAddress: new FormGroup({
        address: new FormControl('test'),
        city: new FormControl(null),
        zipcode: new FormControl(null)
      }),
      sports: new FormArray([])
    })

  }

  getControl(name: string){
    return this.form.get(name)
  }

  checkFullValidity(name:string){
    return this.getControl(name)?.invalid && this.getControl(name)?.touched &&  this.getControl(name)?.dirty
  }

  submit(){
    console.log(this.form)
    console.log(this.form.value)
  }

  /**
   * add sports
   */

  addSport(){
    let control:FormControl = new FormControl(null);
    let sports = <FormArray>this.form.get('sports');
    sports.push(control)
  }

  getSports(){
    return (this.form.get('sports') as FormArray).controls
  }

  /** custom validators */

  usernameProibiti:string[] = ['admin','administrator'];
  userNameValidator = (control: FormControl) => {
    if(this.usernameProibiti.includes(control.value)){
      return {proibito:true};//invalido il campo
    }
    return null;//lascio che il campo resti valido
  }

  //validatore asincrono
  emailProibite:string[] = ['admin@admin.it','administrator@administrator.it']
  emailAllowedValidator = (control:AbstractControl) => {
    return new Promise<ValidationErrors|null>((resolve) => {

      setTimeout(()=>{

        if(this.emailProibite.includes(control.value)){
          resolve({emailProibita:true})
        }else{
          resolve(null)
        }

      },2000)

    })
  }


}
