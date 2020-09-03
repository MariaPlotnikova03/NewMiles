public class BonusMilesService {
    public long calculate (int price) {
        int coefficient = 20;
        int miles =  price / coefficient;
        return miles;
    }
}
