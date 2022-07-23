package com.lviv.frost.gof.creational.methodfactory;

import com.lviv.frost.gof.creational.methodfactory.factory.LoggerProvider;
import com.lviv.frost.gof.creational.methodfactory.factory.LoggerProviderFactory;
import com.lviv.frost.gof.creational.methodfactory.logger.ILogger;

public class MethodFactoryApp {
    public static void main(String[] args) {
        LoggerProvider providerType = getTypeOfLoggingProviderFromConfigFile();
        ILogger logger = LoggerProviderFactory.getLoggingProvider(providerType);
        logger.logMessage("Hello Factory Method Design Pattern.");
    }

    private static LoggerProvider getTypeOfLoggingProviderFromConfigFile() {
        // It's hardcode for simple example
        return LoggerProvider.LOG_4_NET;
    }
}
