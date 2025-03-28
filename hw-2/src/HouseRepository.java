import java.util.ArrayList;
import java.util.List;

public class HouseRepository {
    private List<House> houseList;
    private List<Villa> villaList;
    private List<SummerHouse> summerHouseList;

    public HouseRepository() {
        houseList = new ArrayList<>();
        villaList = new ArrayList<>();
        summerHouseList = new ArrayList<>();

        houseList.add(new House(100000, 120, 3, 1));
        houseList.add(new House(150000, 150, 4, 1));
        houseList.add(new House(200000, 180, 4, 2));

        villaList.add(new Villa(300000, 250, 5, 2));
        villaList.add(new Villa(350000, 300, 6, 2));
        villaList.add(new Villa(400000, 320, 7, 3));

        summerHouseList.add(new SummerHouse(250000, 200, 4, 1));
        summerHouseList.add(new SummerHouse(275000, 220, 4, 1));
        summerHouseList.add(new SummerHouse(300000, 240, 5, 1));
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public List<Villa> getVillaList() {
        return villaList;
    }

    public List<SummerHouse> getSummerHouseList() {
        return summerHouseList;
    }
}