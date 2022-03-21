import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent implements OnInit {

  cssClassName="class3";

  pageTitle = "about page";
  currentDate = new Date();
  price = 10;
  num = 5;
  num2 = 10;

  peopleList = [
    {name:"samplename",'age':15},
    {name:"samplename",'age':25},
    {name:"samplename",'age':5},
    {name:"samplename",'age':10},
    {name:"samplename",'age':7},
    {name:"samplename",'age':55},
    {name:"samplename",'age':65},


  ]

  constructor() { }

  ngOnInit() {
  }
  changeCssColor(classname){
    this.cssClassName = classname;//change the variable value as method args
  }

}
