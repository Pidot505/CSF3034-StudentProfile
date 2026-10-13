package studentprofile;

public class GradeMessage {
    
    public void PrintGrade(){
        System.out.println("Grade: Excellent");
    }
    
    public static void main(String[] args) {
        
        GradeMessage grade = new GradeMessage();
        grade.PrintGrade();
        
    }
}
