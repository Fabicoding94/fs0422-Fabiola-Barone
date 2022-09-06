import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { PostsAttiviComponent } from './pages/posts-attivi/posts-attivi.component';
import { PostsNonAttiviComponent } from './pages/posts-non-attivi/posts-non-attivi.component';

const routes: Routes = [
  {path:'',
  component: HomeComponent},
  {path:'posts-attivi',
  component: PostsAttiviComponent},
  {path:'posts-non-attivi',
  component: PostsNonAttiviComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
