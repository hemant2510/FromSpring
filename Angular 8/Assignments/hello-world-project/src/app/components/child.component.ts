import { Component } from "@angular/core";
import { EventEmitter } from "@angular/core";

@Component({
    selector:'child',
    template: `<div>
                    <input type="text" #childTextbox placeholder="Child Textbox" [value]="parentBox">
                    <button type="submit" (click)=OnClickChild()>Submit</button> 
               </div>`,
    inputs: ['parentBox'],
    outputs:['childEvent']
})

export class ChildComponent{

    public parentBox:string;
    public clickChild:string="Child Clicked";
    
    public childEvent = new EventEmitter<string>();

    OnClickChild(){
        this.childEvent.emit(this.clickChild);
    }
}
