public class GradeBook
{
    String studentName;
    int assignmentScore;
    int examScore;
    double finalGrade;

    public int fixScore(int score)
    {
        if (score < 0) return 0;
        if (score > 100) return 100;
        return score;
    }

    public GradeBook(String name, int aScore, int eScore)
    {
        studentName = name;
        assignmentScore = fixScore(aScore);
        examScore = fixScore(eScore);
    }
    public void calculateResult()
    {
        finalGrade = (double) assignmentScore * 0.4 + (double) examScore * 0.6;
    }

    public void displaySummary()
    {
        System.out.println("Name: " + studentName);
        System.out.println("Raw scores: " + assignmentScore + " | " + examScore);
        System.out.println("Final grade: " + finalGrade + "%");
    }

    public static void main(String[] args)
    {
        GradeBook student = new GradeBook("Daniel", 110, 75);

        student.calculateResult();
        student.displaySummary();
    }
}
