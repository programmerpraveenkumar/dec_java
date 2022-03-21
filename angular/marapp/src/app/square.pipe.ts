import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'square'
})
export class SquarePipe implements PipeTransform {

  transform(value: any, args?: any): any {
    //can add any logicc
    return value*value;
  }

}
