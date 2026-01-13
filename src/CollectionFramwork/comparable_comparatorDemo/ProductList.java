package CollectionFramwork.comparable_comparatorDemo;

import java.util.*;

public class ProductList {

    private int brandId;
    private String brandName;
    private int launchYear;
    private double price;

    public ProductList(int brandId, String brandName, int launchYear, double price) {
        this.brandId = brandId;
        this.brandName = brandName;
        this.launchYear = launchYear;
        this.price = price;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductList{" +
                "brandId=" + brandId +
                ", brandName='" + brandName + '\'' +
                ", launchYear=" + launchYear +
                ", price=" + price +
                '}';
    }
}

class ProductMain {

    public static void main(String[] args) {
        ProductList p1 = new ProductList(8, "Campus", 2016, 2999.0);
        ProductList p2 = new ProductList(6, "Adidas", 1949, 8499.0);
        ProductList p3 = new ProductList(2, "Puma", 1748, 5999.0);
        ProductList p4 = new ProductList(3, "Reebok", 2010, 6499.0);
        ProductList p5 = new ProductList(4, "Woodland", 2019, 3500.0);
        ProductList p6 = new ProductList(1, "Nike", 1964, 7999.0);
        ProductList p7 = new ProductList(7, "Bata", 1894, 500.0);

        List<ProductList> list = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6, p7));

        System.out.println("Sorting By Brand Id");
        Collections.sort(list, new Comparator<ProductList>() {
            @Override
            public int compare(ProductList o1, ProductList o2) {
                return o1.getBrandId() - o2.getBrandId();
            }
        });
        for (ProductList p : list) {
            System.out.println(p);
        }
        System.out.println("-----------------------------------------");


        System.out.println("Sorting By Alphabetical Name (A-Z)");
        Collections.sort(list, new Comparator<ProductList>() {
            @Override
            public int compare(ProductList o1, ProductList o2) {
                return o1.getBrandName().compareTo(o2.getBrandName());
            }
        });
        for (ProductList p : list) {
            System.out.println(p);
        }
        System.out.println("----------------------------------");


        System.out.println("Sorting By Launching Year (Old-New)");
        Collections.sort(list, new Comparator<ProductList>() {
            @Override
            public int compare(ProductList o1, ProductList o2) {
                return (o2.getLaunchYear() - o1.getLaunchYear());
            }
        });
        for (ProductList p : list) {
            System.out.println(p);
        }
        System.out.println("------------------------------------");


        System.out.println("Sorting By Price (Low-High)");
        Collections.sort(list, new Comparator<ProductList>() {
            @Override
            public int compare(ProductList o1, ProductList o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
        for (ProductList p : list) {
            System.out.println(p);
        }
    }
}