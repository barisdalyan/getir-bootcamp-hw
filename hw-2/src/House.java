public class House {
    private double price;
    private double area;
    private int roomCount;
    private int livingRoomCount;

    public House(double price, double area, int roomCount, int livingRoomCount) {
        this.price = price;
        this.area = area;
        this.roomCount = roomCount;
        this.livingRoomCount = livingRoomCount;
    }

    public double getPrice() {
        return price;
    }

    public double getArea() {
        return area;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public int getLivingRoomCount() {
        return livingRoomCount;
    }

    @Override
    public String toString() {
        return "House [price=" + price + ", area=" + area + ", roomCount=" + roomCount + ", livingRoomCount=" + livingRoomCount + "]";
    }
}