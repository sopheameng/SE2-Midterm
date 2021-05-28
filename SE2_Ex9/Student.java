package ex9;

public class Student {
    private  int id;
    private  String DOB;
    private  int Telephone;
    private String name;
    private  String group;
    private String country;
    private String city;

    public Student(int id, String name, String DOB, int telephone, String city, String country,String group) {
        this.id = id;
        this.DOB = DOB;
        Telephone = telephone;
        this.name = name;
        this.country = country;
        this.city = city;
        this.group = group;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getDOB() {
        return DOB; }
    public void setDOB(String DOB) {
        this.DOB = DOB; }

    public int getTelephone() {
        return Telephone;
    }
    public void setTelephone(int telephone) {
        Telephone = telephone;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }

}
