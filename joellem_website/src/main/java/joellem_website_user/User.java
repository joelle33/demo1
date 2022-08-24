package joellem_website_user;

public class User {
    protected int id;
    protected String name;
    protected String department;
    protected String country;

    public User() {}

    public User(String name, String department, String country) {
        super();
        this.name = name;
        this.department = department;
        this.country = country;
    }

    public User(int id, String name, String department, String country) {
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
