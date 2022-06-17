package classroom.encapsulation;

public class Example {
    public static void main(String[] args) {

        Student ilze = new Student("ilze.vilcina");
        System.out.println(ilze.getMail());

        ilze.setMail("ilze@lu.lv");
        ilze.setName("Ilze");
        ilze.setLastname("Vilcina");
        ilze.setHasMood(true);
        System.out.println(ilze);

        Student zana = new Student("");
        System.out.println("Zana email: " + zana.getMail());
        zana.setMail("zanna@lu.lv");
        System.out.println("Zana email: " + zana.getMail());
        zana.setMail("zanna2@lu.lv");

        zana.setGraduationYear(2023);
        System.out.println(zana.getGraduationYear());
        zana.setGraduationYear(2020);
        System.out.println(zana.getGraduationYear());


    }
}
