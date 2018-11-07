package eserciziPack2.marshal;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
class Author {
    private String name;

    public Author() {}

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


@XmlRootElement
class Book {
    private String title;
    private List<Author> author;
    private double[] prezzi = {9.99, 12.99};

    public Book() {}

    public Book(String title, List<Author> author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthor() {
        return author;
    }
    @XmlElementWrapper(name = "AutoriAA")
    @XmlElement(name = "AutoriAA")
    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    public double[] getPrezzi() {
        return prezzi;
    }
    @XmlElementWrapper(name = "PrezziAAA")
    public void setPrezzi(double[] prezzi) {
        this.prezzi = prezzi;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", prezzi=" + Arrays.toString(prezzi) +
                '}';
    }
}



public class MainApp {

    public static void main(String[] args) throws JAXBException {

        Book book = new Book("Norwegian Wood", new ArrayList<Author>
                (Arrays.asList(new Author("Murakami") , new Author("Haruki"))));

        JAXBContext ctx = JAXBContext.newInstance(Book.class, Author.class);
        Marshaller m = ctx.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.marshal(book, System.out);
        File f1 = new File("C:\\users\\utente\\desktop\\save.xml");
        m.marshal(book, f1);


        Unmarshaller um = ctx.createUnmarshaller();
        Book o1 = (Book) um.unmarshal(f1);
        System.out.println("----------");
        System.out.println(o1);
    }
}
