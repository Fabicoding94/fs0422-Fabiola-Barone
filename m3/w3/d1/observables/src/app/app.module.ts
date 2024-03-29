import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { IntervalComponent } from './interval/interval.component';
import { HomeComponent } from './home/home.component';
import { Interval2Component } from './interval2/interval2.component';

@NgModule({
  declarations: [
    AppComponent,
    IntervalComponent,
    HomeComponent,
    Interval2Component
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
