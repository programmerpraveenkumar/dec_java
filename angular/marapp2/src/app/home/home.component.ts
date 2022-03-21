import { Component, OnInit } from '@angular/core';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private route:Router) { 
    this.checkloginTOken();//neec to check token 
  }

  ngOnInit() {
  }
  checkloginTOken(){
    let token  = localStorage.getItem("token");
    console.log("token is "+token)
    //if token is not exist move to login page
    if(token == "" || token == undefined){
      this.route.navigateByUrl("login");
    }
  }
}
