import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UtentiListComponent } from './utenti-list.component';

describe('UtentiListComponent', () => {
  let component: UtentiListComponent;
  let fixture: ComponentFixture<UtentiListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UtentiListComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UtentiListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
