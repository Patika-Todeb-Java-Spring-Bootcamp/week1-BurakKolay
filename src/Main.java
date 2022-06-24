import java.awt.Color;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car Audi= new Car(Model.TOFAS, 2018, 6, (LocalDate.of(2019, 3, 8)), 8000, Color.BLUE);
		Audi.Description();
	}
}
