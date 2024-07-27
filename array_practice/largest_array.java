package array_practice;

import org.w3c.dom.ls.LSOutput;

public class largest_array {
    public static void main(String[] args) {
        int array[]={4,5,87,8,88,15,89,9,33,57};
//        int max=array[0];
        for (int i=0 ;i<array.length;i++) {
            for (int j=i;j<array.length;j++) {
                int temp = 0;

                if(array[i]>array[j]){
                temp=array[i];
                array[i]=array[j];
                array[j]=temp;
                    int size=array.length;
//                    max=array[i];
                }

            }

            System.out.println(+array[i]);


            }




    }

    }


