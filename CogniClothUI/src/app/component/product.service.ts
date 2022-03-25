import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { catchError, map } from 'rxjs/operators';
import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  
  prods !: Product[];

  postHeader = {
    headers : new HttpHeaders({
      'Content-Type' : 'application/json'
    })
  };

  private baseURL : string = "jdbc:mysql://localhost:3306/cogniclothdb";

  // constructor(private httpClient:HttpClient) {}

  constructor(private httpClient : HttpClient) {
    this.prods = [
      new Product('1', 1, 4.50, 'blue-jeans', 'a pair of blue jeans', 1),
      new Product('2', 1, 4.50, 'black-dress', 'a black dress', 1),
      new Product('3', 1, 4.50, 'blue jeans', 'a pair of blue jeans', 1),
      new Product('4', 1, 4.50, 'blue jeans', 'a pair of blue jeans', 1),
      new Product('5', 1, 4.50, 'blue jeans', 'a pair of blue jeans', 1),
      new Product('6', 1, 4.50, 'blue jeans', 'a pair of blue jeans', 1),
    ];
  }

  addProductToCart(product:Product):boolean {
    this.httpClient.post<Product>(this.baseURL+"/cart",product, this.postHeader)
    .subscribe(res =>{}, (err)=>{console.log(err)})
    return true;
  }

  getAllProductsFromCart():Observable<Product[]> {
    return this.httpClient.get<Product[]>(this.baseURL+"/products").pipe(map(response=>{
      this.prods = response;
      return response;
    }), catchError(this.handleError<any>())
    
    );
  }

  // getAllProducts():Observable<Product[]> {
  //   return this.httpClient.get<Product[]>(this.baseURL+"/products").pipe(map(response=>
  //     {
  //       this.prods = response;
  //       return response; 
  //     }), 
  //     catchError(this.handleError<any>())
    
  //     );
  // }

  getAllProducts():Product[] {
    return this.prods;
  }

  getProductById(prodId:string) : Product | undefined {
    return this.prods.find(x=>x.productId == prodId);
  }

  private handleError<T>(result?: T) {
    console.log("Some error occurred");
    return result;
  }
  
}