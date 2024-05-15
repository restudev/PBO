public class Magazine extends Print{
    int ISSN;
    int issue;

    public int getISSN(){
        return ISSN;
    }

    public void setISSN(int issn_num){
        this.ISSN = issn_num;
    }

    public int getIssue(){
        return issue;
    }

    public void setIssue(int issue_num){
        this.issue = issue_num;
    }
    
}
