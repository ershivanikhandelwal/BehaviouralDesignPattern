public class SMSConsumer implements Consumer {
    @Override
    public void consume(double price) {
        System.out.println("SMS notification sent");
    }
}
