package com.nhlstenden.jallersma.maventemplate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.spi.LoggerContextFactory;

public class MyMath {
    Logger logger = LogManager.getLogger(MyMath.class);
    public int power(int n) {
        if (n < 0)
        {
            return 0;
        } else if (n > 30)
        {
            logger.debug("n > 30. Will result in value beyond max size on int");
            return Integer.MAX_VALUE;
        }
        return 1 << n;
    }
}
