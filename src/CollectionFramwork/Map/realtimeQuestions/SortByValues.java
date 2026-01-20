package CollectionFramwork.Map.realtimeQuestions;

import java.util.*;

class Product {
    private int brandNo;
    private String brandName;

    public Product(int brandNo, String brandName) {
        this.brandNo = brandNo;
        this.brandName = brandName;
    }

    public int getBrandNo() {
        return brandNo;
    }

    public void setBrandNo(int brandNo) {
        this.brandNo = brandNo;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "brandNo=" + brandNo +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}

public class SortByValues {

    public static void main(String[] args) {
        Product p1 = new Product(55, "E RealMe");
        Product p2 = new Product(11, "B Boat");
        Product p3 = new Product(33, "A Sony");
        Product p4 = new Product(22, "D I Phone");
        Product p5 = new Product(44, "C OnePules");

        Map<Integer, String> productMap = new HashMap<>();
        productMap.put(p1.getBrandNo(), p1.getBrandName());
        productMap.put(p2.getBrandNo(), p2.getBrandName());
        productMap.put(p3.getBrandNo(), p3.getBrandName());
        productMap.put(p4.getBrandNo(), p4.getBrandName());
        productMap.put(p5.getBrandNo(), p5.getBrandName());

        List<Map.Entry<Integer, String>> list = new ArrayList<>(productMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        System.out.println(list);
    }
}
