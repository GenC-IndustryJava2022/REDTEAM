import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CartComponent } from './compoenent/cart/cart.component';
import { AccountComponent } from './compoenent/account/account.component';
import { NavBarComponent } from './compoenent/nav-bar/nav-bar.component';
import { ProductsComponent } from './compoenent/products/products.component';

@NgModule({
  declarations: [
    AppComponent,
    CartComponent,
    AccountComponent,
    NavBarComponent,
    ProductsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
