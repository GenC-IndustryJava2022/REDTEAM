import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from '../product';
import { HttpClient } from '@angular/common/http';
import { catchError, map } from 'rxjs/operators';
import { ProductService } from '../product.service';
import { ValueConverter } from '@angular/compiler/src/render3/view/template';


@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  isAdded = true;
  prods !: Product[];
  selectedItems !: Product[];
  lastSelectedItem !: Product;

  constructor(private productService : ProductService) {
    this.selectedItems = [];
    this.productService.getAllProducts().subscribe(
      response => this.prods = response
    );
  }

  // constructor(private productService : ProductService) {
  //   this.selectedItems = [];
  //   // this.prods = productService.getAllProducts();
  // }

  addProduct(prod : Product) {
    this.selectedItems.push(prod);
    this.lastSelectedItem = prod;
  }

  // removeLastProduct() {
  //   this.selectedItems.pop()
  //   if(this.selectedItems.length > 0)
  //     this.lastSelectedItem = this.selectedItems[this.selectedItems.length-2];
  // }
  isAddedToCart() {
    return this.isAdded;
  }
  addToCart() {
    this.isAdded = false;
    this.selectedItems.forEach(function(value) {
      console.log(value.productId);
    });
  }
  calculateTotalPrice() {
    let cost = 0.00;
    this.selectedItems.forEach(function(value) {
      cost += parseFloat(value.price);
    });
    return cost.toFixed(2);
  }
  getSelectedItems() {
    return this.selectedItems;
  }

  test(prod : Product) {
    console.log(prod.productName)
  }

  ngOnInit(): void {
  }

}
