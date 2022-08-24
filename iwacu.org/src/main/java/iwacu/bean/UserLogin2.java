package iwacu.bean;

public class UserLogin2 {
    protected int id;
    protected String name;
    protected String department;
    protected String country;

    public UserLogin2() {}

    public UserLogin2(String name, String department, String country) {
        super();
        this.name = name;
        this.department = department;
        this.country = country;
    }

    public UserLogin2(int id, String name, String department, String country) {
        super();
        this.id = id;
        this.name = name;
        this.department = department;
        this.country = country;
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
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
}
