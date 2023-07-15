package entities;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Loan {
	@Id
	@GeneratedValue
	private UUID loanId;
	@ManyToOne
	private User user;
	@ManyToOne
	private BookMag product;
	private LocalDate startLoan;
	private LocalDate giveBackForecat = this.startLoan.plusDays(30);
	private LocalDate finishLoan;
}
