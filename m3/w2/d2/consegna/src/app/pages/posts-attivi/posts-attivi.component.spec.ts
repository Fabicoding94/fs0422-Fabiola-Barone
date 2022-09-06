import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PostsAttiviComponent } from './posts-attivi.component';

describe('PostsAttiviComponent', () => {
  let component: PostsAttiviComponent;
  let fixture: ComponentFixture<PostsAttiviComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PostsAttiviComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PostsAttiviComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
