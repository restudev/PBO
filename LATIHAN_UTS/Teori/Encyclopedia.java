public class Encyclopedia extends Print{
    int volume;
    int edition;

    // Encyclopedia(String title, String author, int isbn, int volume){
    //     this.title = title;
    //     this.author = author;
    //     this.isbn = isbn;
    //     this.volume = volume;
    // }

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volumeNum){
        this.volume = volumeNum;
    }

    public int getEdition(){
        return edition;
    }

    public void setEdition(int editionNum){
        this.edition = editionNum;
    }
    
}
