import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { TabViewModule } from 'primeng/tabview';
import {ButtonModule} from "primeng/button";
import {InputTextModule} from "primeng/inputtext";
import {TableModule} from "primeng/table";
import {TooltipModule} from "primeng/tooltip";

import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { PessoasPesquisaComponent } from './pessoas-pesquisa/pessoas-pesquisa.component';
import { InputTextareaModule } from "primeng/inputtextarea";
import {CalendarModule} from "primeng/calendar";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {SelectButtonModule} from "primeng/selectbutton";
import {DropdownModule} from "primeng/dropdown";
import {InputNumberModule} from "primeng/inputnumber";
import { PessoaCadastroComponent } from './pessoa-cadastro/pessoa-cadastro.component';
import {InputMaskModule} from "primeng/inputmask";
import {FormsModule} from "@angular/forms";
import { MessageComponent } from './message/message.component';
import {LancamentosModule} from "./lancamentos/lancamentos.module";

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    PessoasPesquisaComponent,
    PessoaCadastroComponent,
    MessageComponent,
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    FormsModule,

    LancamentosModule,

    ButtonModule,
    InputTextModule,
    TabViewModule,
    TableModule,
    TooltipModule,
    InputTextareaModule,
    CalendarModule,
    SelectButtonModule,
    DropdownModule,
    InputNumberModule,
    InputMaskModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
