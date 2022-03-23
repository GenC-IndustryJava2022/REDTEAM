import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {

  cartprods !: Product[];

  //************TO DO************
  //Code below is causing error with routing - find out why

  constructor() { 
  }

  ngOnInit(): void {
    // this.productService.getAllProductsFromCart().subscribe(
    //   response => this.cartprods = response
    // );
  }

}

