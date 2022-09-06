import { Component, OnInit } from '@angular/core';
import { ButtonComponent } from './button/button.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  id: any;
  ngOnInit(): void {
    this.callJson()
  }
  title = 'angular1';

  photos:any[] = [

    {
      "albumId": 1,
      "id": 1,
      "title": "accusamus beatae ad facilis cum similique qui sunt",
      "url": "https://via.placeholder.com/600/92c952",
      "thumbnailUrl": "https://via.placeholder.com/150/92c952"
    },
    {
      "albumId": 1,
      "id": 2,
      "title": "reprehenderit est deserunt velit ipsam",
      "url": "https://via.placeholder.com/600/771796",
      "thumbnailUrl": "https://via.placeholder.com/150/771796"
    },
    {
      "albumId": 1,
      "id": 3,
      "title": "officia porro iure quia iusto qui ipsa ut modi",
      "url": "https://via.placeholder.com/600/24f355",
      "thumbnailUrl": "https://via.placeholder.com/150/24f355"
    }


  ]


callJson(){
  fetch('https://https://jsonplaceholder.typicode.com/photos')
  .then(res => res.json())
  .then(res => this.photos = res)
}

bgColor:string = "blue";
i:number = 0;

likePhoto(){

  if(this.bgColor == "blue"){
 this.bgColor = "green"} else {
  this.bgColor = "blue";}
 this.i++;
 alert('Hai messo mi piace ' + this.i + ' volte')
}

deletePhoto(id:string){
  let index = this.photos.findIndex(photo => photo.id === id);
  this.photos.splice(index,1)
}




}
