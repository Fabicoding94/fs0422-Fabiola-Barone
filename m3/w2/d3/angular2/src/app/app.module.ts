import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UtentiComponent } from './utenti/utenti.component';
import { UtentiEditComponent } from './utenti/utenti-edit/utenti-edit.component';
import { UtentiListComponent } from './utenti/utenti-list/utenti-list.component';
import { UtentiNewComponent } from './utenti/utenti-new/utenti-new.component';

@NgModule({
  declarations: [
    AppComponent,
    UtentiComponent,
    UtentiEditComponent,
    UtentiListComponent,
    UtentiNewComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
