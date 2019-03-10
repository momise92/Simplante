import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { SimplantesService } from '../service/simplantes.service';
import { Simplante } from '../model/model.simplante';

@Component({
  selector: 'app-simplantes',
  templateUrl: './simplantes.component.html',
  styleUrls: ['./simplantes.component.css']
})
export class SimplantesComponent implements OnInit {
  pagesSimplante: any;
  motCle = '';
  page = 0;
  size = 5;

  title = 'Simplante';

  constructor(
    private http: HttpClient,
    private simplantesservice: SimplantesService
  ) {}

  ngOnInit() {
    this.simplantesservice.getAllSimplantes().subscribe(
      data => {
        this.pagesSimplante = data;
      },
      error => {
        console.log(error);
      }
    );
  }
  // Fonction Recherche a finaliser !

  // doSearch() {
  //   this.simplantesservice
  //     .getSimplantes(this.motCle, this.page, this.size)
  //     .subscribe(
  //       data => {
  //         this.pagesSimplante = data;
  //       },
  //       error => {
  //         console.log(error);
  //       }
  //     );
  // }
  // chercher() {
  //   this.doSearch();
  // }
}
