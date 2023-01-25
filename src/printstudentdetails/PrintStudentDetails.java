package printstudentdetails;

/**
  * Array of objects - java example: printing studentDetails
  * project - share to GitHub: collaboration tool,tracking changes keep history - version control software
  * last week - char[] reverse = new char[word.length()]; -reverse of word
  * print 3 students details are name, age. Store in array then print - array of objects
  * Student[] list = new Student[3]; - array of object declaration
  * Student s1 = new Student(); - object declaration
 */
public class PrintStudentDetails {

    /**
     * 
     */
    public static void main(String[] args) {
        //used for user interaction printing, input
        
        Student[] list = new Student[3]; //array of object declaration
        //create student objects
        Student s1 = new Student();
        s1.setName("Peter");
        s1.setAge(20);
        list[0] = s1; //store object in array
        System.out.println(list[0].getName() + list[0].getAge());
    }

}
