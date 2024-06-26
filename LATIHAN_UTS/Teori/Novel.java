public class Novel extends Print{
    private String genre;
    private String blurb;

    public String getGenre(){
        return genre;
    }

    public void setGenre(String genreName){
        this.genre = genreName;
    }

    public String getBlurb(){
        return blurb;
    }

    public void setBlurb(String blurbSummary){
        this.blurb = blurbSummary;
    }

    
}
