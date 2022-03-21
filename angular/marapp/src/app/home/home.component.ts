import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CommonService } from '../common.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  serRes:any;
  userlist:any;
  firstName = "this is firstName";//variable declaration
  pageName = "Home Page";
  userid ;

  pageCount = [];
  login_email = "";//declare the vairable as empty;
  login_password= ""//declare the vairable as empty;
  error = "";
  serJsonRespone:any = [
    {
      "name":"Testname1",
      "address":{
        cityname:'trichy',
        pincode:'5464'
      }
  
    },
    {
      "name":"Testname2"  
    },
    {
      "name":"Testname3",
      "address":{
        cityname:'chennai',
        pincode:'5464'
      }
    }
  
  ]
  //object can be created using constuctor
  constructor(private common:CommonService,private http:HttpClient,private route:Router) {
   //this.postHttpLoginCallHeader();
  // this.userid = localStorage.getItem("user_id");
    this.userid = 5;
   this.getUsers();

   ///get the logged in user_id
    
   }

  ngOnInit() {
  }

  naviagetToedit(){
    this.route.navigateByUrl('userupdate/'+this.userid);
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
     // this.new_varibl = res;
    })
  }
 
  getPageCOunt(){
    let req_header =new HttpHeaders(
      {
        "Content-Type":"application/json",  
        "token":"12345",
        "user_id":"1"
      }
    );
    this.http.get("http://localhost:8080/user_ctrl/getPageCount",{headers:req_header})
    .subscribe(res=>{   
      console.log(res);
      
    })
    // this.http.get("http://localhost:8080/user_ctrl/getPageCount",{headers:req_header})
    // .subscribe((res:any)=>{   
    //   console.log(res);
    //   let totalpage =parseInt((parseInt(res['message'])/10).toFixed(0));//decimal to int
    //   this.pageCount = Array.from(Array(totalpage).keys())//convert integer to array
    //   console.log(this.pageCount)
    // })
 }
 getUsers(){
    let req_header =new HttpHeaders(
      {
        "Content-Type":"application/json",  
        "token":"12345",
        "user_id":"1"
      }
    );
   
    //post request with object
    this.http.get("http://localhost:8080/user_ctrl/getUser",{headers:req_header})
    .subscribe(res=>{
      console.log(res);
      this.userlist = res;
    },error=>{
      console.log("error");
      alert("error ")
    });
   
   
  }

listUser(pageNo){
   pageNo = pageNo+1;//adding pageCount is 1
   console.log(pageNo);
   //creiter api
    //post request with object
    // this.http.get("https://reqres.in/api/users?page="+pageNo)
    // .subscribe((res:any)=>{   
    //   this.pageCount = Array.from(Array(res['total_pages']).keys())//convert integer to array
    //   this.userlist = res['data'];//getting data object from the response
    //   //console.log(res);
    // })
  }
 

}
