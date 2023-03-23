package com.coding;

public class CreditCard {

  private final String number; // required
	private final String expiryYYMM; // required
	private final String name; // optional

  private CreditCard(CreditCardBuilder builder) {
		this.number = builder.number;
		this.expiryYYMM = builder.expiryYYMM;
		this.name = builder.name;
	}

  public String getNumber() {
		return number;
	}

  public String getExpiryYYMM() {
		return expiryYYMM;
	}

  public String getName() {
		return name;
	}

  @Override
	public String toString() {
		return "CreditCard: " + this.number + ", " + this.expiryYYMM + ", " + this.name;
	}

	public static class CreditCardBuilder {

		private String number;
		private String expiryYYMM;
		private String name;

    public CreditCardBuilder(String number, String expiryYYMM) {
			this.number = number;
			this.expiryYYMM = expiryYYMM;
		}

    public CreditCardBuilder name(String name) {
			this.number = name;
			return this;
		}

		public CreditCard build() {
			CreditCard creditCard =  new CreditCard(this);
			validateCreditCard(creditCard);
			return creditCard;
		}

    private void validateCreditCard(CreditCard creditCard) {
			// Basic validations go here...
		}
	}
}
