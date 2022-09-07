import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor() { }


  allUsers:User[] = [
    {
      name: 'Mario',
      lastname: 'Rossi',
      active: true
    },
    {
      name: 'Maria',
      lastname: 'Rossi',
      active: true
    },
    {
      name: 'Mariano',
      lastname: 'Rossi',
      active: false
    }


  ]
}
