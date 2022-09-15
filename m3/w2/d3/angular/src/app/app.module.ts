import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TableComponent } from './table/table.component';
import { FormComponent } from './form/form.component';
import { AccordionBodyComponent } from './accordion-body/accordion-body.component';
import { AccordionSectionComponent } from './accordion-section/accordion-section.component';
import { ProvaDestroyComponent } from './prova-destroy/prova-destroy.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    TableComponent,
    FormComponent,
    AccordionBodyComponent,
    AccordionSectionComponent,
    ProvaDestroyComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
