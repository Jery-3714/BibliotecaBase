class Book {
  constructor({ id, title, author }) {
    if (!id || !title || !author) {
      throw new Error('Book id, title and author are required');
    }

    this.id = id;
    this.title = title;
    this.author = author;
    this.available = true;
  }
}

class Library {
  constructor() {
    this.books = new Map();
  }

  addBook(bookData) {
    const book = bookData instanceof Book ? bookData : new Book(bookData);

    if (this.books.has(book.id)) {
      throw new Error(`Book with id "${book.id}" already exists`);
    }

    this.books.set(book.id, book);
    return book;
  }

  findBookById(id) {
    return this.books.get(id) ?? null;
  }

  listBooks() {
    return Array.from(this.books.values());
  }

  checkoutBook(id) {
    const book = this.findBookById(id);

    if (!book) {
      throw new Error(`Book with id "${id}" was not found`);
    }

    if (!book.available) {
      throw new Error(`Book with id "${id}" is not available`);
    }

    book.available = false;
    return book;
  }

  returnBook(id) {
    const book = this.findBookById(id);

    if (!book) {
      throw new Error(`Book with id "${id}" was not found`);
    }

    if (book.available) {
      throw new Error(`Book with id "${id}" is already available`);
    }

    book.available = true;
    return book;
  }
}

module.exports = {
  Book,
  Library,
};
