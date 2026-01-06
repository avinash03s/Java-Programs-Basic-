package CollectionFramwork.myOwnClasses;

public class CustomArrayListDemo {

    public static void main(String[] args) {
        CustomArrayList1<String> list = new CustomArrayList1<>();
        list.add("Avinash");
        list.add("Arjun");
        list.add("Ram");
        list.add("Karan");

        System.out.println(list);
        System.out.println("Size : "+ list.size());
        System.out.println("Get element: "+ list.get(1));
        System.out.println("Contains: "+ list.contains("Avinash"));
        System.out.println("get IndexOf: "+ list.getIndexOf("Arjun"));
        System.out.println("Empty: "+ list.isEmpty());
        System.out.println("Remove form List: "+ list.remove(3));

        list.toArray();
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("Size: " + list.size());
    }
}
