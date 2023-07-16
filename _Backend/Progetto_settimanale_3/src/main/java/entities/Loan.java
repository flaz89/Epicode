package entities;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Loan {
	@Id
	@GeneratedValue
	private UUID loanId;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private User user;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private BookMag product;
	private LocalDate startLoan;
	private LocalDate giveBackForecast; //getStartLoan().plusDays(30);
	private LocalDate finishLoan;
	
	public Loan(User user, BookMag product, LocalDate startLoan, LocalDate finishLoan) {
		//this.loanId = UUID.randomUUID();
		this.user = user;
		this.product = product;
		this.startLoan = startLoan;
		this.finishLoan = finishLoan;
	}

	@Override
	public String toString() {
		return "[loanId] = " + loanId + "\n" + user + "\n" + product + "\n[startLoan] = " + startLoan
				+ "\n[giveBackForecat] = " + getGiveBackForecast() + "\n[finishLoan] = " + finishLoan;
	}
	
	
	public LocalDate getGiveBackForecast() {
		LocalDate giveBack = this.startLoan.plusDays(30);
		return giveBack;
	}
}
