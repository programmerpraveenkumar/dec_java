import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  constructor(private route:Router) { }

  ngOnInit() {
  }
loginapi(){
  //api response store the token
  localStorage.setItem("token","sampletoken");
  this.route.navigateByUrl('home');//will navigate to the home after success login
}

}
