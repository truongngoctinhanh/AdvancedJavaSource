package ManagementOrder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainForManagementOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			ATMCard atm = new ATMCard("atm1285", 1000000000);
			CreditCard credit = new CreditCard("cre1285", "31/12/2020", 1000000000, "money");
			List<OrderDetail> list = new ArrayList<>();
			String cont = "y";
			while (cont.equals("y")) {
				//Choose product
				System.out.println("Look at list of product below:");
				Product[] pro = new Product[10];
				pro[0] = new Product("1. Egg         ", 3000);
				pro[1] = new Product("2. Apple       ", 2000);
				pro[2] = new Product("3. Fish        ", 11000);
				pro[3] = new Product("4. grape       ", 5000);
				pro[4] = new Product("5. Milk        ", 5500);
				pro[5] = new Product("6. Water       ", 3400);
				pro[6] = new Product("7. Candy       ", 2500);
				pro[7] = new Product("8. Lemo        ", 1000);
				pro[8] = new Product("9. Cooking oil ", 1000);
				pro[9] = new Product("10. Banana     ", 3500);
				for (int i = 0; i < pro.length; i++) {
					pro[i].displayInfoOrder();
				}

				String check = "y";
				while (check.equals("y")) {
					System.out.println("Please choose product 1 / 2 / 3 / 4 / 5 / 6 / 7 / 8 / 9 / 10 ");					
					int product = Integer.parseInt(input.readLine());
					if (product < 1 || product > 10) {
						throw new ArithmeticException("Invalid values! Please choose again!");
					}
					switch (product) {
					//Add product
					case 1:
						System.out.println("Enter quantity: ");
						int quan = Integer.parseInt(input.readLine());
						System.out.println("Product was added in order!");
						list.add(new OrderDetail(quan, pro[0]));
						break;
					case 2:
						System.out.println("Enter quantity: ");
						quan = Integer.parseInt(input.readLine());
						System.out.println("Product was added in order!");
						list.add(new OrderDetail(quan, pro[1]));
						break;
					case 3:
						System.out.println("Enter quantity: ");
						quan = Integer.parseInt(input.readLine());
						System.out.println("Product was added in order!");
						list.add(new OrderDetail(quan, pro[2]));
						break;
					case 4:
						System.out.println("Enter quantity: ");
						quan = Integer.parseInt(input.readLine());
						System.out.println("Product was added in order!");
						list.add(new OrderDetail(quan, pro[3]));
						break;
					case 5:
						System.out.println("Enter quantity: ");
						quan = Integer.parseInt(input.readLine());
						System.out.println("Product was added in order!");
						list.add(new OrderDetail(quan, pro[4]));
						break;
					case 6:
						System.out.println("Enter quantity: ");
						quan = Integer.parseInt(input.readLine());
						System.out.println("Product was added in order!");
						list.add(new OrderDetail(quan, pro[5]));
						break;
					case 7:
						System.out.println("Enter quantity: ");
						quan = Integer.parseInt(input.readLine());
						System.out.println("Product was added in order!");
						list.add(new OrderDetail(quan, pro[6]));
						break;
					case 8:
						System.out.println("Enter quantity: ");
						quan = Integer.parseInt(input.readLine());
						System.out.println("Product was added in order!");
						list.add(new OrderDetail(quan, pro[7]));
						break;
					case 9:
						System.out.println("Enter quantity: ");
						quan = Integer.parseInt(input.readLine());
						System.out.println("Product was added in order!");
						list.add(new OrderDetail(quan, pro[8]));
						break;
					case 10:
						System.out.println("Enter quantity: ");
						quan = Integer.parseInt(input.readLine());
						System.out.println("Product was added in order!");
						list.add(new OrderDetail(quan, pro[9]));
						break;
					}
					System.out.println("------------------------------------------");
					System.out.println("Do you want to continue add the other product? ");
					System.out.println("Please choose y / n ? ");
					check = input.readLine().toLowerCase();
					if (!check.equals("y") && !check.equals("n"))
						throw new ArithmeticException("Choice value is not valid!");
				}

					// Enter information of the Order
					System.out.println("-------------------------------------");
					System.out.print("Enter date order: ");
					String date = input.readLine();
					System.out.println("Do you want to pay: ");
					System.out.println("Press 1: No");
					System.out.println("Press 2: Yes");
					System.out.println("Please choose 1 / 2 ");
					int reStatus = Integer.parseInt(input.readLine());
					if (reStatus != 1 && reStatus != 2) {
						throw new ArithmeticException("Invalid values! Please choose again!");
					}

					if (reStatus == 2) {
						// Enter information of payment card						
							System.out.println("Enter information of payment Card : ");
							System.out.print("Enter ID card: ");
							String idcard = input.readLine();
							System.out.print("Enter date created card: ");
							String dateCreated = input.readLine();
							System.out.print("Enter name of payer: ");
							String name = input.readLine();
							System.out.print("Enter identity card of payer: ");
							String icard = input.readLine();
							System.out.print("Enter email: ");
							String email = input.readLine();
							System.out.print("Enter address: ");
							String add = input.readLine();
							System.out.print("Enter phone number: ");
							String phone = input.readLine();

							System.out.println("Do you want to print order ? ");
							System.out.println("Press 1: Yes");
							System.out.println("Press 2: No");
							System.out.println("Please choose 1 / 2 ");
							int rePrint = Integer.parseInt(input.readLine());
							if (rePrint != 1 && rePrint != 2) {
								throw new ArithmeticException("Invalid values! Please choose again!");
							}
							System.out.println("Do you have Customer Card: ");
							System.out.println("Please choose y / n ");
							String re = input.readLine();
							if (re.equals("y")) {
								// Enter information of customer card
								System.out.println("Enter information of Customer Card : ");
								System.out.print("Enter ID customer card: ");
								String idcard2 = input.readLine();
								System.out.print("Enter name of customer: ");
								String name2 = input.readLine();
								System.out.print("Enter identity card of customer: ");
								String icard2 = input.readLine();
								System.out.print("Enter email: ");
								String email2 = input.readLine();
								System.out.print("Enter address: ");
								String add2 = input.readLine();
								System.out.print("Enter phone number: ");
								String phone2 = input.readLine();
								CustomerCard cus = new CustomerCard(idcard2, null, add2, email2, icard2, name2, phone2);
								cus.displayInfoCard();
							}
							//Display information of order	
							PaymentCard pay = new PaymentCard(idcard, dateCreated, add, email, icard, name, phone);
							Order order1 = new Order(date, rePrint, reStatus, list, pay );
							order1.displayInfoOrder();
							for (OrderDetail detail : list) {
								detail.displayInfoOrder();
							}
							double ac = order1.calTotalAmount();
							System.out.println("You pay: " + ac);
							pay.displayInfoCard();
							
							//Choose type of card to pay
							System.out.println("Choose payment:");
							System.out.println("1. ATM");
							System.out.println("2. Credit card");
							int choicePayment = Integer.parseInt(input.readLine());
							if(choicePayment == 1){
								if(atm.getRemainingMoney() >= ac){
									atm.calcBalance(ac);
									atm.getAuthMethod();
									System.out.println("Payment successed!");
									System.out.println("Balance of ATM: " + atm.getRemainingMoney());
								}else{
									System.out.println("Balance in ATM is not enough!");
								}
								
							}else if(choicePayment == 2){
								if(credit.getMaxDebt() >= ac){
									credit.getAuthMethod();
									System.out.println("Payment successed!");
								}else{
									System.out.println("Balance in ATM is not enough!");
								}
							}else{
								System.out.println("Choice payment valid is not valid!");
							}
					}
				System.out.println("------------------------------------------");
				System.out.println("Do you want to continue create the other order? ");
				System.out.println("Please choose y / n ? ");
				cont = input.readLine().toLowerCase();
				if (!cont.equals("y") && !cont.equals("n"))
					throw new ArithmeticException("Choice value is not valid!");
			}
		} catch (IOException | NumberFormatException | ArithmeticException ex) {
			System.out.println("Error: " + ex.getMessage());
		}

	}

}
