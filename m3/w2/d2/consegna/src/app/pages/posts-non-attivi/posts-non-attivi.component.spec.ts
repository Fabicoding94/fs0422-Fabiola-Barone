import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PostsNonAttiviComponent } from './posts-non-attivi.component';

describe('PostsNonAttiviComponent', () => {
  let component: PostsNonAttiviComponent;
  let fixture: ComponentFixture<PostsNonAttiviComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PostsNonAttiviComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PostsNonAttiviComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
