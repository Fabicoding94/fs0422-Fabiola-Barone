import { Component } from '@angular/core';
import { User} from './Models/User';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

   allUser: User [] = []

  newUser: User = new User ('', '')

  addUser(){
    let userCopy = Object.assign({}, this.newUser)
  this.allUser.push(this.newUser);
}

}
