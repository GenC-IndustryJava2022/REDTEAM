import { Component, OnInit } from '@angular/core';
import { AccountService } from './account.service';

@Component({
  selector: 'app-account',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.css']
})
export class AccountComponent implements OnInit {

  isLoggedIn = false;
  username!:string;
  password!:string;
  
  onLogin() {
    if(this.password != "" && this.username != "") {
      this.isLoggedIn = true;
      console.log(this.username);
    }
  }

  getUsername() {
    return this.username;
  }
  constructor() { }

  ngOnInit(): void {
  }

}

