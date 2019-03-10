import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddSimplanteComponent } from './add-simplante.component';

describe('AddSimplanteComponent', () => {
  let component: AddSimplanteComponent;
  let fixture: ComponentFixture<AddSimplanteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddSimplanteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddSimplanteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
