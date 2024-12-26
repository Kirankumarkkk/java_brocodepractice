package packages.packagemain;

import packages.packagechild.packagechild;

public class packagemain {
    public static void main(String[] args) {

        packagechild childpackage= new packagechild();

        System.out.println("packagechild created instance with name childpackage");
    }
}
