import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { catchError, map } from 'rxjs/operators';
import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  
  constructor(private httpClient:HttpClient) {

  }


  prods !: Product[];

  //TO DO: ADD IN BASE URL
  private baseURL: string = "jdbc:mysql://localhost:3306/cogniclothdb";
  postHeader = {
    headers : new HttpHeaders({
      'Content-Type': 'application/json'
    })
  };

  addProductToCart(product : Product):boolean {
    this.httpClient.post<Product>(this.baseURL+"cart",product, this.postHeader)
    .subscribe(res =>{}, (err)=>{console.log(err)})
    return true;
  }

  getAllProductsFromCart():Observable<Product[]> {
    return this.httpClient.get<Product[]>(this.baseURL+"/cart").pipe(map(response=>{
      this.prods = response;
      return response;
    }), catchError(this.handleError<any>())
    
    );
  }

  getAllProducts():Observable<Product[]> {
    return this.httpClient.get<Product[]>(this.baseURL+"/products").pipe(map(response=>{
      this.prods = response;
      return response;
    }), catchError(this.handleError<any>())
    
    );
  }

  getProductById(prodId:number) : Product | undefined {
    return this.prods.find(x=>x.productId == prodId);
  }

  private handleError<T>(result?: T) {
    console.log("Some error occurred");
    return result;
  }
  
}
