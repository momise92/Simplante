import { Component, OnInit } from '@angular/core';
import { Simplante } from '../model/model.simplante';
import { SimplantesService } from '../service/simplantes.service';

@Component({
  selector: 'app-add-simplante',
  templateUrl: './add-simplante.component.html',
  styleUrls: ['./add-simplante.component.css'],
})
export class AddSimplanteComponent implements OnInit {
  simplante: Simplante = new Simplante();
  submitted = false;

  constructor(public simplantesService: SimplantesService) {}

  ngOnInit() {}

  saveSimplante() {
    this.simplantesService.saveSimplante(this.simplante).subscribe(
      data => {
        console.log(data);
      },
      error => {
        console.log(error);
      }
    );
    this.submitted = true;
  }
}
