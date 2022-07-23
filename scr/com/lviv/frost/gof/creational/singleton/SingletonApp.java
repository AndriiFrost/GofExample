package com.lviv.frost.gof.creational.singleton;

public class SingletonApp {
    public static void main(String[] args) {
        ProgramLogger instance = ProgramLogger.getInstance();
        instance.addLog();
        System.out.println(instance.getLogCount());
        System.out.println("=================");
        System.out.println(instance);
        System.out.println(ProgramLogger.getInstance().toString());
        System.out.println(ProgramLogger.getInstance().toString());
    }
}
