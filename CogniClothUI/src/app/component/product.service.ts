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

  private baseURL : string = "http://localhost:8088";

  // constructor(private httpClient:HttpClient) {}

  constructor(private httpClient : HttpClient) {
    // this.prods = [
    //   new Product('1', 1, 40.50, 'blue-jeans', 'a pair of blue jeans', 1),
    //   new Product('2', 1, 45.50, 'black-shirt', 'a black shirt', 1),
    //   new Product('3', 1, 14.50, 'cowboy-hat', 'a hat for a rootin-tootin cowboy', 1),
    //   new Product('4', 1, 90, 'hiking-boots', 'boots as rugged as you are', 1),
    //   new Product('5', 1, 34.50, 'red-shirt', 'a pair of blue jeans', 1),
    //   new Product('6', 1, 4.50, 'tan-shorts', 'a pair of blue jeans', 1),
    //   new Product('1', 1, 40.50, 'blue-rain-jacket', 'a pair of blue jeans', 1),
    //   new Product('2', 1, 45.50, 'green-rain-jacket', 'a black shirt', 1),
    //   new Product('3', 1, 14.50, 'red-rain-jacket', 'a hat for a rootin-tootin cowboy', 1),
    //   new Product('4', 1, 90, 'yellow-rain-jacket', 'boots as rugged as you are', 1),
    //   new Product('5', 1, 34.50, 'gray-hiking-hat', 'a pair of blue jeans', 1),
    //   new Product('6', 1, 4.50, 'blue-cowboy-hat', 'a pair of blue jeans', 1),
      
    // ];
  }

  addProductToCart(product:Product):boolean {
    this.httpClient.post<Product>(this.baseURL+"/cart",product, this.postHeader)
    .subscribe(res =>{}, (err)=>{console.log(err)})
    return true;
  }

  // getAllProductsFromCart():Observable<Product[]> {
  //   return this.httpClient.get<Product[]>(this.baseURL+"/products").pipe(map(response=>{
  //     this.prods = response;
  //     return response;
  //   }), catchError(this.handleError<any>())
    
  //   );
  // }

  getAllProducts():Observable<Product[]> {
    return this.httpClient.get<Product[]>(this.baseURL+"/product/productlist").pipe(map(response=>
      {
        this.prods = response;
        return response; 
      }), 
      catchError(this.handleError<any>())
    
      );
  }

  // getAllProducts():Product[] {
  //   return this.prods;
  // }

  // getProductById(prodId:string) : Product | undefined {
  //   return this.prods.find(x=>x.productId == prodId);
  // }

  private handleError<T>(result?: T) {
    console.log("Some error occurred");
    return result;
  }
  
}