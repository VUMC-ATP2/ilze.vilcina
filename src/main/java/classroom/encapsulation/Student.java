package classroom.encapsulation;

import lombok.*;

import java.time.Year;
import java.util.Calendar;
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Student extends Person {
    @Getter
    public int graduationYear;
    private String mailDomain = "@lu.lv";
    @Getter
    private String mail;



    public Student(String accountName) {
        mail = accountName + mailDomain;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        if (this.mail.equals("@lu.lv")) {
            this.mail = mail;
        } else {
            System.out.printf("Your e-mail is %s which is correct one, and it will be not changed\n", this.mail);
        }
    }

    // Create getter / setter for graduationYear
    // if graduationYear is > 2022, then print message
    // that Value cannot be set!
    // Example class -> set graduation year to 2020, get it print it
    // Set graduation year 2023;

//   public int getGraduationYear() {
//        return graduationYear;
//    }

    public void setGraduationYear(int graduationYear) {
        int currentYear = Year.now().getValue();
        if (graduationYear > currentYear) {
            System.out.println("This value can not be set");
        } else {
            this.graduationYear = graduationYear;
        }
    }
}
