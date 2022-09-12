import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './Sections/header/header.component';
import { HomeComponent } from './Pages/home/home.component';
import { TasksListComponent } from './Pages/tasks-list/tasks-list.component';
import { TasksCompletedComponent } from './Pages/tasks-completed/tasks-completed.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    TasksListComponent,
    TasksCompletedComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
