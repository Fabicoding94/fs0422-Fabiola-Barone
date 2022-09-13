import { Component, OnInit } from '@angular/core';
import { Photo } from './photo';
import { PhotoService } from './photo.service';
import { PhotoInterceptor } from './photo.interceptor';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'angular1';

  constructor(private photosSvc:PhotoService) { }

  photos: Photo[] = [];
  photo: Photo = new Photo('','')


  ngOnInit(): void {
    this.photosSvc.getAllPhotos().subscribe(res => this.photos = res)
  }

i:number = 0;
like(){
this.i++
return this.i
}

del(photo:Photo){
  this.photosSvc.deletePhoto(photo).subscribe(res => {
    let index = this.photos.findIndex(p => p.id === photo.id)
    this.photos.splice(index,1)

  })
}

}
