package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击间距中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) throws Exception {
        String filePath = "D:\\spt\\Groceries.txt";
        double totalPrice = 0.0;

        FileReader fileReader = new FileReader(filePath);
        BufferedReader reader = new BufferedReader(fileReader);

        String line;

        while ((line = reader.readLine()) !=null){
            String[] elements = line.split(",");
            if (elements.length == 4) {
                String id = elements[0];
                String itemName = elements[1];
                String quantity = elements[2];
                double price = Double.parseDouble(elements[3]);

                // Display each line from the file
                System.out.println("ID: " + id + ", ItemName: " + itemName + ", Quantity: " + quantity + ", Price: " + price);

                // Calculate the total price

                totalPrice +=price;
            }
        }
        System.out.println("Total Price: " + totalPrice);
                reader.close();
        }

        //TIP 当文本光标位于高亮显示的文本处时按 <shortcut actionId="ShowIntentionActions"/>
        // 查看 IntelliJ IDEA 建议如何修复。

    }
