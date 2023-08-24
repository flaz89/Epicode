package deviceManagement.esercizio_1;

import lombok.Getter;

@Getter
public class UserData {
	private String fullName;
    private int age;

    public void getData(DataSource ds) {
        fullName = ds.getFullName();
        age = ds.getAge();
    }
}
