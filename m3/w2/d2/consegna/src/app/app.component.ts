import { Component, OnInit } from '@angular/core';
import { Posts } from './Models/posts';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'angular1';

 post : Posts = new Posts('','', true)

 ngOnInit(): void {
  this.postApost()
 }


  postApost(){



    let options = {
     method : 'POST',
     headers : {'Content-Type':'application/json'}
    }
    fetch('db.json', options)
    .then(res => res.json())

}
}
