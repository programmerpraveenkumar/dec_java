import { Component } from '@angular/core';

@Component({
  selector: 'app-comp',//useful for inject the component in other component
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
//export makes the class accessible in outside.
export class AppComponent {
  title = 'marapp';//variable declartion.
}
