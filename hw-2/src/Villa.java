public class Villa extends House {
    public Villa(double price, double area, int roomCount, int livingRoomCount) {
        super(price, area, roomCount, livingRoomCount);
    }

    @Override
    public String toString() {
        return "Villa [price=" + getPrice() + ", area=" + getArea() + ", roomCount=" + getRoomCount() + ", livingRoomCount=" + getLivingRoomCount() + "]";
    }
}