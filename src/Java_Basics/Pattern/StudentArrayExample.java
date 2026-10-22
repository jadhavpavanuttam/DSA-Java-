package Java_Basics.PatternPrinting;

public class StudentArrayExample {
    int RollNo ;
    String Name;
    StudentArrayExample(int RollNo,String Name)
    {
        this.RollNo=RollNo;
        this.Name=Name;
    }
    public static void main(String[] args) {

        StudentArrayExample []studentArrayExamples=new StudentArrayExample[5];

        studentArrayExamples[0]=new StudentArrayExample(1,"Pavan");
        studentArrayExamples[1]=new StudentArrayExample(2,"Pavan");
        studentArrayExamples[2]=new StudentArrayExample(3,"Bharat");
        studentArrayExamples[3]=new StudentArrayExample(4,"Jagruti");
        studentArrayExamples[4]=new StudentArrayExample(5,"Manaswi");
    for(int i=0;i<5;i++)
        System.out.println("Student At Rollno  "+studentArrayExamples[i].RollNo+" Name is  :"+studentArrayExamples[i].Name);
    }
}
