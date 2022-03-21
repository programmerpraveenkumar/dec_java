import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-user-update',
  templateUrl: './user-update.component.html',
  styleUrls: ['./user-update.component.css']
})
export class UserUpdateComponent implements OnInit {

  profileimg;
  constructor(private router:Router,private routerParams:ActivatedRoute,private http:HttpClient) { }

  ngOnInit() {

    //get dynamic url param..whc is configured in the app.routing.
      this.routerParams.params.subscribe(route_params=>{
        console.log(route_params);
      })

  }
  profileImgSelect(event){
    console.log(event.target.files[0]);
    this.profileimg = event.target.files[0];//store the binay image details in a file.
  }

  //call updatename api in one method
  //call password update api in one method
  //call mobile or dob or any field update api in one method
  profileImgUpdateApi(){
    let req_header = {};
    let form = new FormData();//from javasript obj for file upload
    form.append("file",this.profileimg);//append the select image in to the form obj.
    form.append("user_id","1")
    this.http.post("api_url_for_img_update",form,{headers:req_header})
    .subscribe(res=>{
      //alert("profile update success");
    })
  }
  //image read in the browser not in angular...
  //localhost:8080/user_ctr/user_img/id

}
