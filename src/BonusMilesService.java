public class BonusMilesService {
    public int calculate(int price) {
        int result;
        if (price < 19) {
            result = 0;
        } else {
            result = price / 20;
        }
        return result;
    }
}