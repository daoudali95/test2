import java.util.ArrayList;
import java.util.Scanner;

public class Student2 {
//    static void
    public static void main(String[] args) {
        String s;
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to enter any courses?");
        System.out.println("enter 1 for Yes and 0 for No");

        ArrayList<String> student = new ArrayList<>();
        ArrayList<String> sub = new ArrayList<>();
        int input = scan.nextInt();
//        System.out.println(student.size());
        if(input==1){

            for (int i=0; i<10; i++){
                System.out.println("enter course or enter cl to complete");
                String c = scan.nextLine();
                if (c.equals("cl")){
                    break;
                }
                else{
                    student.add(c);
                }

            }

        }
        else{
            System.out.println("Thank you for your time");
            System.exit(0);
        }

        System.out.println("Enter Your Information:");
        System.out.println("enter Your name:");
        String name = scan.nextLine();
        System.out.println("Enter Your age");
        int age = scan.nextInt();
        System.out.println("Enter Your roll no.");
        int r_num = scan.nextInt();
        System.out.println("enter your University name:");
        String uni = scan.nextLine();
        System.out.println();

//        System.out.println(student);
        System.out.println();
        System.out.println("Choose the courses which you want to learn or enter 0 for complete:");
        System.out.println();
        int a = 1;
        for(String subject : student) {
            System.out.print(a +"."+ subject+"  ");
            a++;
        }
        System.out.println();
        System.out.println();

        for (int k = 0; k < student.size(); k++) {
//            String[] sub;
            try {
                Scanner scan1 = new Scanner(System.in);
                System.out.println("enter your choice");
                int input1 = scan1.nextInt();
                if(input1 > student.size()){
                    System.out.println("that index did,nt exist");
                    System.out.println("choose again");
                        k = k - 1;
                    continue;
                }
                else if(input1 < student.size()) {
//                    String bk;
//                    String bk1;
//                    for (int i = 0; i < sub.size(); i++) {
//            System.out.println(sub.get(i));
//                        bk = sub.get(i);
//                        bk1 = sub.get(input1);
//                        if (bk.equals(bk1)) {
//                            System.out.println("this course was already choosed");
//                            k = k - 1;
//                        }
//                    else {
                            System.out.println("Booked");
                            s = student.get(input1);
                            sub.add(s);
//                        }
//                  }
                }
                if (input1==0){
                    break;
                }
            }
            catch(Exception e){
                System.out.println("Please choose the course's index number");
//                System.out.println(e);
                        k = k - 1;
                continue;
            }

        }
        System.out.println();
        System.out.println();
        System.out.println("your information:");
        System.out.println(name);
        System.out.println(r_num);
        System.out.println(uni);
        System.out.println(age);
        System.out.println("the courses you choosed");
        System.out.println(sub);
    }
}
