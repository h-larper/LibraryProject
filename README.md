# LibraryProject

A small Java Maven project modelling core library domain entities (`Book`, `Member`, and `Library`), book-borrowing functionality, and unit tests.


## Project Structure

LibraryProject/
├── pom.xml
├── .gitignore
├── README.md
└── src/
    ├── main/
    │   └── java/
    │       ├── Book.java
    │       ├── Library.java
    │       └── Member.java
    └── test/
        └── java/
            └── LibraryTest.java


## Setup Prequisites
- **Java 8** must be installed and configured. The pom.xml file sets source and target versions to 8.
- **Apache Maven** must be installed and added to your system PATH (so it can be accessed via Terminal).


## To Run Tests
Tests are written in JUnit 4.
To exectue tests, within Terminal from the LibraryProject root, run 'mvn test'. 
Maven will then compile the main classes into target/classes, compile the test classes into target/test-classes and execute the test suite via Maven Surefire.


## Current Functionality & Borrowing Rules
The function **'Library.borrowBook(String isbn, String MemberId)'** evaluates requests in order and returns a status message of either:
1. "Book not found" - no matching book with the given 'isbn' exists in the library.
2. "Member not found" - no matching member with the given 'memberId' exists in the library.
3. "Book is unavailable" - the book is already marked as unavailale (available == false).
4. "Member has reached the loan limit" - the member already had 5 or more borrowed books.
5. "Book borrowed successfully" - the book with the matching 'isbn' is available. The book is marked as unavailable and its added to the member's borrowed list.


## Contribution Guidance 
When making changes to `LibraryProject`, please follow these practices to keep the codebase clean, testable, and easy to review:

1. **Follow the Maven directory layout:** Place production classes (`Book`, `Member`, `Library`, and any new domain classes) under `src/main/java` and unit tests under `src/test/java`.
2. **Keep code compatible with Java 8 and `pom.xml`:** Ensure changes compile against Java 8 (`source` and `target` `8` in `pom.xml`) and avoid committing generated build outputs in `target/`.
3. **Add and run JUnit 4 unit tests:** For any additional functionality, add corresponding tests under `src/test/java` covering new behaviour and validation rules. Run `mvn test` before committing and make sure all tests (including pre-exisitng tests) pass.
4. **Update documentation alongside code:** Add Javadoc (`/** ... */`) to public classes, constructors, and methods, include brief inline comments (`// ...`) for non-obvious business rules or validation order, and update `README.md` if setup, structure, or behaviour changes.
5. **Write clear, scoped commits:** Keep commits focused on a single logical change and use clear, descriptive commit messages (for example, `feat: ...`, `fix: ...`, `test: ...`, or `docs: ...`).