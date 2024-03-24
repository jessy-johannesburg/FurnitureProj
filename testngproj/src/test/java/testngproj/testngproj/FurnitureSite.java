package testngproj.testngproj;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Ignore;
	import org.testng.annotations.Test;

	public class FurnitureSite {

		WebDriver driver;

		@BeforeTest
		public void preTest() {
			driver = new ChromeDriver();
			// Maximize the browser
			driver.manage().window().maximize();
			
		}

	@Test
		public void Test1() throws InterruptedException {
			// Launch Website
			driver.get(" https://www.fantasticfurniture.com.au/");
			// Maximize window size of browser
			driver.manage().window().maximize();
			WebElement ExpectedTitle = driver.findElement(By.xpath("//ff-navigation-ui[@class='ng-tns-c230-2 ng-star-inserted']//a[text()=' Storage & Office ']"));
		    ExpectedTitle.click();
	        Thread.sleep(5000);
		    WebElement ExpectedTitle1 = driver.findElement(By.xpath("(//div[@class='submenu-list ng-tns-c230-2 ng-star-inserted']//a[text()='Office Chairs'])[3]"));
		    ExpectedTitle1.click();
		}
		
		@Test
		public void Test2() throws InterruptedException {
			Thread.sleep(4000);
			WebElement img = driver.findElement(By.xpath("(//img[@class='category-icon ng-star-inserted'])[3]"));
			img.click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[@class='cartBtn ng-star-inserted'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()=' View Cart & Check Out ']")).click();
		}
		
		@Test
		public void Test3() throws InterruptedException {
			Thread.sleep(5000);
		String txt = driver.findElement(By.xpath("//h2[text()='Your Cart']")).getText();
		System.out.println(txt);
	}
		
		@Ignore
			public void Test4() throws InterruptedException {
				// Launch Website and choose sofas & Armchairs
				driver.get(" https://www.fantasticfurniture.com.au/");
				// Maximize window size of browser
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//a[contains(text(),' Sofas & Armchairs ')]")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//div[@class='d-flex flex-md-wrap shopby-tiles-box']//img[@class='ng-star-inserted'])[4]")).click();
				Thread.sleep(7000);
				driver.findElement(By.xpath("(//div[@class='product-image-container position-relative'])[1]")).click();
				Thread.sleep(6000);
				String text = driver.findElement(By.xpath("(//div[@class='product-title'])[2]")).getText();
				System.out.println(text);
	}
			
	}


