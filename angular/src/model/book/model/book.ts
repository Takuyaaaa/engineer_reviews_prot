export class Book {
  id: number;
  title: string;
  price: number;
  category: number;
  reviewScore: number;
  url: string;
  imagePath: string;
}

export interface BookInterface {
  id: number;
  title: string;
  price: number;
  category: number;
  reviewScore: number;
  url: string;
  imagePath: string;
}
