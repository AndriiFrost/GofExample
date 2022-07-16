package com.lviv.frost.gof.methodfactory.logger.impl;

import com.lviv.frost.gof.methodfactory.logger.ILogger;

public class Log4NetLogger implements ILogger {
    @Override
    public void logMessage(String message) {
        System.out.println(String.format("%s: %s","Log4Net",message));
    }
}
