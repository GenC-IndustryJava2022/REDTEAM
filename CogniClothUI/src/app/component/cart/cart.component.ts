import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {

  cartProds !: Product[];

  //************TO DO************
  //adding anything into constructor is causing errors - find out why

  // constructor(private productService : ProductService) { 
  //   this.productService.getAllProductsFromCart().subscribe(
  //     response => this.cartProds = response
  //   );
  // }

  ngOnInit(): void {
    // this.productService.getAllProductsFromCart().subscribe(
    //   response => this.cartprods = response
    // );
  }

}

