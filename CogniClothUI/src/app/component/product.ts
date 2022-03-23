export class Product {

    constructor(
        public productId : string,
        public supplierId : number,
        public unitPrice : number,
        public productName : string,
        public productDescription : string,
        public categoryId : number
    )
    {}
}
