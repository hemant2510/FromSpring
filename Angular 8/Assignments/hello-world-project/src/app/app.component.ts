import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'hello-world-project';
  click:string="";
  public childData:string="";


  OnClickHandler(){
    this.click="Parent Clicked"
  }
}
