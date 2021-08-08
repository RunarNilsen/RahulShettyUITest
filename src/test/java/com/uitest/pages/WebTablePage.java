package com.uitest.pages;

import com.uitest.utilities.BrowserUtils;
import com.uitest.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class WebTablePage extends BasePage{

    @FindBy(xpath = "//table[@class='table-display']//tr[1]")
    public List<WebElement> webTableExampleHeader;

    @FindBy(xpath = "//div[@class='tableFixHead']//tbody//td[4]")
    public List<WebElement> fixedTableAmounts;

    @FindBy(xpath = "//div[@class='totalAmount']")
    public WebElement totalAmountText;



    public boolean checkWebTableHeaderNamesAndOrders(List<String> expectedHeadersList){
        /**
         This method gets the list of column names in the header and check if the expected column names
         and order are the same with the actual one.
         Parameters:
         expectedHeadersList: List of Expected column names
         Return: true or false
         */
        List<String> actualHeadersList = BrowserUtils.getElementsText(webTableExampleHeader);
        System.out.println("actualHeadersList = " + actualHeadersList);
        System.out.println("expectedHeadersList = " + expectedHeadersList);
        return actualHeadersList.equals(expectedHeadersList);
    }

    public int sumOfFixedTableAmounts(List<WebElement> amountsElemet){
        List<String> amountsAsText = BrowserUtils.getElementsText(amountsElemet);
        List<Integer> integerList = convertStringListToIntegerList(amountsAsText);
        int intSum = integerList.stream().mapToInt(a -> a).sum();
        return intSum;
    }

    public List<Integer> convertStringListToIntegerList(List<String> stringList) {
        List<Integer> intList = new ArrayList<Integer>();
        for(String s : stringList) intList.add(Integer.valueOf(s));
        return intList;
    }

    public int getTheAmountFromTotalAmountText(){
        String amountText = totalAmountText.getText();
        String[] amountTextList = amountText.split(" ");
        String amountString = amountTextList[amountTextList.length-1];
        int amountInt = Integer.parseInt(amountString);
        return amountInt;
    }








    }


