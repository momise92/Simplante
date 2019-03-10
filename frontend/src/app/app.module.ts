import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './home/home.component';
import { NavComponent } from './nav/nav.component';
import { SimplantesComponent } from './simplantes/simplantes.component';
import { AddSimplanteComponent } from './add-simplante/add-simplante.component';
import { OneSimplanteComponent } from './one-simplante/one-simplante.component';

@NgModule({
  declarations: [
    AppComponent,
    SimplantesComponent,
    NavComponent,
    HomeComponent,
    FooterComponent,
    AddSimplanteComponent,
    OneSimplanteComponent
  ],
  imports: [BrowserModule, AppRoutingModule, HttpClientModule, FormsModule],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}
