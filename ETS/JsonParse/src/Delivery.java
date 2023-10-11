public class Delivery {
    private Status status;
    private ServicePackage servicePackage;
    private City city;
    private byte weight;
    private byte quantity;
    private int priceItem;
    private String productName;


    // objek status
    public byte getCode() {
        return status.getCode();
    }

    public String getDescription() {
        return status.getDescription();
    }

    // objek servicePackage
    public String getService() {
        return servicePackage.getService();
    }

    public int getValue() {
        return servicePackage.getValue();
    }

    // objek city
    public String getOrigin() {
        return city.getOrigin();
    }

    public String getDestination() {
        return city.getDestination();
    }

    // attribute lokal
    public byte getWeight() {
        return weight;
    }

    public byte getQuantity() {
        return quantity;
    }

    public int getPriceItem() {
        return priceItem;
    }

    public String getProductName() {
        return productName;
    }

    public int calculateTotal(int value) {
        return value + quantity * priceItem;
    }

    public void getBill(Delivery deliveries) {
        System.out.println("Product Name : " + deliveries.productName);
        System.out.println("Quantity     : " + deliveries.quantity);
        System.out.println("Weight       : " + deliveries.weight);
        System.out.println("Destination  : " + deliveries.getDestination());
        System.out.println("Service      : " + deliveries.getService());
        System.out.println("Service Value: " + deliveries.getValue());
        System.out.println("Total        : " + deliveries.calculateTotal(getValue()));
    }

    public String getAllData(Delivery delivery) {
        return
        "=".repeat(50) +
        "\nStatus:" +
        "\n  " + delivery.getCode() +
        "\n  " + delivery.getDescription() +
        "\nService package:" +
        "\n  " + delivery.getService() +
        "\n  " + delivery.getValue() +
        "\nCity:" +
        "\n  " + delivery.getOrigin() +
        "\n  " + delivery.getDestination() +
        "\n" + delivery.getWeight() +
        "\n" + delivery.getQuantity() +
        "\n" +  delivery.getPriceItem() +
        "\n" + delivery.getProductName();
    }
}
