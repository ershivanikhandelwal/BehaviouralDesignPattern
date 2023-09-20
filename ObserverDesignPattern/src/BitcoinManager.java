public class BitcoinManager extends Publisher {
    private Bitcoin bitcoin;
    public BitcoinManager(Bitcoin coin){
        this.bitcoin=coin;
    }
    public void setPrice(double price){
        if(bitcoin.getPrice()-price>5){
            publish(price);
        }
        this.bitcoin.setPrice(price);
    }
}
