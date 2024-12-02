import { Component } from '@angular/core';
import { WelcomeControllerService, WelcomeMessage } from './api';


// @ts-ignore
@Component({
  selector: 'app-root',
  standalone: false,
  template: `
    <div class="container">
      <h1>Welcome Message Generator</h1>
      <button (click)="getNewMessage()" class="btn">Get New Message</button>
      <div class="message" *ngIf="currentMessage">
        {{ currentMessage.message }}
      </div>
    </div>
  `,
  styles: [`
    .container {
      max-width: 800px;
      margin: 50px auto;
      text-align: center;
      font-family: Arial, sans-serif;
    }
    .btn {
      padding: 10px 20px;
      background-color: #007bff;
      color: white;
      border: none;
      border-radius: 4px;
      cursor: pointer;
      font-size: 16px;
    }
    .btn:hover {
      background-color: #0056b3;
    }
    .message {
      margin-top: 20px;
      padding: 20px;
      background-color: #f8f9fa;
      border-radius: 4px;
      font-size: 18px;
    }
  `]
})
export class AppComponent {
  currentMessage?: WelcomeMessage;

  constructor(private welcomeService: WelcomeControllerService) {}

  getNewMessage() {
    this.welcomeService.getRandomWelcome().subscribe(
      resp => {
        this.currentMessage = resp
        console.log(resp.message);
      }
    );
  }
}
