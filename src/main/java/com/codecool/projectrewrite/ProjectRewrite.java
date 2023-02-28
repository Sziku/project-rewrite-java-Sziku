package com.codecool.projectrewrite;

import java.util.Arrays;

public class ProjectRewrite {
    public static void main(String[] args) {

        System.out.println("Minimum: "+min(1,5));
        System.out.println("Minimum: "+min(5,1));
        int[] array= {1,2,3,4,5,5,6456,46355,3425,345,34,534,534,5,435,43,534,543};
        System.out.println("Max value: "+max(array));

        System.out.println("Array length: "+length(array));


        System.out.println("Multiply is: "+multiply(5,-10));

        System.out.println("Power is: "+pow(2,10));

        System.out.println("Divide is: "+ Arrays.toString(divmod(-43,-21)));
    }

    private static int min(int x, int y) {

        return (x>y) ? y : x;
    }

    private static int max(int[] values) {
        int number = values[0];
        for (int x : values) {
            if(x>number){
                number=x;
            };
        }
        return  number;
    }

    private static int length(int[] values) {
        int length = 0;
        for (int x : values){
            length++;
        }

        return length;

    }

    private static int multiply(int x, int y) {
        int sum =0;
        for (int i = 0; i <y ; i++) {
            sum = sum + x;
        }
        return sum;

    }

    private static int pow(int x, int y) {
        int sum =1;
        for (int i = 0; i <y ; i++) {
            sum = sum * x;
        }
        return sum;


    }

    private static int[] divmod(int x, int y) {

        int[] div = new int[2];
        int result = 0;
        int negative =0;
        int maradek =0;

        if(x<0 && y<0){
            x = x * (-1);
            y = y * (-1);
        } else if (x<0) {
            x = x * (-1);
            negative =1;
        } else if (y<0){
            y = y * (-1);
            negative=1;
        }

        while (x>y*result) {
            result++;
        }

        if (negative == 1) {
            result = result *(-1);
        }

        if(result*y>x){
            result = result -1;
            maradek = x-result*y;
        }


        div[0]=result;

        if(x<0){
            div[1]=maradek*(-1);
        }
        else
            div[1]=maradek;

        return div;

    }
}
