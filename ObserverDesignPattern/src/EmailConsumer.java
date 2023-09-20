public class EmailConsumer implements Consumer {
    @Override
    public void consume(double price) {
        System.out.println("Email notification sent");
    }
}
