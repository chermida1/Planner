
import { HttpClientModule } from '@angular/common/http';
import { LoginService } from './services/login.service';
import { ScheduleModule } from 'primeng/schedule';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';


import { AppComponent } from './app.component';
import { CalendarComponent } from './components/calendar/calendar.component';
import { CalendarViewComponent } from './components/calendar-view/calendar-view.component';
import { LoginComponent } from './components/login/login.component';
import { RouterModule, Routes } from '@angular/router';
import { RegisterComponent } from './components/register/register.component';

const appRoutes: Routes = [
  { path: 'home', component: LoginComponent },
  { path: 'register', component: RegisterComponent }

];

@NgModule({
  declarations: [
    AppComponent,
    CalendarComponent,
    CalendarViewComponent,
    LoginComponent,
    RegisterComponent
  ],
  imports: [
    BrowserModule,
    ScheduleModule,
    RouterModule.forRoot(appRoutes),
    HttpClientModule,
    FormsModule
  ],
  providers: [LoginService],
  bootstrap: [AppComponent]
})
export class AppModule { }
