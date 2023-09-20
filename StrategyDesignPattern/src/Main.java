// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Navigator navigate= new Navigator(new TwoWheelerNavigation());
        System.out.println(navigate.navigation("Jaipur","Jodhpur"));
    }
}