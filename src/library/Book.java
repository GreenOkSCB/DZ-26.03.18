package library;

class Book {

    String author;      // свойство книг, написал какой-то Автор
    String title;      // свойства книг иметь Название
    int pagesNum;      // свойства книг иметь определенное кол-во страниц
    int count;

    public Book(String author, String title, int pagesNum, int count) {    // конструктор книги, чтобы при создании книги мы
        this.author = author;                                       // не забыли указать автора, название и кол-во страниц
        this.title = title;
        this.pagesNum = pagesNum;                                 // зачем "this"? Где мы будем использовать их?
        this.count = count;
    }



}
