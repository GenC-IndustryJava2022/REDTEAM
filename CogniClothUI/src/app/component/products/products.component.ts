import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from '../product';
import { HttpClient } from '@angular/common/http';
import { catchError, map } from 'rxjs/operators';
import { ProductService } from '../product.service';


@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  prods !: Product[];
  selectedItems !: Product[];
  lastSelectedItem !: Product;

  // constructor(private productService : ProductService) {
  //   this.productService.getAllProducts().subscribe(
  //     response => this.prods = response
  //   );
  // }

  constructor(private productService : ProductService) {
    this.selectedItems = [];
    this.prods = productService.getAllProducts();
  }

  addProduct(prod : Product) {
    this.selectedItems.push(prod);
    this.lastSelectedItem = prod;
  }

  removeLastProduct() {
    this.selectedItems.pop()
    if(this.selectedItems.length > 0)
      this.lastSelectedItem = this.selectedItems[this.selectedItems.length-2];
  }

  addToCart() {
    this.selectedItems.forEach(function(value) {
      console.log(value.productId);
    });
  }

  ngOnInit(): void {
  }

}
