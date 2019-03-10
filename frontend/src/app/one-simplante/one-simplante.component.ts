import { Component, OnInit, Input } from '@angular/core';
import { Simplante } from '../model/model.simplante';
import { ActivatedRoute, ParamMap } from '@angular/router';
import { Location } from '@angular/common';
import { SimplantesService } from '../service/simplantes.service';
import { Observable } from 'rxjs';
import { switchMap } from 'rxjs/operators';

@Component({
  selector: 'app-one-simplante',
  templateUrl: './one-simplante.component.html',
  styleUrls: ['./one-simplante.component.css']
})
export class OneSimplanteComponent implements OnInit {
  simplante$: Observable<Simplante>;

  constructor(
    private route: ActivatedRoute,
    private simplanteService: SimplantesService,
    private location: Location
  ) {}

  ngOnInit() {
    this.simplante$ = this.route.paramMap.pipe(
      switchMap((params: ParamMap) =>
        this.simplanteService.getSimplante(params.get('id'))
      )
    );
  }

  goBack(): void {
    this.location.back();
  }
}
