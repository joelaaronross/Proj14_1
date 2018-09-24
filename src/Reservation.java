import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.time.format.FormatStyle;

import java.time.temporal.ChronoUnit;



			public class Reservation {

					private LocalDate arrivalDate;
					private LocalDate departureDate;
					public static final double NIGHTLYRATE = 145.00;

					
					
			public Reservation(LocalDate arrivalDate, LocalDate departureDate) {
				this.arrivalDate = arrivalDate;
				this.departureDate = departureDate;
	}

			
			
					//getters and setters 
					//methods
			public LocalDate getarrivalDate() {
				return arrivalDate;
	}

			public void setArrivalDate(LocalDate arrivalDate) {
				this.arrivalDate = arrivalDate;
	}

			public LocalDate getDepartureDate() {
				return departureDate;
	}

			public void setDepartureDate(LocalDate departureDate) {
				this.departureDate = departureDate;
	}

			
				//get-set formatted
			public static String getNIGHTLYRATEFormatted() {
				NumberFormat currency = NumberFormat.getCurrencyInstance();
				String nRate = currency.format(NIGHTLYRATE);
				return nRate;
	}

			public LocalDate getArrivalDate() {
				return arrivalDate;
	}

			public String getArrivalDateFormatted() {
				DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
				String formattedDate = dtf.format(arrivalDate);
				return formattedDate;
	}

			public String getDepartureDateFormatted() {
				DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
				String formattedDate = dtf.format(departureDate);
				return formattedDate;
	}

			public int getNumberOfNights() {
				long numberOfNights = ChronoUnit.DAYS.between(arrivalDate, departureDate);
				return (int) numberOfNights;
	}

			public double getTotalPrice() {
				double totalPrice = getNumberOfNights() * NIGHTLYRATE;
				return totalPrice;
	}

			public String getTotalPriceFormatted() {
				NumberFormat currency = NumberFormat.getCurrencyInstance();
				String totalPriceFormatted = currency.format(getTotalPrice());
				return totalPriceFormatted;
	}

			
			 //override toString & return arrvl/dep results
	@Override
	public String toString() {
		return "Reservation [arrivalDate=" + arrivalDate + ", departureDate=" + departureDate + "]";
	}

}
