class Book {
    String title;
    String author;
    int age;  // The age field is not being used, you can remove it if not needed

    public Book() {
        this.title = "book1";
        this.author = "narmadha";
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void introduce() {
        // Adding a space between the title and the author for better output formatting
        System.out.println(title + " by " + author);
    }

    public static void main(String[] args) {
        Book person1 = new Book("Life is Full of Surprises", "and Miracles");
        person1.introduce();
    }
}
