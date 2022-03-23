import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from '../product';
import { HttpClient } from '@angular/common/http';
import { catchError, map } from 'rxjs/operators';


@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  constructor(){}
  prods !: Product[];

  addProduct() {
    
  }

  ngOnInit(): void {
  }

}
