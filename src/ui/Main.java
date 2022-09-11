package ui;
import model.Set;


public class Main{

    public static void main(String[] args) {

        System.out.println("\n***INTEGER***");

        Set <Integer> setA=new Set <>();

        setA.addElement(1);
        setA.addElement(2);
        setA.addElement(3);

        Set <Integer> setB=new Set <>();

        setB.addElement(3);
        setB.addElement(4);
        setB.addElement(4);
        setB.addElement(5);

        System.out.println("\nSet A: " + setA.toString());
        System.out.println("\nSet B: " + setB.toString());

        System.out.println("\nUnion set A and B: " + setA.union(setB));
        System.out.println("\nIntersection set A and B: " + setA.intersection(setB));
        System.out.println("\nDifference set A - B: " + setA.difference(setB));

        System.out.println("\nIs 1 in set A?: " + setA.showElement(1));
        System.out.println("\nIs 1 in set B?: " + setB.showElement(1));

        System.out.println("\n\n***STRING***");

        Set <String> setC=new Set <>();

        setC.addElement("b");
        setC.addElement("c");
        setC.addElement("c");
        setC.addElement("a");

        setC.deleteElement("j");


        Set <String> setD=new Set <>();

        setD.addElement("c");
        setD.addElement("d");
        setD.addElement("e");
        setD.addElement("f");

        setD.deleteElement("f");
 

        System.out.println("\nSet C: " + setC.toString());
        System.out.println("\nSet D: " + setD.toString());

        System.out.println("\nUnion set C and D: " + setC.union(setD));
        System.out.println("\nIntersection set C and D: " + setC.intersection(setD));
        System.out.println("\nDifference set C -  D: " + setC.difference(setD));

        System.out.println("\nIs d in set C?: " + setC.showElement("d"));
        System.out.println("\nIs d in set D?: " + setD.showElement("d"));
    }

}
