import { Component, OnInit } from '@angular/core';
import { SimplantesService } from '../service/simplantes.service';
import { HttpClient } from '@angular/common/http';
import { Simplante } from '../model/model.simplante';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
})
export class HomeComponent implements OnInit {
  description = 'Raconte nous une anecdote simplante.';
  pagesSimplante: Simplante[];

  constructor(
    private http: HttpClient,
    private simplantesservice: SimplantesService
  ) {}

  ngOnInit() {
    this.getAllSimplantes();
  }
  getAllSimplantes(): void {
    this.simplantesservice.getAllSimplantes().subscribe(
      data => {
        this.pagesSimplante = data.splice(0, 3);
        console.log(data);
      },
      error => {
        console.log(error);
      }
    );
  }
}
