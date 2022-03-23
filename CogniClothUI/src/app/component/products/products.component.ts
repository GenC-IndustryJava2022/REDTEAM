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

  constructor(private productService : ProductService) {
    this.productService.getAllProducts().subscribe(
      response => this.prods = response
    );
  }

  addProduct() {
    
  }

  ngOnInit(): void {
  }

}
