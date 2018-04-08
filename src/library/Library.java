package library;
    /*1. Сделать библиотеку, которая ведет учет книг.
     Должно быть как минимум два класса: Book и Library.
     Library имеет два метода: void put(Book book, int quantity)
     и int get(Book book, int quantity). Каждой книге в библиотеке
     соответствует счетчик, показывающий количество хранящихся книг,
     при добавлении книги - счетчик увеличивается, при извлечении -
     уменьшается на число quantity.
    Поля класса Book: author, title, pagesNum.
    Библиотека хранит ограниченное число книг, сколько - на ваше усмотрение.
    */


public class Library {
    public static void main(String[] args) {
        Book roman1 = new Book("L. Tolstoy", "Anna Karenina", 350);      // создаем конкретный экземпляр Book
        Book roman2 = new Book("F.Dostoevsky", "Idiot", 425);           // создаем конкретный экземпляр Book




    }
}
