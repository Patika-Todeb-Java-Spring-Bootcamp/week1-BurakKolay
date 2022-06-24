import java.awt.Color;
import java.time.LocalDate;

public class Car {
	private final Model model;
	private final int year;
	private final int size;
	private final LocalDate date;
	private final int km;
	private final Color color;
	
	public Car(Model model, int year,int size, LocalDate date, int km, Color color) {
		this.model=model;
		this.year=year;
		this.size=size;
		this.date=date;
		this.km=km;
		this.color=color;
	}

	public int getYear() {
		return year;
	}

	public int getSize() {
		return size;
	}

	public LocalDate getDate() {
		return date;
	}

	public int getKm() {
		return km;
	}

	public Color getColor() {
		return color;
	}
	
	public void Description() {
		System.out.println("Model:"+this.model+"\nYear:"+this.year+
				"\nSize:"+this.size+"\nDate:"+this.date+
				"\nKilometer:"+this.km+"\nColor:"+this.color);
	}
	
}
