import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CommonService {

  constructor() { }

  showAlert(message){
    alert(message);//javascripe method to show the dialog box
  }

}
