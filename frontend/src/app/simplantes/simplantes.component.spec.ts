import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SimplantesComponent } from './simplantes.component';

describe('SimplantesComponent', () => {
  let component: SimplantesComponent;
  let fixture: ComponentFixture<SimplantesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SimplantesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SimplantesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
