import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Photo } from './photo';


@Injectable({
  providedIn: 'root'
})
export class PhotoService {

  constructor(private http:HttpClient) { }

  apiUrl:string = 'http://localhost:3000/photos'


  getAllPhotos():Observable<Photo[]> {
    return this.http.get<Photo[]>(this.apiUrl)
  }

  deletePhoto(photo: Photo) {
    return this.http.delete<Photo>(this.apiUrl+'/'+photo.id)

  }


}
