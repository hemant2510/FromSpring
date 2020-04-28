import { Component } from '@angular/core';

@Component({
  selector: 'advertisement',
  templateUrl: './advertisement.component.html',
  styleUrls: ['./advertisement.component.css']
})

export class AdvertisementFormComponent{
    id :number;
    title :string;
    name :string;
    category:string;
    description:string;
    categories = [{ name: 'Furniture' }, { name: 'Hardware'}, { name: 'Mobile' }]; 
    master:Array<any>=[];

    OnClickSubmit(TitleID:string,NameID:string,CategoryID:string,DescriptionID:string,event: Event){
      event.preventDefault();
      this.master.push({id:this.master.length+1,
                        title:TitleID,
                        name:NameID,
                        category:CategoryID,
                        description:DescriptionID
      })
    }
}