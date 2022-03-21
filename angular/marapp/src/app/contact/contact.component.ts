import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit {
message=""
  constructor() { }

  ngOnInit() {
  }

  fromChild(message){
    console.log(message);
    this.message =message;
  }

}
