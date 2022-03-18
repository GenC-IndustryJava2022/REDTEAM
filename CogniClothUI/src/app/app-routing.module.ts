import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccountComponent } from './compoenent/account/account.component';
import { CartComponent } from './compoenent/cart/cart.component';
import { ProductsComponent } from './compoenent/products/products.component';


const routes: Routes = [
  {path:'/cart',component:CartComponent},
  {path:'/account',component:AccountComponent},
  {path:'/products',component:ProductsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
