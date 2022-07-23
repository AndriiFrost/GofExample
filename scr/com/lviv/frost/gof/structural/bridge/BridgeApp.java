package com.lviv.frost.gof.structural.bridge;

import com.lviv.frost.gof.structural.bridge.developer.impl.CppDeveloper;
import com.lviv.frost.gof.structural.bridge.developer.impl.JavaDeveloper;
import com.lviv.frost.gof.structural.bridge.program.BankSystemProgram;
import com.lviv.frost.gof.structural.bridge.program.Program;
import com.lviv.frost.gof.structural.bridge.program.StockExchangeProgram;

import java.util.List;

public class BridgeApp {
    public static void main(String[] args) {
        List<Program> programs = List.of(
                new BankSystemProgram(new JavaDeveloper()),
                new StockExchangeProgram(new CppDeveloper()));

        for (Program program : programs) {
            program.developProgram();
        }
    }
}
