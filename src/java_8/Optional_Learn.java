package java_8;

import java.util.Optional;

class ReservationService {
	
	public Optional<ReservationService> getService() {
		return null;
	}
	
}
public class Optional_Learn {

	public static void main(String[] args) {
		
	ReservationService rs = new ReservationService();
	
	Optional<ReservationService> x = rs.getService();
	
	Optional<ReservationService> v = x.map(ReservationService::getService).orElse(x);
	
	
	
	}
	
}
