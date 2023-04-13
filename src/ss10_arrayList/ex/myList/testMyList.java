package ss10_arrayList.ex.myList;

public class testMyList {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>(3);
        myList.add("Hưng");
        myList.add("Hoa");
        myList.add("Kiệt");
        myList.remove("Hoa");
        myList.remove("Kiệt");
    }
}
