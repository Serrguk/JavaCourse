import com.skillbox.airport.Airport;

public class Main {
    public static void main(String[] args) {
        Airport domodedovo = Airport.getInstance();
        System.out.println(domodedovo.getAllAircrafts() + "\n");
        System.out.println(domodedovo.getTerminals());
    }
}
