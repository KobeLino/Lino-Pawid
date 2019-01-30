package studentaccount;
public class StudentAccount {                                                                              
    public static void main(String[] args) {
       stuacc Student1 = new stuacc ( "CITCS", "2nd Term", "SY 2018-2019");       
           
       Student1.setIdNumber("18-5633-327");
       Student1.setFirstName("Keith");
       Student1.setLastName("Pawid");
       Student1.setMajor(" Data Analytics");
       Student1.setAcademicProgram("BSIT");
       
       Student1.print();
    
       stuacc Student2 = new stuacc ( "CITCS", "2nd Term", "SY 2018-2019");       
       
       Student2.setIdNumber("18-4350-931");
       Student2.setFirstName("Kobe");
       Student2.setLastName("Lino");
       Student2.setMajor(" Net Sec Track");
       Student2.setAcademicProgram("BSIT");   
    
       Student2.print();}
}    

