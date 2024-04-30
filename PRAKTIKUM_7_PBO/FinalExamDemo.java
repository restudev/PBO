public class FinalExamDemo {
    public static void main(String[] args) {
        FinalExam fe = new FinalExam(7,3);
        fe.poinsPerQuestion = 10;
        System.out.println("Point   : " + fe.getPointsPerQuestion());
        System.out.println("Missed  : " +fe.getNumberMissed());
        fe.setScore(fe.getPointsPerQuestion());
        System.out.println("Grade   : " + fe.getGrade());
    }   
}
