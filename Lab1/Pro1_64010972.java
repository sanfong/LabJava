// 64010972 อภิญวัช ขวัญพฤกษ์
public class Pro1_64010972 {
    public static void main(String[] args) {
        Integer population = 312032486;
        Integer birthRate = 7;
        Integer deathRate = 13;
        Integer immigrateRate = 45;
        Integer yearSecond = 365 * 24 * 60 * 60 * 5;
        System.out.println(population + (yearSecond / birthRate) - (yearSecond / deathRate) + (yearSecond / immigrateRate));
    }
}