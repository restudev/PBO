import java.sql.Date;

public class AudioVisual extends Resource {
    private String Production_Company;
    private String type;
    private int year_of_release;

    public String getProduction_Company() {
        return Production_Company;
    }

    public void setProduction_Company(String companyName) {
        Production_Company = companyName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear_of_release() {
        return year_of_release;
    }

    public void setYear_of_release(int year) {
        this.year_of_release = year;
    }

    public String dueDate(Date borrowedDate) { 
        super.setDueDate(borrowedDate);
        return dueDate(borrowedDate);
    }

    
}
