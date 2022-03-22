import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { catchError, map } from 'rxjs/operators';
import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  prods !: Product[];
  private baseURL: string = "";
  constructor(private httpClient:HttpClient) { }

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
