import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AttiviComponent } from './attivi/attivi.component';
import { HomeComponent } from './home/home.component';
import { InattiviComponent } from './inattivi/inattivi.component';

const routes: Routes = [
  {
    path: '',
    component: HomeComponent

  },
  {
    path: 'attivi',
    component: AttiviComponent

  },
  {
    path: 'inattivi',
    component: InattiviComponent

  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
