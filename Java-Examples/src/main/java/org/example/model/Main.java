package org.example.model;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.example.model.ClothingItem;
import org.example.model.ClothingSize;
import org.example.model.Frock;
import org.example.model.Shoes;
public class Main {
    public static void main(String []args){
        //Using List
        /*List<String> colors = new ArrayList<>();
        colors.add("REd");
        colors.add("orange");

        colors.add("black");
        for (int i=0;i<colors.size();i++){
            System.out.println(colors.get(i));
        }*/

        //using maps
        Map<String,ClothingItem> items=new HashMap<>();
        items.put("frock",new Frock(ClothingSize.M,19.99,23));
        items.put("shoes",new Shoes(ClothingSize.M,19.99,23));
        //var anItem=items.get("shoes");
        //displayItemDetils(anItem);
var keys=items.keySet();
for(String key:keys){
    var item=items.get(key);
            displayItemDetils(item);
}
       /* var item = new Frock(ClothingSize.L,200,3);

        displayItemDetils(item);
        var shoes= new Shoes(ClothingSize.L,29.99,1);
        displayItemDetils(shoes);*/
        /*String [] color = new String[4];
        color[0]="Red";
        color[1]="green";

        color[2]="blue";

        color[3]="orange";
        for (int i =0;i<color.length;i++){
            System.out.println(color[i]);
        }


        ClothingItem[] items ={
                new Frock( ClothingSize.M,19.9,2),
        new Shoes( ClothingSize.M,19.9,2)

};
        for (ClothingItem item:items){
            displayItemDetils(item);
        }*/

    }

    private static void displayItemDetils(ClothingItem item) {
        var totalPrice = item.getPrice()* item.getQuantity();
        var formatter= NumberFormat.getCurrencyInstance();
        var output =String.format("Your %s %s order will cost %s", item.getSize(), item.getType(),formatter.format(totalPrice));
        System.out.println(output);
    }
}
