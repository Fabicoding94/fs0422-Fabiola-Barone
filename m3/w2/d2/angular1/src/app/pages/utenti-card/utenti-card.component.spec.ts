import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UtentiCardComponent } from './utenti-card.component';

describe('UtentiCardComponent', () => {
  let component: UtentiCardComponent;
  let fixture: ComponentFixture<UtentiCardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UtentiCardComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UtentiCardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
