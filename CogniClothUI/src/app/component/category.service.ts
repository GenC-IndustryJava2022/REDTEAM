import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { catchError, map } from 'rxjs/operators';
import { Category } from './category';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {

  constructor(private httpClient : HttpClient) {
    this.cats = [
      new Category('1', 'Shirts'),
      new Category('2', 'Pants'),
      new Category('3', 'Shorts'),
      new Category('4', 'Hats'),
      new Category('5', 'Dresses'),
      new Category('6', 'Skirts'),
      new Category('7', 'Socks')
    ];
  }

  cats !: Category[];

  private baseURL : string = "jdbc:mysql://localhost:3306/cogniclothdb";

  postHeader = {
    Headers: new HttpHeaders({
      'Content-Type' : 'application/json'
    })
  };

  // getAllCategories():Observable<Category[]> {
  //   return this.httpClient.get<Category[]>(this.baseURL+"/categories").pipe(map(response=>
  //     {
  //       this.cats = response;
  //       return response; 
  //     }), 
  //     catchError(this.handleError<any>())
    
  //     );
  // }

  getAllCategories():Category[] {
    return this.cats;
  }

  getCategoryById(catId:string) : Category | undefined {
    return this.cats.find(x=>x.categoryId == catId);
  }

  private handleError<T>(result?: T) {
    console.log("Some error occurred");
    return result;
  }
  
}
