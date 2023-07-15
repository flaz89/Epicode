package entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private String name;
	private String surname;
	private LocalDate birth;
	@Id
	private int codeCard;
	
//	public User(String _name, String _surname, LocalDate _birth, int _codeCard) {
//		this.name = _name;
//		this.surname = _surname;
//		this.birth = _birth;
//		this.codeCard = _codeCard;
//	}
	
}
