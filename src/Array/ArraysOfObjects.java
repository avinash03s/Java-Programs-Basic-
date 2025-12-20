package Array;

public class ArraysOfObjects {
    public static void main(String[] args)
    {
        Student[] st = new Student[6];

        st[0] = new Student("Avinash", 1);
        st[1] = new Student("Pramod", 2);
        st[2] = new Student("Sushil", 3);
        st[3] = new Student("Aniket", 4);
        st[4] = new Student("Ganesh", 5);
        st[5] = new Student("Omkar ", 6);

        for(int i = 0; i < st.length; i++)
        {
            System.out.println("Name: " +st[i].name+ ", "+"Roll no: " +st[i].rollNo);
        }
    }
}
