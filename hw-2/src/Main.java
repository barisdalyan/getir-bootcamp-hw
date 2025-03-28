import java.util.List;

public class Main {
    public static void main(String[] args) {
        HouseRepository repository = new HouseRepository();
        HouseService service = new HouseService(repository);

        System.out.println("Total price of Houses: " + service.getTotalPriceOfHouses());
        System.out.println("Total price of Villas: " + service.getTotalPriceOfVillas());
        System.out.println("Total price of Summer Houses: " + service.getTotalPriceOfSummerHouses());
        System.out.println("Total price of All Properties: " + service.getTotalPriceOfAllProperties());
        System.out.println("Average area of Houses: " + service.getAverageAreaOfHouses());
        System.out.println("Average area of Villas: " + service.getAverageAreaOfVillas());
        System.out.println("Average area of Summer Houses: " + service.getAverageAreaOfSummerHouses());
        System.out.println("Average area of All Properties: " + service.getAverageAreaOfAllProperties());

        int filterRoomCount = 4;
        int filterLivingRoomCount = 1;
        List<House> filteredProperties = service.getPropertiesByRoomAndLivingRoomCount(filterRoomCount, filterLivingRoomCount);
        System.out.println("\nFiltered properties with " + filterRoomCount + " rooms and " + filterLivingRoomCount + " living rooms:");
        for (House property : filteredProperties) {
            System.out.println(property);
        }
    }
}