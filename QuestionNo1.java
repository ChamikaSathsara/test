class Student {
    String SID;
    String Sname;
    int Sub1,Sub2,Sub3;
    public void getStuData(String SID, String Sname)
    {
        this.SID=SID;
        this.Sname=Sname;
    }
    public void getStuMarks(int Sub1,int Sub2, int Sub3)
    {
    }
    public void totalMarks()
    {
       int tot=Sub1+Sub2+Sub3;
        System.out.println("SID: "+SID);
        System.out.println("Name: "+Sname);
        System.out.println("Total Marks : "+tot);

    }
}

public class QuestionNo1{

    public static void main(String[] args)
    {
        
    }
}