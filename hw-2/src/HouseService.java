import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HouseService {
    private HouseRepository repository;

    public HouseService(HouseRepository repository) {
        this.repository = repository;
    }

    public double getTotalPriceOfHouses() {
        return repository.getHouseList().stream().mapToDouble(House::getPrice).sum();
    }

    public double getTotalPriceOfVillas() {
        return repository.getVillaList().stream().mapToDouble(House::getPrice).sum();
    }

    public double getTotalPriceOfSummerHouses() {
        return repository.getSummerHouseList().stream().mapToDouble(House::getPrice).sum();
    }

    public double getTotalPriceOfAllProperties() {
        return getTotalPriceOfHouses() + getTotalPriceOfVillas() + getTotalPriceOfSummerHouses();
    }

    public double getAverageAreaOfHouses() {
        return repository.getHouseList().stream().mapToDouble(House::getArea).average().orElse(0);
    }

    public double getAverageAreaOfVillas() {
        return repository.getVillaList().stream().mapToDouble(House::getArea).average().orElse(0);
    }

    public double getAverageAreaOfSummerHouses() {
        return repository.getSummerHouseList().stream().mapToDouble(House::getArea).average().orElse(0);
    }

    public double getAverageAreaOfAllProperties() {
        List<House> allProperties = new ArrayList<>();
        allProperties.addAll(repository.getHouseList());
        allProperties.addAll(repository.getVillaList());
        allProperties.addAll(repository.getSummerHouseList());
        return allProperties.stream().mapToDouble(House::getArea).average().orElse(0);
    }

    public List<House> getPropertiesByRoomAndLivingRoomCount(int roomCount, int livingRoomCount) {
        List<House> allProperties = new ArrayList<>();
        allProperties.addAll(repository.getHouseList());
        allProperties.addAll(repository.getVillaList());
        allProperties.addAll(repository.getSummerHouseList());
        return allProperties.stream()
                .filter(p -> p.getRoomCount() == roomCount && p.getLivingRoomCount() == livingRoomCount)
                .collect(Collectors.toList());
    }
}