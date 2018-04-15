package library;

import java.util.ArrayList;
import java.util.Collections;

class Archive {

    ArrayList<Book> books;
    int maxQuantity = 50;
    int roman1Val = 0;
    int roman2Val = 0;

    public Archive() {
        this.books = new ArrayList<>();
    }

    public void putBook(Book book, int quantity) {   //метод положить книгу/и, работает с книгами и их кол-вом
        if (maxQuantity < quantity) {                     // проверяем, что архив не переполнен
            System.out.println("Для этих книг нет места");
        } else {
            for (int i = 0; i < quantity; i++) {
                books.add(book);
            }
            maxQuantity -= quantity;
            System.out.println("В архив добавлена " + book.title + " в количестве " + quantity);
        }
        //тип перебераемых элементов....переменная куда записываем....имя коллекции,которую перебираем
        for (Book whatBook: books){
            if( whatBook.author == book.author ){
                book.count += 1;
            }else {
                book.count += 1;
            }
        }
        System.out.println(book.count);

    }

    public void getBook(Book book, int quantity) {
        if ( books.contains(book)){   // проверяем наличие нужной книги в принципе
            int count = Collections.frequency(books, book); // считаем, сколько одиниковых книг
            if( count >= quantity){      // учли книги есть, то выдаем
                maxQuantity += quantity;
                System.out.println("Вы взяли " + book.title + " в количестве " + quantity);
            }else {
                System.out.println(book.title + " в количестве " + quantity + " нет.");
            }
        }else{
            System.out.println("Такой книги нет в архиве");
        }

    }


}
