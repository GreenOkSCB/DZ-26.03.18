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
        Book roman1 = new Book("L. Tolstoy", "Anna Karenina", 350, 0);      // создаем конкретный экземпляр Book
        Book roman2 = new Book("F.Dostoevsky", "Idiot", 425, 0);           // создаем конкретный экземпляр Book

        Archive archive = new Archive();    // создали объект типа Архив

        archive.putBook(roman1, 7);
        archive.putBook(roman2, 9);

        archive.getBook(roman1, 15);


//        archive.getBook(roman2, 11);

        archive.putBook(roman1, 13);
//        archive.putBook(roman2, 9);
//
//        archive.getBook(roman1, 19);
//        archive.getBook(roman2, 11);

//             System.out.println("Сейчас в архиве " + roman1.title + " : " + roman1.count);
//             System.out.println("Сейчас в архиве " + roman2.title + " : " + roman2.count);



    }
}
