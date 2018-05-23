import { Injectable } from '@angular/core';
import { HttpClient } from 'selenium-webdriver/http';
import { User } from '../models/user';

@Injectable()
export class LoginService {

  private url = 'http://localhost:8082/loginUser';
  constructor(private http: HttpClient) { }
  loginUser(user: User) {
    // return this.http.post();
  }
}
