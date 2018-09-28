package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s=System.getProperty("user.name");
        System.out.println("Username: "+s);
        String s1=System.getProperty("os.name");
        System.out.println("Operation System: "+s1);
        String s2=System.getProperty("os.version");
        System.out.println("OS version: "+s2);
        String s3=System.getProperty("os.arch");
        System.out.println("OS's architecture: "+s3);
        String s4=System.getProperty("java.vendor.url");
        System.out.println("URL : "+s4);
        String s5=System.getProperty("java.version");
        System.out.println("java version: "+s5);
        String s6=System.getProperty("java.class.version");
        System.out.println("Java class version: "+s6);
        String s7=System.getProperty("java.vendor");
        System.out.println("Maked by: "+s7);
    }
}
