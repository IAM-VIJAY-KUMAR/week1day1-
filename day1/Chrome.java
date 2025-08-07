package week1.day2;

public class Chrome {
	public void getName() {
        System.out.println("This is google chrome");
    }

    // Method 2
    public void PrintName() {
        System.out.println("This is google chrome");
    }

public static void main(String[] args) {
    Chrome chrome = new Chrome(); // Creating object of Chrome class

    chrome.getName();   // Calling getName() method
    chrome.PrintName(); // Calling PrintName() method
}
}
