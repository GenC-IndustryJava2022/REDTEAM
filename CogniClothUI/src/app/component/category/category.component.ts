import { Component, OnInit } from '@angular/core';
import { Category } from '../category';
import { CategoryService } from '../category.service';

@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.css']
})
export class CategoryComponent implements OnInit {

  cats !: Category[];

  // constructor(private categoryService : CategoryService) {
  //   this.categoryService.getAllCategories().subscribe(
  //     response => this.cats = response
  //   );
  // }
  constructor(private categoryService : CategoryService) {
    this.cats = categoryService.getAllCategories();
  }
  
  ngOnInit(): void {
  }

}
