package ru.mirea.laba_12;

public class Shirt {
    private final String id;
    private final String brand;
    private final String color;
    private final String size;

    public Shirt(String text) {
        this.id = text.split(",")[0];
        this.brand = text.split(",")[1];
        this.color = text.split(",")[2];
        this.size = text.split(",")[3];
    }

    @Override
    public String toString() {
        return "Shirt:\n" +
                "\tid = " + id +
                "\n\tbrand = " + brand +
                "\n\tcolor = " + color +
                "\n\tsize = " + size + "\n";
    }

    public static void main(String[] args) {
        String[] shirts = new String[]{ "S001,Black Polo Shirt,Black,XL", "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL", "S004,Blue Polo Shirt,Blue,M", "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL", "S007,White T-Shirt,White,XL", "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S", "S010,Orange T-Shirt,Orange,S", "S011,Maroon Polo Shirt,Maroon,S"
        };
        for(String i : shirts){
            Shirt shirt = new Shirt(i);
            System.out.println(shirt);
        }
    }
}
