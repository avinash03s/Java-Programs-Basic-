package Loop.StarPattern;

public class SquarStarPattern {
    public static void main(String[] args) {
        for (int i=1;i<5;i++){
            for (int j=1;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//*****
//*****
//*****
//*****
//*****

class TringleStarPattern{
    public static void main(String[] args) {
        for (int i=1;i<5;i++){
            for (int j=i;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//*****
//****
//**
//*

class StraightTringlePattern{
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//*
//**
//****
//*****