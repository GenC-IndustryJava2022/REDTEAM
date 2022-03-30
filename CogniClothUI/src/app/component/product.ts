export class Product {

    constructor(
        public productId : number,
        public supplierId : number,
        public productName : string,
        public price : string,
        public productDescription : string,
        public categoryId : number
    )
    {}
}
