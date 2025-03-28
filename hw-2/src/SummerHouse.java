public class SummerHouse extends House {
    public SummerHouse(double price, double area, int roomCount, int livingRoomCount) {
        super(price, area, roomCount, livingRoomCount);
    }

    @Override
    public String toString() {
        return "SummerHouse [price=" + getPrice() + ", area=" + getArea() + ", roomCount=" + getRoomCount() + ", livingRoomCount=" + getLivingRoomCount() + "]";
    }
}