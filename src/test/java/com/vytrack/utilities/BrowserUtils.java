package com.vytrack.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {

    /*
    It accepts List<WebElements> and return List<Strings>
     */

    public static List<String> getElementsText(List<WebElement>webElementList){
        //Placeholder empty list of web element
        List<String> webElementAsString = new ArrayList<>();

        //Looping through list of web elements and storing text into placeholder list
        for (WebElement each : webElementList) {
            webElementAsString.add(each.getText());

        }
        //returning final List<String>
        return webElementAsString;
    }

    /*
    Method to assert title
     */

    public static void titleVerification(String expectedTitle){
        String actualTitle = com.vytrack.utilities.Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.equals(expectedTitle));

        //return actualTitle.equals(expectedTitle);
    }



/*
We will create utility methods for repeated steps that can be used
in browsers, and store in this class.
 */



        //create method name: wait
        //converting milliseconds to seconds
        //handle checked exception

        public static void sleep(int second) {
            second *= 1000;
            try {
                Thread.sleep(second);
            } catch (InterruptedException e) {
                System.out.println("something happened in sleep method");

            }
        }


}
