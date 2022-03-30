import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent implements OnInit {

  prod !: Product;

  constructor(private routes : ActivatedRoute, private productService : ProductService) { }

    // getProduct():void {
    //   this.prod = this.productService.getProductById(this.routes.snapshot.paramMap.get('id')!)!;
    // }

  ngOnInit(): void {
    // this.getProduct();
  }

}
