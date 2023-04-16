package ss10_arrayList.ex.my_list;

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
