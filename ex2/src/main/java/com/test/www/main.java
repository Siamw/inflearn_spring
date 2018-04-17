package com.test.www;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class main {

    public static void main(String[] args){

        String configLoc = "classpath:applicationCTX.xml";//path
        AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
        MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class);


        myCalculator.add();
        myCalculator.sub();
        myCalculator.mul();
        myCalculator.div();


    }
}
 