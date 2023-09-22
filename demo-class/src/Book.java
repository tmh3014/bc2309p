public class Book { // Class is a template to describe the objects
    
    int noOfPages; // state

    String author; // state

    // Behaviour
    // instance method (An instance means an boject)
    public void setAuthor(String x) { // no static here!
        this.author = x; // this object
    }
    
    public String getAuthor() {
    return this.author;
}

    public void setNoOfPages(int noOfPages) {
    this.noOfPages = noOfPages;
}

    public int getNoOfPages() {
    return this.noOfPages;
}

    // static method can't be associated to the object
    // We use Class name to call static method, i.e. Book.print()

    public static void main(String[] args) { 
        Book book1 = new Book(); // book1 is an object
        book1.setAuthor("John");
        book1.setNoOfPages(3);
        System.out.println(book1.getAuthor()); // John
        System.out.println(book1.getNoOfPages()); // 3
        Book book2 = new Book(); // book2 is another object
        System.out.println(book2.getAuthor()); // null
        System.out.println(book2.getNoOfPages()); // 0

        // 工具 belongs to object
        // static method belongs to class

    }

}
