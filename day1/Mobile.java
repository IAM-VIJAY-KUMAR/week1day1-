package week1.day2;

public class Mobile {
	public void makeCall() {
        String mobileModel = "Samsung Galaxy S24";
        float mobileWeight = 170.5f;

        System.out.println("Making a call...");
        System.out.println("Mobile Model: " + mobileModel);
        System.out.println("Mobile Weight: " + mobileWeight + " grams");
    }
	
public void sendMsg() {
    boolean isFullCharged = true;
    int mobileCost = 59999;

    System.out.println("Sending a message...");
    System.out.println("Is Fully Charged: " + isFullCharged);
    System.out.println("Mobile Cost: ₹" + mobileCost);
}

// Main method
public static void main(String[] args) {
    Mobile myMobile = new Mobile();  // Creating object

    myMobile.makeCall();  // Calling makeCall method
    myMobile.sendMsg();   // Calling sendMsg method

    System.out.println("This is my mobile");
}
}