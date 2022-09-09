import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AttiviComponent } from './attivi.component';

describe('AttiviComponent', () => {
  let component: AttiviComponent;
  let fixture: ComponentFixture<AttiviComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AttiviComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AttiviComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
