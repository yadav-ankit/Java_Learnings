package java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

class ReservationService {
	ReservationService reservationService;

	public ReservationService() {

	}

	public Optional<ReservationService> getService() {
		return Optional.ofNullable(reservationService);
	}

}

public class Optional_Learn {

	public static void main(String[] args) throws ClassNotFoundException {

		ReservationService rs = new ReservationService();

		Optional<ReservationService> x = rs.getService();

		Optional<ReservationService> v = x.map(ReservationService::getService)
				.orElseThrow(() -> new ClassNotFoundException("fdfd"));

		List<String> ll = Arrays.asList("ankit", "hemant");

		Set<String> test = ll.stream().filter(s -> s.startsWith("ank")).collect(Collectors.toSet());

		List<ReservationService> reserve = new ArrayList<ReservationService>();

		List<Optional<ReservationService>> res = reserve.stream().map(o -> Optional.of(o)).collect(Collectors.toList());

		for (Optional<ReservationService> r : res) {
			if (r.isPresent()) {
				System.out.println("Ye aata isme");
			} else {
				r.orElse(null);
			}
		}

	}

}
