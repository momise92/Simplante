import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map, tap, catchError } from 'rxjs/operators';
import { Simplante } from '../model/model.simplante';
import { Identifiers } from '@angular/compiler';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class SimplantesService {
  // URL de l'api
  // simplanteUrl = 'http://localhost:8080/simplante';
  simplanteUrl = 'https://simplante.cfapps.io/simplante';

  constructor(private http: HttpClient) {}

  getSimplante(id: number | string) {
    return this.getAllSimplantes().pipe(
      // (+) before `id` turns the string into a number
      map((simplantes: Simplante[]) =>
        simplantes.find(simplante => simplante.id === +id)
      )
    );
  }

  getAllSimplantes(): Observable<Simplante[]> {
    return this.http.get<Simplante[]>(this.simplanteUrl).pipe(resp => resp);
  }
  // getSimplantes(motCle: string, size: number, page: number) {
  //   return this.http
  //     .get(
  //       this.simplanteUrl +
  //         'chercherSimplante?mc=' +
  //         motCle +
  //         '&size=' +
  //         size +
  //         '&page=' +
  //         page
  //     )
  //     .pipe(resp => resp);
  // }
  saveSimplante(simplante: Simplante) {
    return this.http.post(this.simplanteUrl, simplante).pipe(resp => resp);
  }
}
