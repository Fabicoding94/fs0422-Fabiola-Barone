import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './main/header/header.component';
import { ButtonsComponent } from './main/buttons/buttons.component';
import { HomeComponent } from './pages/home/home.component';
import { PostsAttiviComponent } from './pages/posts-attivi/posts-attivi.component';
import { PostsNonAttiviComponent } from './pages/posts-non-attivi/posts-non-attivi.component';
import { FormComponent } from './main/form/form.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    ButtonsComponent,
    HomeComponent,
    PostsAttiviComponent,
    PostsNonAttiviComponent,
    FormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
