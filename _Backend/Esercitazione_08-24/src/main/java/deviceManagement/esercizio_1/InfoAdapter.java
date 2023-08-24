package deviceManagement.esercizio_1;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InfoAdapter implements DataSource {
	
	private Info info;
	
	@Override
	public String getFullName() {
		// TODO Auto-generated method stub
		return info.getNome() + " " + info.getCognome();
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		LocalDate dataDiNascita = info.getDataDiNascita().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate oggi = LocalDate.now();
        
        Period periodo = Period.between(dataDiNascita, oggi);
        return periodo.getYears();
	}

}
