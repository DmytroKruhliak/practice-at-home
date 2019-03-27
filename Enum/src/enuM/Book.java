package enuM;

public class Book {
    String name;
    Type bookType;
    String author;

    public Book(String name, String author, Type type) {
        this.name = name;
        this.author = author;
        bookType = type;
    }

    public Type[] getTypes(){
        return Type.values();
    }
}
