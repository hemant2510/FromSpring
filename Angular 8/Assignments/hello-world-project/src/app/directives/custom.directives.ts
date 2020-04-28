import { Directive,ElementRef } from    '@angular/core';

@Directive({
    selector:'[myColor]'
    
})

export class ColorDirective{
    constructor(element:ElementRef){
        element.nativeElement.style.color='red';
    }
}