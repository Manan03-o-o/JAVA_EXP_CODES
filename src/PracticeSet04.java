public class PracticeSet04 {
    public static void main(String[] args) {
        //Resulting data type after arithmetic operation
       /* byte x = 5;
        int a = 45+56;
        float d = 65.4f+x;
        System.out.println(d);
        double e = 4563+9.6;
        System.out.println(e); */

        // Question 02
        //result of the following expression
       // float a = 7/4*9/2;
       // System.out.println(a);

        //Question 03
        // WAP to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade

        char grade = 'B';
        grade = (char) (grade+8);
        System.out.println(grade);

        // Decrypting the grade
        grade = (char) (grade-8);
        System.out.println(grade);
    }
}
