import java.sql.Date;

public class Resource {
    String title;
    Boolean borrowed_status = true;
    String date_borrowed;
    String due_date; //harusnya ini tipenya date 

    public String getTitle(){
        return title;
    }
    
    public void setTitle(String resourceTitle){
        this.title = resourceTitle;
    }

    public Boolean getBorrowedStatus(){
        return borrowed_status;
    }

    public void setBorrowedStatus(Boolean status){
        this.borrowed_status = status;
    }

    public String getDateBorrowed(){
        return date_borrowed;
    }

    public void setBorrowedDate(String date){
        this.date_borrowed = date;
    }

    public String getDueDate(){
        return due_date;
    }

    public void setDueDate(Date borrowedDate){
        this.due_date = borrowedDate.toString(); //ubah tipe data date jadi string biar sama kek tipe data due_date
    }

    
}

