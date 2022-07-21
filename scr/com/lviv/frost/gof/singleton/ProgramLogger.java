package com.lviv.frost.gof.singleton;

import java.util.Objects;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private int logCount = 0;

    public static synchronized ProgramLogger getInstance() {
        if (Objects.isNull(programLogger)) {
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    private ProgramLogger() {

    }

    public void addLog() {
        logCount++;
    }

    public int getLogCount() {
        return logCount;
    }
}
