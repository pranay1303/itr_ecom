import java.lang.invoke.SwitchPoint;
import java.text.BreakIterator;
import java.text.spi.BreakIteratorProvider;
import java.util.*;

class MyException extends Exception {
	MyException(String s) {
		super(s);
	}
}

class Shop {
	void accept() {
		String name;
		int l;
		String mn;
		String place;
		Scanner s = new Scanner(System.in);
		System.out.println("|----------------------------------|");
		System.out.println("|--------|Welcome to Ecomye|-------|");
		System.out.println("|----------------------------------|");
		System.out.println();
		System.out.println("Enter your Name : ");
		name = s.next();
		System.out.println("Enter your Age :");
		l = s.nextInt();
		try {
			if (l < 18) {
				throw new MyException("Age is less for accessing, Can't Procced it!");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.exit(0); // if age will be less than 18 so you cant access the online shopping
		}
		System.out.println("Enter place you live : ");
		place = s.next();
		System.out.println("Enter your Mobile number: ");
		mn = s.next();
		System.out.println("");
		System.out.println("Hello " + name + " We Welcome to Ecomye E-Commerce");

		System.out.println("");
		System.out.println("==Your Details==");
		System.out.println("Name==> " + name);
		System.out.println("Mobile number==> " + mn);
		System.out.println("Address==> " + place);
		System.out.println("Age==> " + l);
		System.out.println("_________________");
		System.out.println(":::::Here are the Products:::::");

	}
}

class Shop2 extends Shop {
	protected int a, b, n, m, p, fp, d, q;
	protected int payoptn;
	void display() {

		Scanner s = new Scanner(System.in);
		System.out.println("");
		System.out.println("|-------------------****--------------------|");
		System.out.println("|--------------|Categories|-----------------|");
		System.out.println("|-------------------****--------------------|");
		System.out.println("");

		System.out.println("1.Bakery Products");
		System.out.println("2.Electronic");
		System.out.println("3.Clothing");
		System.out.println("4.Sports");
		System.out.println("5.Stationary");
		System.out.println("");
		System.out.println("Choose the item you want to buy : ");
		n = s.nextInt();

		switch (n) {
			case 1:
				System.out.println("* Bakery products *");
				System.out.println("1.Soy Milk with Cream");
				System.out.println("2.Strawberry Yoghurt");
				System.out.println("3.Whey");
				System.out.println("4.Butter Bread");
				System.out.println("");
				System.out.println("Choose the item you want :");
				m = s.nextInt();

				switch (m) {
					case 1:
						System.out.println("* You've selected Soy Milk with Cream *");
						System.out.println("Price:60");
						System.out.println("GST:5%");
						p = (60 * 5) / 100;
						System.out.println("The GST is : " + p + " Rupees");
						fp = p + 60;
						System.out.println("The final price with GST is : " + fp + " Rupees");
						break;

					case 2:
						System.out.println("* You've selected Strawberry Yoghurt *");
						System.out.println("Price:150");
						System.out.println("GST:5%");
						p = (150 * 5) / 100;
						System.out.println("The GST is : " + p + " Rupees");
						fp = p + 150;
						System.out.println("The final price with GST is : " + fp + " Rupees");
						break;

					case 3:
						System.out.println("* You've selected Whey *");
						System.out.println("Price:210");
						System.out.println("GST:5%");
						p = (210 * 5) / 100;
						System.out.println("The GST is : " + p + " Rupees");
						fp = p + 210;
						System.out.println("The final price with GST is : " + fp + " Rupees");
						break;

					case 4:
						System.out.println("* You've selected Butter Bread *");
						System.out.println("Price:240");
						System.out.println("GST:5%");
						p = (240 * 5) / 100;
						System.out.println("The GST is : " + p + " Rupees");
						fp = p + 240;
						System.out.println("The final price with GST is : " + fp + " Rupees");
						break;
					default:
						System.out.println("Sorry we dont have this currently but sure to serve you next time :)");

				}
				break;

			case 2:
				System.out.println("* Electronics *");
				System.out.println("1.Mobile");
				System.out.println("2.Headphone");
				System.out.println("3.Fridge");
				System.out.println("4.TV");
				System.out.println("");
				System.out.println("Choose the item you want :");
				d = s.nextInt();
				switch (d) {
					case 1:
						System.out.println("* You've selected Mobile *");
						System.out.println("Price:12000");
						System.out.println("GST:12%");
						p = (12000 * 12) / 100;
						System.out.println("The GST is : " + p + " Rupees");
						fp = p + 12000;
						System.out.println("The final price with GST is : " + fp + " Rupees");
						break;

					case 2:
						System.out.println("* You've selected Heaadphone *");
						System.out.println("Price:2100");
						System.out.println("GST:12%");
						p = (2100 * 12) / 100;
						System.out.println("The GST is : " + p + " Rupees");
						fp = p + 2100;
						System.out.println("The final price with GST is : " + fp + " Rupees");
						break;

					case 3:
						System.out.println("* You've selected Fridge *");
						System.out.println("Price:70000");
						System.out.println("GST:18%");
						p = (70000 * 18) / 100;
						System.out.println("The GST is : " + p + " Rupees");
						fp = p + 70000;
						System.out.println("The final price with GST is : " + fp + " Rupees");
						break;

					case 4:
						System.out.println("* You've selected Television *");
						System.out.println("Price:25000");
						System.out.println("GST:12%");
						p = (25000 * 12) / 100;
						System.out.println("The GST is : " + p + " Rupees");
						fp = p + 25000;
						System.out.println("The final price with GST is : " + fp + " Rupees");
						break;

					default:
						System.out.println("Sorry we dont have this currently but sure to serve you next time :)");
				}
				break;

			case 3:
				System.out.println("* Clothing *");
				System.out.println("1.Mens Combo");
				System.out.println("2.SWomens Combo");
				System.out.println("3.Kids Combo");
				System.out.println("4.Fancy Dress");
				System.out.println("");
				System.out.println("Choose the item you want :");
				d = s.nextInt();
				switch (d) {
					case 1:
						System.out.println("* You've selected Mens Combo *");
						System.out.println("Price:7000");
						System.out.println("GST:18%");
						p = (7000 * 18) / 100;
						System.out.println("The GST is : " + p + " Rupees");
						fp = p + 7000;
						System.out.println("The final price with GST is : " + fp + " Rupees");
						break;

					case 2:
						System.out.println("* You've selected Womens Combo *");
						System.out.println("Price:15000");
						System.out.println("GST:18%");
						p = (15000 * 18) / 100;
						System.out.println("The GST is : " + p + " Rupees");
						fp = p + 15000;
						System.out.println("The final price with GST is : " + fp + " Rupees");
						break;

					case 3:
						System.out.println("* You've selected Kids Combo *");
						System.out.println("Price:3000");
						System.out.println("GST:18%");
						p = (3000 * 18) / 100;
						System.out.println("The GST is : " + p + " Rupees");
						fp = p + 3000;
						System.out.println("The final price with GST is : " + fp + " Rupees");
						break;

					case 4:
						System.out.println("* You've selected Baked Fancy Dress *");
						System.out.println("Price:2800");
						System.out.println("GST:18%");
						p = (2800 * 18) / 100;
						System.out.println("The GST is : " + p + " Rupees");
						fp = p + 2800;
						System.out.println("The final price with GST is : " + fp + " Rupees");
						break;

					default:
						System.out.println("Sorry we dont have this currently but sure to provide you next time :)");
				}
				break;

			case 4:
				System.out.println("* Sports *");
				System.out.println("1.Cricket Kit");
				System.out.println("2.Football Kit");
				System.out.println("3.Tennis Kit");
				System.out.println("4.Video Console PS-5");
				System.out.println("");
				System.out.println("Choose the item you want :");
				m = s.nextInt();
				switch (m) {
					case 1:
						System.out.println("* You've selected Cricket Kit *");
						System.out.println("Price:6000");
						System.out.println("GST:5%");
						p = (6000 * 5) / 100;
						System.out.println("The GST is : " + p + " Rupees");
						fp = p + 6000;
						System.out.println("The final price with GST is : " + fp + " Rupees");
						break;

					case 2:
						System.out.println("* You've selected Football Kit *");
						System.out.println("Price:4000");
						System.out.println("GST:5%");
						p = (4000 * 5) / 100;
						System.out.println("The GST is : " + p + " Rupees");
						fp = p + 4000;
						System.out.println("The final price with GST is : " + fp + " Rupees");
						break;

					case 3:
						System.out.println("* You've selected Tennis Kit *");
						System.out.println("Price:2500");
						System.out.println("GST:5%");
						p = (2500 * 5) / 100;
						System.out.println("The GST is : " + p + " Rupees");
						fp = p + 2500;
						System.out.println("The final price with GST is : " + fp + " Rupees");
						break;

					case 4:
						System.out.println("* You've selected Video Console PS-5 *");
						System.out.println("Price:400000");
						System.out.println("GST:18%");
						p = (400000 * 18) / 100;
						System.out.println("The GST is : " + p + " Rupees");
						fp = p + 400000;
						System.out.println("The final price with GST is : " + fp + " Rupees");
						break;
					default:
						System.out.println("Sorry we dont have this currently but sure to serve you next time :)");
				}
				break;

			case 5:
				System.out.println("* Stationary *");
				System.out.println("1.Books");
				System.out.println("2.Notebooks");
				System.out.println("3.Writing accessiory");
				System.out.println("4.Measurement and Design devices");
				System.out.println("");
				System.out.println("Choose the item you want :");
				m = s.nextInt();
				switch (m) {
					case 1:
						System.out.println("* You've selected Books *");
						System.out.println("Price:150");
						System.out.println("GST:12%");
						p = (150 * 12) / 100;
						System.out.println("The GST is : " + p + " Rupees");
						fp = p + 150;
						System.out.println("The final price with GST is : " + fp + " Rupees");
						break;

					case 2:
						System.out.println("* You've selected Notebooks *");
						System.out.println("Price:170");
						System.out.println("GST:12%");
						p = (170 * 12) / 100;
						System.out.println("The GST is : " + p + " Rupees");
						fp = p + 170;
						System.out.println("The final price with GST is : " + fp + " Rupees");
						break;

					case 3:
						System.out.println("* You've selected Writing accessiory *");
						System.out.println("Price:210");
						System.out.println("GST:12%");
						p = (210 * 12) / 100;
						System.out.println("The GST is : " + p + " Rupees");
						fp = p + 210;
						System.out.println("The final price with GST is : " + fp + " Rupees");
						break;

					case 4:
						System.out.println("* You've selected Measurement and Design devices *");
						System.out.println("Price:140");
						System.out.println("GST:12%");
						p = (140 * 5) / 100;
						System.out.println("The GST is : " + p + " Rupees");
						fp = p + 140;
						System.out.println("The final price with GST is : " + fp + " Rupees");
						break;

					default:
						System.out.println("Sorry we dont have this currently but sure to serve you next time :)");
				}

				break;
		}

		if (n == 1) {
			System.out.println("Choosen: Bakery Products");
		} else if (n == 2) {
			System.out.println("Choosen: Electronics");
		} else if (n == 3) {
			System.out.println("Choosen: Clothing");
		} else if (n == 4) {
			System.out.println("Choosen: Sports");
		} else if (n == 5) {
			System.out.println("Choosen: Stationary");
		}
		System.out.println();
		System.out.println("Select your payment option and confirm the payment:");
		System.out.println("1:Debit/Credit Card");
		System.out.println("2.UPI");
		System.out.println("3.Amaozn Wallet");
		System.out.println("4.Pay On delivery");
		System.out.println("Enter your choice: ");
		payoptn = s.nextInt();
		switch (payoptn) {
			case 1:
				System.out.println("You have selected Debit/Credit card option");
				System.out.println("Plz enter the card details and CVV and confirm the payment ");
				System.out.print("Account Number: ");
				String accno = s.next();
				System.out.print("CVV of your account: ");
				int cvv = s.nextInt();
				System.out.println("Your card details are \naccount no:" + accno + "\ncvv:" + cvv);
				System.out.println("Enter your card password to procced: ");
				int pass = s.nextInt();
				System.out.println("Reenter your password: ");
				int repass = s.nextInt();
				if (pass == repass) {
					System.out.println("Password Match: Payment Successful");
				} else {
					System.out.println("Invalid Password!!, Hope your account is in good hand");
					System.exit(0);
				}
				System.out.println("");
				System.out
						.println("|---------------------------------------------------------------------------------|");
				System.out
						.println("|------------------------Waiting for Payment...Payment Sccessfull-----------------|");
				System.out
						.println("|---------------------------------------------------------------------------------|");
				System.out.println();
				System.out.println();
				break;

			case 2:
				System.out.println("You have selected UPI option");
				System.out.println("Plz enter the UPI address and confirm the payment ");
				System.out.print("UPIID: ");
				String upiid = s.next();
				System.out.println("Your card details are \nUPI Address: " + upiid);
				System.out.println("Enter your card password to procced: ");
				int upipass = s.nextInt();
				System.out.println("Reenter your password: ");
				int upirepass = s.nextInt();
				if (upipass == upirepass) {
					System.out.println("Password Match: Payment Successful");
				} else {
					System.out.println("Invalid Password!!, Hope your account is in good hand");
					System.exit(0);
				}
				System.out.println("");
				System.out
						.println("|---------------------------------------------------------------------------------|");
				System.out
						.println("|------------------------Waiting for Payment...Payment Sccessfull-----------------|");
				System.out
						.println("|---------------------------------------------------------------------------------|");
				System.out.println();
				System.out.println();
				break;

			case 3:
				System.out.println("You have selected Amazon Wallet option");
				System.out.println("Enter your Wallet password: ");
				int wpass = s.nextInt();
				System.out.println("Re-Enter your password: ");
				int rewpass = s.nextInt();
				if (wpass == rewpass) {
					System.out.println("Password Match: Payment Successful");
				} else {
					System.out.println("Invalid Password!!, Hope your account is in good hand");
					System.exit(0);
				}
				System.out.println("");
				System.out
						.println("|---------------------------------------------------------------------------------|");
				System.out
						.println("|------------------------Waiting for Payment...Payment Sccessfull-----------------|");
				System.out
						.println("|---------------------------------------------------------------------------------|");
				System.out.println();
				System.out.println();
				break;

			case 4:
				System.out.println("You have selected Pay on Delivery option");
				if (payoptn == 4) {
					System.out.println("You will have u to pay the money to delivery agent");
				}
				break;
			default:
				break;
		}
		
		System.out.println();
		System.out.println();
		System.out.println("");
		System.out.println("|---------------------------------------------------------------------------------|");
		System.out.println("|----------------------------Order Confirmed, Item Purchased----------------------|");
		System.out.println("|---------------------------------------------------------------------------------|");
		System.out.println();
		System.out.println();
		System.out.println("::::::::::::: Thank You :::::::::::::");
		
		System.out.println();
		System.out.println();

		System.out.println("");
		System.out.println("|---------------------------------------------------------------------------------|");
		System.out.println("| Your order will be Deliverd on Estimated Date , please wait while!. Thank You!! |");
		System.out.println("|---------------------------------------------------------------------------------|");
		System.out.println();
		System.out.println();
		System.out.println("::::::::::::: Thank You :::::::::::::");
		System.out.println();
	}

	void delivery_agent() {
		Scanner s=new Scanner(System.in);
		System.out.println(":::This is done by the Delivery agent:::");
		System.out.println("Order delivered ");
		System.out.println("yes==> (1)");
		int ostatus = s.nextInt();// Confirm by delivery boy
		if (ostatus == 1) {
			System.out.println("Order Details: ");
			System.out.println("Category code: "+n);
			System.out.println("Item code: "+m);
			System.out.println("Totl GST : "+p);
			System.out.println("Total amount: "+fp);
			System.out.println("Payment Option number: "+payoptn);
			System.out.println();
			System.out.println("Delivered");
			// internal Distribution process:
			System.out.println();
			System.out.println("The total Amount AMAZON got : " + fp);
			System.out.println("Commission of amazon: 20% of Total Price");
			System.out.println("Income of Seller: 80% of Total Price");
			System.out.println("::::::::::Distributed Amount::::::::::::");
			System.out.println("Total amount paid by Client: " + fp);
			int Commission = ((fp *20)/100);
			System.out.println("Commission of Amazon: " + Commission);
			System.out.println("Now amazon will transfer the remaining amount to the seller means 80% of total price");
			int samount = ((fp * 80)/100);
			System.out.println("Amount to Seller: "+samount);
		}
		System.out.println();
		System.out.println(":::Again in the Amazon Window:::");
		System.out.println("Any other to purchase??? yes(1) or no(0)??");
		int yn = s.nextInt();
		if (yn == 1) {
			System.out.println("Okay Your always welcome!!");
		} else if (yn == 0) {
			System.exit(0);
		}
	}
}
class Shopping extends Shop2 {
	public static void main(String args[]) {
		int i = 10;
		Shopping s = new Shopping();
		while (i > 1) {
			s.accept();
			s.display();
			s.delivery_agent();
			i++;
			i--;
		}
		// s.accept();
		// s.display();

	}
}