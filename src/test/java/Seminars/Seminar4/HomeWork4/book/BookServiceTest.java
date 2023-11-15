package Seminars.Seminar4.HomeWork4.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookServiceTest {
    private BookRepository bookRepository;
    private BookService bookService;

    @BeforeEach
    void setUp() {
        // Создание мок-объекта BookRepository
        bookRepository = mock(BookRepository.class);
        bookService = new BookService(bookRepository);
    }

    @Test
    void testFindBookById() {
        // Установка поведения мок-объекта BookRepository
        when(bookRepository.findById("1"))
                .thenReturn(new Book("1", "Book1", "Author1"));

        Book book = bookService.findBookById("1");

        assertEquals("Book1", book.getTitle()); // Проверка, что возвращаемая книга имеет ожидаемый заголовок
        assertEquals("Author1", book.getAuthor()); // Проверка, что возвращаемая книга имеет ожидаемого автора
    }

    @Test
    void testFindAllBooks() {
        // Установка поведения мок-объекта BookRepository
        when(bookRepository.findAll())
                .thenReturn(List.of(
                        new Book("1", "Book1", "Author1"),
                        new Book("2", "Book2", "Author2")
                ));

        List<Book> books = bookService.findAllBooks();

        assertEquals(2, books.size()); // Проверка, что возвращается список из двух книг
        assertEquals("Book1", books.get(0).getTitle()); // Проверка, что первая книга имеет ожидаемый заголовок
        assertEquals("Author1", books.get(0).getAuthor()); // Проверка, что первая книга имеет ожидаемого автора
        assertEquals("Book2", books.get(1).getTitle()); // Проверка, что вторая книга имеет ожидаемый заголовок
        assertEquals("Author2", books.get(1).getAuthor()); // Проверка, что вторая книга имеет ожидаемого автора
    }
}
