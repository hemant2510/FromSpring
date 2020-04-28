import { Pipe, PipeTransform } from '@angular/core';

@Pipe({name:'advertisement'})
export class CustomPipe implements PipeTransform{
        transform(value:Array<any>,arg1:string, arg2:string):JSON{
            for(let item of value) {
                if (item[arg1]==arg2){
                    return item ;
                }
            }
        }
}