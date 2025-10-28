package Old_Javarush.Core.Level3_Interface.Lecture11_11;

public class Person implements RepkaItem{
    private String name;
    private String namePadezh;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    @Override
    public String getNamePadezh() {
        return namePadezh;
    }

    public void setNamePadezh(String namePadezh) {
        this.namePadezh = namePadezh;
    }

    public void pull(Person person) {
        System.out.println(name + " за " + person.getNamePadezh());
    }
}
