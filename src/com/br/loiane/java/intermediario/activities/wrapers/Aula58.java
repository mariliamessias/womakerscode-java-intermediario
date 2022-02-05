package com.br.loiane.java.intermediario.activities.wrapers;

public class Aula58 {
    public static void main(String[] args) {

        //autoboxing
        Short num7 = 1;
        Byte num8 = 10;
        Integer num9 = 100;
        Long num10 = 100l;
        Float num11 = 3.5f;
        Double num12 = 3.555;
        Boolean flag2 = true;
        Character x = 'b';

        //autounboxing
        int num13 = num9;

        //autoboxing em expressões
        num9++;

        System.out.println(num9);

        //auto unboxing num9 -> autoBoxing num13/num9 -> num14
        Integer num14 = num13/num9;

        //mau uso
        Double a, b, c;
        a = 10.0;
        b = 12.0;
        c = 4.7;

        Double media = (a+b+c)/3;
        System.out.println(media);
    }
}
