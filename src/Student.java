public class Student {
    private int id;
    private String name;
    private String surname;
    private String middlename;
    private int dateOf;

    public Student(int id, String name, String surname, String middlename,int dateOf) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;
        this.dateOf = dateOf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public int getDateOf() {
        return dateOf;
    }

    public void setDateOf(int dateOf) {
        this.dateOf = dateOf;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", middlename='" + middlename + '\'' +
                '}';
    }
}
