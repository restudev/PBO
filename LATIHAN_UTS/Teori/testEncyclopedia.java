import java.sql.Date;

public class testEncyclopedia {
    public static void main(String[] args){
        Encyclopedia encyclopedia = new Encyclopedia();
        Novel novel = new Novel();
        encyclopedia.setTitle("apaa");
        encyclopedia.setAuthor("Restu");
        encyclopedia.setPublisher("Siapa");
        novel.setGenre("hmmmm");

        super.se

        System.out.println("Title\t: " + encyclopedia.getTitle());
        System.out.println("Author\t: " + encyclopedia.getAuthor());
        System.out.println("Publisher\t: " + encyclopedia.getPublisher());
        System.out.println("Genre\t: " + novel.getGenre());


        //implementasi untuk mencetak Resource
        Resource book = new Resource();
        book.setTitle("Java Programming");
        book.setBorrowedStatus(true);
        book.setBorrowedDate("2024-05-13");
        Date dueDate = Date.valueOf("2024-06-13");
        book.setDueDate(dueDate);

        System.out.println("Judul buku: " + book.getTitle());
        System.out.println("Status pinjam: " + book.getBorrowedStatus());
        System.out.println("Tanggal pinjam: " + book.getDateBorrowed());
        System.out.println("Tanggal jatuh tempo: " + book.getDueDate());
    }
}




