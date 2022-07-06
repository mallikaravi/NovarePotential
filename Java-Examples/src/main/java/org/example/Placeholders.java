package org.example;

public class Placeholders {
    public static void main (String [] args){
       /*     var item="Shirt";
            var size="M";
            var price =14.99;
            var color="Red";

    var template ="Clothing item: %s, size %s, color %s, $%.2f";
    var itemString =String.format(template,item,size,color,price);
            System.out.println(itemString);
*/

String s1="Hello";
var s2="Hello";
if (s1==s2){
    System.out.println("They match");
}
        else{
            System.out.println("They  dont match");
        }
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        if (s3==s4){
            System.out.println("They match");
        }
        else{
            System.out.println("They  dont match");
        }
        if (s3.equals(s4)){
            System.out.println("They match");
        }
        else{
            System.out.println("They  dont match");



        }
       var s5="Welcome to India";
        System.out.println("length of string:"+s5.length());

        int   position = s5.indexOf("India");
        System.out.println("The position is:"+position);

        var sub = s1.substring(5);
        System.out.println(sub);

        String s6="Welcome";
        var len =s5.length();
        System.out.println(len);
        var trimmed = s6.trim();

        System.out.println(trimmed);
    }
}
