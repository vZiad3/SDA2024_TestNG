package sda.homeWorks.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import sda.tests.utilities.ParameterBrowserTestBase;
import sda.tests.utilities.TestBase;

import java.util.List;

public class hwCrossBrowser extends ParameterBrowserTestBase {


    @Test
    public void crossBro(){
        //Go to URL: https://vziad3.github.io/todo-app/todo-app.html
        driver.get("https://vziad3.github.io/todo-app/todo-app.html");


        //Checking Box todo-4 and Checking Box todo-5
        driver.findElement(By.xpath("//input[@type='checkbox'][@name='todo-4']")).click();
        driver.findElement(By.xpath("//input[@type='checkbox'][@name='todo-5']")).click();

        //If both clicks worked, then the following List should be have length 2.
        WebElement done = driver.findElement(By.xpath("//*[@class='done-true']"));


        //Assert that this is correct
        Assert.assertTrue(done.isDisplayed());

        //Assert that the todo we added is present in the list
        WebElement addToDo = driver.findElement(By.id("todotext"));
        addToDo.sendKeys("Hi its Ziad", Keys.ENTER);

        //Archiving old todos
        driver.findElement(By.xpath("//*[@ng-click='todoList.archive()']")).click();
        //If our archive link worked, then the following list should have length 4.
       List<WebElement>  notComplete = driver.findElements(By.xpath("//*[@class='done-false']"));
        int totalNotComplete = notComplete.size();
        System.out.println("totalNotComplete = " + totalNotComplete);
        //Assert that this is true as well
        Assert.assertEquals(4,totalNotComplete);
        //Doing Cross Browser Testing.

        // Done


    }

}
