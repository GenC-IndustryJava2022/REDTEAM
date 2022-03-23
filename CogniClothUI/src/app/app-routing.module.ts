import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router'; 
import { AccountComponent } from './component/account/account.component';
import { CartComponent } from './component/cart/cart.component';
import { HomeComponent } from './component/home/home.component';
import { NavBarComponent } from './component/nav-bar/nav-bar.component';
import { ProductsComponent } from './component/products/products.component';


const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'cart',component:CartComponent},
  {path:'account',component:AccountComponent},
  {path:'products',component:ProductsComponent},
  {path:'nav-bar',component:NavBarComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
