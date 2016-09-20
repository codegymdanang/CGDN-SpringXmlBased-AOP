package hocviencntt.services;

/**
 * Created by nguyenle on 9/20/16.
 */
public class CustomerService {

    private String name;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void printName() {
        System.out.println("Customer Name" + name);
    }

    public void printURL() {
        System.out.println("Website " + url);
    }

    public void printThrowExeption() {
        throw new IllegalArgumentException();
    }
}
