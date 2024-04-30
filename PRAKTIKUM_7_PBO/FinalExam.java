public class FinalExam extends GradeActivity {
    private int numberOfQuestion;
    private int numberOfMiss;
    double poinsPerQuestion;

    public FinalExam(int questions, int missed ){
        numberOfQuestion = questions;
        numberOfMiss = missed;
    }
    public double getPointsPerQuestion(){
        return numberOfQuestion*poinsPerQuestion;
    }
    public int getNumberMissed(){
        return numberOfMiss;
    }
    
}
