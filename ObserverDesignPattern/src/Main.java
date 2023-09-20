// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Bitcoin btc= new Bitcoin();
        btc.setPrice(100);
        BitcoinManager bm= new BitcoinManager(btc);
        bm.addConsument(new EmailConsumer());
        bm.addConsument(new SMSConsumer());
        bm.setPrice(90);
    }
}