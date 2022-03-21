import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  showLogout = false;
  message=""
  @Input() name;//get the data from the parent component
  @Input() menuname="";//will be recvd from parent componetn;
  @Output() toParent = new EventEmitter();//send the data to parent
  studentDetails:any = [
    {
      name:"testname",
      "age":15
    },
    {
      name:"testnameasdfasd",
      "age":16
    },
    {
      name:"testnameasdf",
      "age":17
    }
  ]
  pushToParent(){
    this.toParent.emit(this.message);//data will be sent to parent
  }
  constructor() {
    //json object-- from server response
   
    //toekn will be exist only after login.
    let token:any = localStorage.getItem("token");
    console.log("token is "+token);
    if(token == "" || token == undefined){
        this.showLogout= false;
    }else{
      //user is logged in 
      this.showLogout = true;
    }

   }

  ngOnInit() {
  }

}
