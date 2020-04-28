import { Component } from "@angular/core";

@Component({
    selector:'directive',
    template : `<div [ngStyle]="{'background-color':backgroundColor}">This is my line</div><br><br>
    <div [ngClass]="{myClass:class_flag}">This is my second line</div>`,
    styles : ['h2:{color:blue','.myClass{color:yellow;}']
})

export class DirectiveComponent{
    public backgroundColor="green";
    public class_flag=true;
}