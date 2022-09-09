import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InattiviComponent } from './inattivi.component';

describe('InattiviComponent', () => {
  let component: InattiviComponent;
  let fixture: ComponentFixture<InattiviComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InattiviComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(InattiviComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
