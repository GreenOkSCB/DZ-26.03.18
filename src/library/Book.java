package library;

class Book {

    String autor;      // свойство книг, написал какой-то Автор
    String title;      // свойства книг иметь Название
    int pagesNum;      // свойства книг иметь определенное кол-во страниц

    protected Book(String autor, String title, int pagesNum) {    // конструктор книги, чтобы при создании книги мы
        this.autor = autor;                                       // не забыли указать автора, название и кол-во страниц
        this.title = title;
        this.pagesNum = pagesNum;                                 // зачем "this"? Где мы будем использовать их?


    }


}
