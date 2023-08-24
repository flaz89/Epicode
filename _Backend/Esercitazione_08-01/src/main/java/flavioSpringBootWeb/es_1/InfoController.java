package flavioSpringBootWeb.es_1;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {
	
	
	@GetMapping("/{language}")
	@ResponseStatus(HttpStatus.OK)
	public String printInfo(@PathVariable String language) throws Exception {
		
		if (language.equals("italiano") || language.equals("italian") || language.equals("ita")) {
			System.out.println("l'utente ha scelto la lingua Italiana");
			String itaInfo = "- Il cliente deve fornire i dati personali e la carta di credito \n- E' possibile effettuare la prenotazione entro il giorno prima della data selezionata \n- E' possibile disdire la prenotazione entro le 48h prima della data selazionata \n- Il ritardo in fase di cancellazione addebiterà il 50% del costo del spggiorno";
			return itaInfo;
		} else if (language.equals("english") || language.equals("eng")) {
			System.out.println("user selected English language");
			String engInfo = "- Customer has to supply personal data and credit card \n- It's possible booking at most one day before selected data \n- It's possible dismiss the booking at most 48h before selected data \n- Late booking delete will add to your bank account 50% of your total cost ";
			return engInfo;
		} else {
			throw new Exception("No language available for this operation with selected one: " + language);
		}
	}
}
