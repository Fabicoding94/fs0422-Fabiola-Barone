import { Injectable } from '@angular/core';
import {
  HttpRequest,
  HttpHandler,
  HttpEvent,
  HttpInterceptor,
  HttpClient
} from '@angular/common/http';
import { catchError, Observable, throwError } from 'rxjs';

@Injectable()
export class PhotoInterceptor implements HttpInterceptor {

  constructor(private http:HttpClient) {}

  intercept(request: HttpRequest<unknown>, next: HttpHandler): Observable<HttpEvent<unknown>> {
    console.log(request)
    return next.handle(request).pipe(catchError(err=>{
      console.log("errore nella chiamata",err)
      return throwError(()=>{ return new Error(err) })
    }));
  }
}
