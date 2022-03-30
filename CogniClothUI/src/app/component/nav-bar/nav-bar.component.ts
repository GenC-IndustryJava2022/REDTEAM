import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html',
  styleUrls: ['./nav-bar.component.css']
})
export class NavBarComponent implements OnInit {

  prods !: Product[];

  searchForProduct() {
    /*prod.productName.includes(<HTMLInputElement>document.getElementById("searchBox")).value */
  }

  // constructor(private productService: ProductService) { 
  //   this.productService.getAllProducts().subscribe(
  //     response => this.prods = response
  //   )
  // }

  ngOnInit(): void {
  }

}
