import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './Pages/home/home.component';
import { TasksCompletedComponent } from './Pages/tasks-completed/tasks-completed.component';
import { TasksListComponent } from './Pages/tasks-list/tasks-list.component';

const routes: Routes = [
  {
    path:'',
    component: HomeComponent
  },
  {
    path:'tasks-list',
    component: TasksListComponent
  },
  {
    path:'tasks-completed',
    component:  TasksCompletedComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
