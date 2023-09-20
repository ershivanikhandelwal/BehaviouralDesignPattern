import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {
    List<Consumer> consumer= new ArrayList<>();
    public void publish(double price){
        consumer.forEach(consumer -> consumer.consume(price));
    }

    public void addConsument(Consumer consume){
        this.consumer.add(consume);
    }
    public void removeConsumer(Consumer consume){
        this.consumer.remove(consume);
    }
}
