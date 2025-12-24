package CollectionFramwork.ConvertingArrayToArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsingAsListMethod {

    public static void main(String[] args) {
        String[] array = new String[]{"Java", "C++", "Python", "Html", "Css"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));//Arrays.asList();
        System.out.println(list);

    }
}

class UsingAddAllMethod {

    public static void main(String[] args) {
        String[] array = new String[]{"Java", "C++", "Python", "Html", "Css"};

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, array);//using Collections.addAll();

        System.out.println(list);
    }
}

class UsingArrayListAddALlMethod{

    public static void main(String[] args) {
        String [] array = new String[]{"Java","C++","Python","Html","Css"};

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(array));

        System.out.println(list);
    }
}
