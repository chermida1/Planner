import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../models/user';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

@Injectable()
export class LoginService {

  private url = 'http://localhost:8082/loginUser';
  constructor(private http: HttpClient) { }
  loginUser(user: User) {
    return this.http.post(this.url, user).subscribe();
  }
}
