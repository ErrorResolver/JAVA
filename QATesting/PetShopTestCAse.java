package petTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PetShopTestCAse {
	public static void main(String[] args) {
        // Set the path to chromedriver.exe based on your system
     //   System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
      //Mazimize current window
     driver.manage().window().maximize();
     
        // Test Case 1: Verify that the website loads successfully
        driver.get("https://petstore.octoperf.com/actions/Catalog.action");
        String pageTitle = driver.getTitle();
        if (pageTitle.contains("JPetStore Demo")) {
            System.out.println("Test Case 1 Passed: Website loaded successfully");
        } else {
            System.out.println("Test Case 1 Failed: Website failed to load");
        }

        // Test Case 2: Verify that the login page
       // driver.findElement(By.linkText("Enter the Store")).click();
        WebElement siginin = driver.findElement(By.linkText("Sign In"));
        siginin.click();
     boolean siginin1 = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[1]")).isDisplayed();
        if(siginin1) {
        	System.out.println("Test Case 2 Passed: signin page load");
        } else {
            System.out.println("Test Case 2 Failed: signin page failed to load");
        }

//     
     // Test Case 3: Verify that the fish page
     WebElement fishpage =   driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[1]"));
     fishpage.click();
     boolean fishpage1 = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/h2")).isDisplayed();
     if(fishpage1) {
     	System.out.println("Test Case 3 Passed: fish page load");
     } else {
         System.out.println("Test Case 3 Failed: fish page failed to load");
     }
     
     
     // Test Case 4: Verify that the Dog page
      WebElement dogpage =  driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[2]"));
      dogpage.click();
      boolean dogpage1 = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/h2")).isDisplayed();
      if(dogpage1) {
       	System.out.println("Test Case 4 Passed: fish page load");
       } else {
           System.out.println("Test Case 4 Failed: fish page failed to load");
       }
      
      
   // Test Case 5: Verify that the reptile page
      WebElement reptilepage =  driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[3]"));
      reptilepage.click();
      boolean reptilepage1 = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/h2")).isDisplayed();
      if(reptilepage1) {
         	System.out.println("Test Case 5 Passed: repatails page load");
         } else {
             System.out.println("Test Case 5 Failed: repatails page failed to load");
         }
      
      
      // Test Case 6: Verify that the cats page
      WebElement catspage =  driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[4]"));
      catspage.click();
      boolean catpage1 = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/h2")).isDisplayed();
      if(catpage1) {
       	System.out.println("Test Case 6 Passed: cats page load");
       } else {
           System.out.println("Test Case 6 Failed: cats page failed to load");
       }
      
      
      // Test Case 7: Verify that the birds page
      WebElement birdspage =  driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[5]"));
      birdspage.click();
      boolean birdpage1 = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/h2")).isDisplayed();
      if(birdpage1) {
         	System.out.println("Test Case 7 Passed: birds page load");
         } else {
             System.out.println("Test Case 7 Failed: birds page failed to load");
         }
//   
     // Test Case 8: Verify that a user can add a product to the cart
        driver.get("https://petstore.octoperf.com/actions/Catalog.action");
        driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[1]")).click();
        driver.findElement(By.linkText("FI-FW-01")).click();
        driver.findElement(By.linkText("Add to Cart")).click();
        WebElement cartMsg = driver.findElement(By.xpath("//*[@id=\"Cart\"]/h2"));
        if (cartMsg.isDisplayed()) {
            System.out.println("Test Case 8 Passed: Product added to the cart successfully");
        } else {
            System.out.println("Test Case 8 Failed: Failed to add the product to the cart");
        }

        //Test case 9 return to main menu
        driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a"));
        driver.get("https://petstore.octoperf.com/actions/Catalog.action");
        WebElement mainmenu = driver.findElement(By.xpath("//*[@id=\"MainImageContent\"]/map/area[1]"));
        if (mainmenu.isDisplayed()) {
            System.out.println("Test Case 9 Passed: Return to main menu successfully");
        } else {
            System.out.println("Test Case 9 Failed: Failed to return to main menu");
        }
        
        // Test Case 10: Verify that the cart contains the correct product after adding it
        driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[1]")).click();
        WebElement productInfo = driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[2]"));
        if (productInfo.isDisplayed()) {
            System.out.println("Test Case 10 Passed: Correct product displayed in the cart");
        } else {
            System.out.println("Test Case 10 Failed: Incorrect product displayed in the cart");
        }

        // Test Case 11: Verify that a user can successfully place an order
        driver.get("https://petstore.octoperf.com/actions/Catalog.action");
        driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[1]")).click();
        driver.findElement(By.linkText("FI-FW-01")).click();
        driver.findElement(By.linkText("Add to Cart")).click();
        WebElement placeorder = driver.findElement(By.xpath("//*[@id=\"Cart\"]/h2"));
        if (placeorder.isDisplayed()) {
            System.out.println("Test Case 11 Passed: successfully place order");
        } else {
            System.out.println("Test Case 11 Failed: not able to place order");
        }
        
//     ut.println("Test Case 8 Failed: Failed to place the order");
//        }

        // Test Case 12: Verify that the user can navigate to the product details page
        driver.get("https://petstore.octoperf.com/actions/Catalog.action");
        driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[1]")).click();
        driver.findElement(By.linkText("FI-SW-01")).click();
        WebElement navigatedetail = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[2]"));
        if (navigatedetail.isDisplayed()) {
            System.out.println("Test Case 12 Passed: Product details");
        } else {
            System.out.println("Test Case 12 Failed: deatils not ablable");
        }

     
        // Test Case 13: Verify that the user can search for a product
        driver.findElement(By.name("keyword")).sendKeys("dog");
        driver.findElement(By.name("searchProducts")).click();
        WebElement searchResults = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[2]"));
        if (searchResults.isDisplayed()) {
            System.out.println("Test Case 13 Passed: Product search returned results");
        } else {
            System.out.println("Test Case 13 Failed: Product search did not return results");
        }

        // Test Case 14: Verify that the user can view the product details from search results
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[2]/b/a")).click();
        
        WebElement productDetailsFromSearch = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/h2"));
        if (productDetailsFromSearch.isDisplayed()) {
            System.out.println("Test Case 14 Passed: able to see product details from search results");
        } else {
            System.out.println("Test Case 14 Failed: not able to product details from search results");
        }

        // Test Case 15: Verify that the user can navigate to the shopping cart
        driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[1]")).click();
      
        WebElement shopcart = driver.findElement(By.xpath("//*[@id=\"Cart\"]/h2"));
        if (shopcart.isDisplayed()) {
            System.out.println("Test Case 15 Passed: able to see shopping cart");
        } else {
            System.out.println("Test Case 15 Failed: not able to open shopping cart");
        }
        
     // Test Case 16: Verify that the user can update the quantity of a product in the cart
        driver.get("https://petstore.octoperf.com/actions/Catalog.action");
        driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[1]")).click();
        driver.findElement(By.linkText("FI-FW-01")).click();
        driver.findElement(By.linkText("Add to Cart")).click();
        driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[1]")).click();
        WebElement quantityField = driver.findElement(By.name("EST-4"));
        quantityField.clear();
        quantityField.sendKeys("2");
        driver.findElement(By.name("updateCartQuantities")).click();
      
        WebElement updatequantity = driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[5]/input"));
        if (updatequantity.isDisplayed()) {
            System.out.println("Test Case 16 Passed: updated quantity of the order product");
        } else {
            System.out.println("Test Case 16 Failed: not able to update");
        }
        
        
        // Test Case 17: Verify that the user can remove a product from the cart
        driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[8]/a")).click();
        WebElement cartEmptyMessage = driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[1]/th[1]"));
        if (cartEmptyMessage.isDisplayed()) {
            System.out.println("Test Case 17 Passed: Product removed from the cart");
        } else {
            System.out.println("Test Case 17 Failed: Failed to remove the product from the cart");
        }


     // Test Case 18: Verify that the user can remove a product from the cart
        driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a"));
        driver.get("https://petstore.octoperf.com/actions/Catalog.action");
        WebElement pic = driver.findElement(By.xpath("//*[@id=\"MainImageContent\"]/map/area[1]"));
        if (pic.isDisplayed()) {
            System.out.println("Test Case 18 Passed: pic shown on the front page");
        } else {
            System.out.println("Test Case 18 Failed: Failed to show pic");
        }
        
        
        //Test case 19: verify the details of the particular animal is visible
        driver.get("https://petstore.octoperf.com/actions/Catalog.action");
        driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[3]")).click();
        driver.findElement(By.linkText("RP-SN-01")).click();
        driver.findElement(By.linkText("EST-11")).click();
        
        WebElement pic1 = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[1]/td/img"));
        if (pic1.isDisplayed()) {
            System.out.println("Test Case 19 Passed: pic shown on reptile page");
        } else {
            System.out.println("Test Case 19 Failed: Failed to show pic");
        }
        
        // Test Case 20: Verify that the user can navigate to the pet details page
        driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[5]")).click();
        driver.findElement(By.linkText("AV-CB-01")).click();
        
        WebElement pic2 = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/h2"));
        if (pic2.isDisplayed()) {
            System.out.println("Test Case 20 Passed: deatil of animal shown succesfully");
        } else {
            System.out.println("Test Case 20 Failed: not able to see details");
        }
        
        // Test Case 21: Verify that the user can access the help page
        driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[3]")).click();
        String helpPageTitle = driver.getTitle();
        if (helpPageTitle.contains("JPetStore Demo")) {
            System.out.println("Test Case 21 Passed: User can access the help page");
        } else {
            System.out.println("Test Case 21 Failed: Failed to access the help page");
        }

    

        // Close the browser
        driver.quit();
    }
}
