package com.coding;

public class TestCreditCard {

  public static void main(String[] args) {
    testBuildCardWithMinimumDetails();
    testBuildCardWithAllDetails();
	}

  public static void testBuildCardWithMinimumDetails() {
    String number = "1234567890123456";
    String yymm  = "2304";
    CreditCard minCard = new CreditCard.CreditCardBuilder(number, yymm).build();
    assert(minCard.getNumber().equals(number));
    assert(minCard.getExpiryYYMM().equals(yymm));
    assert(minCard.getName() == null);
  }

  public static void testBuildCardWithAllDetails() {
    String number = "1234567890123456";
    String yymm  = "2304";
    String name = "Test Name";
    CreditCard maxCard = new CreditCard.CreditCardBuilder(number, yymm).name(name).build();
    assert(maxCard.getNumber().equals(number));
    assert(maxCard.getExpiryYYMM().equals(yymm));
    assert(maxCard.getName().equals(name));
  }
}
