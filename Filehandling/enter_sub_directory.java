package Filehandling;
import java.io.*;
import java.util.*;
public class enter_sub_directory {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String dir;
        System.out.println("enter the directory name :");
        dir=sc.nextLine();
        File ob=new File(dir);
        File[] obj =ob.listFiles();
        for(File ab:obj){
            if(ab.isDirectory())
                System.out.println("dir :"+ab);
            else
                System.out.println("file :"+ab);
        }
//        System.out.println(Arrays.toString(obj));
        while(true)
        {
            System.out.println("do you want to enter the sub directory :");
            String choice=sc.nextLine();
            if (choice.equals("yes")){
                System.out.println("enter the sub directory name :");
                String sub=sc.nextLine();
                File abc=new File(dir,sub);
                File abcd[]=abc.listFiles();
                assert abcd != null;
                for(File xyz:abcd){
                    if (xyz.isDirectory())
                    System.out.println("directory :"+xyz);
                    else
                        System.out.println("File :"+xyz);
                }

                }
            else if (choice.equals("no")){
            System.out.println("finished");
            break;

            }

        }
    }

}
