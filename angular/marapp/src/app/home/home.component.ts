import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { CommonService } from '../common.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  firstName = "this is firstName";//variable declaration
  pageName = "Home Page";
  login_email = "";//declare the vairable as empty;
  login_password= ""//declare the vairable as empty;
  error = "";
  //object can be created using constuctor
  constructor(private common:CommonService,private http:HttpClient) { }

  ngOnInit() {
  }

  form_validation(){
    if(this.login_email == ""){
        this.error = "Please Enter Email";
    }else if(this.login_password == ""){
      this.error = "Please Enter Password";
    }else{
      this.error = "Ready to call Login API";
    }
    this.common.showAlert(this.error);//calling the service from the component
    

//    console.log(this.login_email+" "+this.login_password);
  }
  getHttpCall(){
    //https://reqres.in/api/users?page=2
    this.http.get("https://reqres.in/api/users?page=2")
    .subscribe(res=>{
      console.log(res)
    })
  }
  postHttpCall(){
    let postArgs = {
      "name": "morpheus",
      "job": "leader"
    }
    //post request with object
    this.http.post("https://reqres.in/api/users",postArgs)
    .subscribe(res=>{
      console.log(res);
    })
  }
  postHttpCallWithHeader(){
    let req_header =new HttpHeaders(
      {
        "Content-type":"application/json",
        "token":"sampel token",//read the token from the localstoreage
        "user_id":'sample userPId',//read the token from the localstoreage
      }
    );
    let postArgs = {
      "name": "morpheus",
      "job": "leader"
    }
    //post request with object
    this.http.post("https://reqres.in/api/users",postArgs,{headers:req_header})
    .subscribe(res=>{
      console.log(res);
    })
   
   
  }


}
