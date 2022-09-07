import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UtentiEditComponent } from './utenti-edit.component';

describe('UtentiEditComponent', () => {
  let component: UtentiEditComponent;
  let fixture: ComponentFixture<UtentiEditComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UtentiEditComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UtentiEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
