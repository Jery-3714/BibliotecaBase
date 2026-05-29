const test = require('node:test');
const assert = require('node:assert/strict');

const { Book, Library } = require('../src/library');

test('Book requires id, title and author', () => {
  assert.throws(() => new Book({ id: '1', title: 'Clean Code' }), /required/);
});

test('Library adds, finds and lists books', () => {
  const library = new Library();
  const book = library.addBook({
    id: '1',
    title: 'Clean Code',
    author: 'Robert C. Martin',
  });

  assert.equal(library.findBookById('1'), book);
  assert.deepEqual(library.listBooks(), [book]);
});

test('Library prevents duplicate ids', () => {
  const library = new Library();

  library.addBook({
    id: '1',
    title: 'Clean Code',
    author: 'Robert C. Martin',
  });

  assert.throws(
    () =>
      library.addBook({
        id: '1',
        title: 'Refactoring',
        author: 'Martin Fowler',
      }),
    /already exists/,
  );
});

test('Library supports checkout and return flow', () => {
  const library = new Library();

  library.addBook({
    id: '1',
    title: 'Clean Code',
    author: 'Robert C. Martin',
  });

  const checkedOut = library.checkoutBook('1');
  assert.equal(checkedOut.available, false);

  assert.throws(() => library.checkoutBook('1'), /not available/);

  const returned = library.returnBook('1');
  assert.equal(returned.available, true);

  assert.throws(() => library.returnBook('1'), /already available/);
});
