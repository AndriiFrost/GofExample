package com.lviv.frost.gof.methodfactory.factory;

import com.lviv.frost.gof.methodfactory.logger.ILogger;
import com.lviv.frost.gof.methodfactory.logger.impl.EnterpriseLogger;
import com.lviv.frost.gof.methodfactory.logger.impl.Log4NetLogger;

public class LoggerProviderFactory {

    public static ILogger getLoggingProvider(LoggerProvider logProvider) {
        switch (logProvider) {
            case ENTERPRISE_LOGGER:
                return new EnterpriseLogger();
            case LOG_4_NET:
                return new Log4NetLogger();
            default:
                throw new IllegalStateException("Unknown logger");
        }
    }
}
