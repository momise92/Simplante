import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OneSimplanteComponent } from './one-simplante.component';

describe('OneSimplanteComponent', () => {
  let component: OneSimplanteComponent;
  let fixture: ComponentFixture<OneSimplanteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OneSimplanteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OneSimplanteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
