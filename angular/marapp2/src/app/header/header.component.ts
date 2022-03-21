import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
@Input() menuname ;
isLogin = false;
  constructor(private route:Router) { 
    this.checkloginTOken();
  }

  ngOnInit() {
  }



  checkloginTOken(){
    let token  = localStorage.getItem("token");
    console.log("token is "+token)
    if(token == "" || token == undefined){
      this.isLogin = false;
    }else{
      this.isLogin  = true;
    }
    console.log(this.isLogin)
  }
  logout(){
    //call the logout api.if success response.clear 
    //clear the token in the browser
    localStorage.removeItem("token");
    this.route.navigateByUrl("login");

    //move the login

  }

}
