package entities;

import java.time.LocalDate;

import javax.persistence.Column;
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
	@Column(name = "cardnumber")
	private long codeCard;
	
	@Override
	public String toString() {
		return  "User -> [codeCard] = " + codeCard + ", [name] = " + name + ", [surname] = " + surname + ", [birth] = " + birth;
	}
}
