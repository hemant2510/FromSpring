import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdvertisementFormComponent } from './components/advertisement.component';
import { ColorDirective } from './directives/custom.directives';
import {DirectiveComponent} from './components/directive.component';
import { ChildComponent } from './components/child.component';

@NgModule({
  declarations: [
    AppComponent,
    AdvertisementFormComponent,
    ColorDirective,
    DirectiveComponent,
    ChildComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent,AdvertisementFormComponent]
})
export class AppModule { }
