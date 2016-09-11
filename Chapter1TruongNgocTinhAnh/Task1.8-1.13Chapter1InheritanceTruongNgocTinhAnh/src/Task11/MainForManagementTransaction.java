package Task11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.InputMismatchException;

public class MainForManagementTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		try {
			int cont = 1;
			Gold[] listGold = new Gold[0];
			Currency[] listCurrency = new Currency[0];
			double total = 0;
			double totalMoneySell = 0;
			double totalMoneyBuy = 0;
			int sizeGold = 0;
			int sizeMoneyBuy = 0;
			int sizeMoneySell = 0;
			
			//Enter information of transaction
			while (cont == 1) {
				System.out.print("Enter transaction ID: ");
				String id = buff.readLine();
				System.out.print("Enter day of transaction: ");
				String date = buff.readLine();
				System.out.print("Enter quantity: ");
				int quan = Integer.parseInt(buff.readLine());
				
				//Choose type of transaction
				System.out.println("Press 1: Trade Gold");
				System.out.println("Press 2: Trade Money");
				System.out.println("Please choose 1 or 2 ");
				int reply = Integer.parseInt(buff.readLine());
				if (reply != 1 && reply != 2) throw new ArithmeticException("Invalid value ! Please choose again !");
				
				//Choose gold of currency
				switch (reply) {
				case 1:
					//Choose gold
					System.out.println("Press 1: SJC9999");
					System.out.println("Press 2: 24K");
					System.out.println("Please choose 1  or 2");
					int kind = Integer.parseInt(buff.readLine());
					Gold gold = new Gold(id, date, quan);
					switch (kind) {
					case 1:
						//Calculate money of SJC9999
						gold.setKindsOfGold("SJC9999");
						gold.setUnitPrice(1);
						listGold = Arrays.copyOf(listGold, listGold.length + 1);
						listGold[listGold.length - 1] = gold;
						total += gold.calculateMoney(1);
						sizeGold++;
						break;
					case 2:
						//Calculate money of 24K
						gold.setKindsOfGold("24K");
						gold.setUnitPrice(2);
						listGold = Arrays.copyOf(listGold, listGold.length + 1);
						listGold[listGold.length - 1] = gold;
						total += gold.calculateMoney(2);
						sizeGold++;
						break;

					default:
						System.out.println("Please choose 1 or 2");
					}
					break;
				case 2:
					//Choose currency
					System.out.println("Press 1: USD");
					System.out.println("Press 2: EUR");
					System.out.println("Press 3: AUD");
					System.out.println("Please choose 1 or 2 or 3");
					int kinds = Integer.parseInt(buff.readLine());
					int choiceSellBuy;
					Currency cur = new Currency(id, date, quan);
					switch (kinds) {
					case 1:
						//Calculate money buy of money sell of USD
						cur.setKindsOfCurrency("USD");
						cur.setPriceBuy(1);
						cur.setPriceSell(1);
						listCurrency = Arrays.copyOf(listCurrency,listCurrency.length + 1);
						listCurrency[listGold.length - 1] = cur;
						System.out.println("Press 1: Buy");
						System.out.println("Press 2: Sell");
						System.out.println("Please choose 1 or 2");
						choiceSellBuy = Integer.parseInt(buff.readLine());
						switch (choiceSellBuy) {
						case 1:
							totalMoneyBuy += cur.calculateMoneyBuy(1);
							sizeMoneyBuy++;
							break;
						case 2:
							totalMoneySell += cur.calculateMoneySell(1);
							sizeMoneySell++;
							break;
						default:
							System.out.println("Please choose 1 or 2");
						}
						
						break;
					case 2:
						//Calculate money buy of money sell of EUR
						cur.setKindsOfCurrency("EUR");
						cur.setPriceBuy(2);
						cur.setPriceSell(2);
						listCurrency = Arrays.copyOf(listCurrency, listCurrency.length + 1);
						listCurrency[listGold.length - 1] = cur;
						System.out.println("Press 1: Buy");
						System.out.println("Press 2: Sell");
						System.out.println("Please choose 1 or 2");
						choiceSellBuy = Integer.parseInt(buff.readLine());
						switch (choiceSellBuy) {
						case 1:
							totalMoneyBuy += cur.calculateMoneyBuy(2);
							sizeMoneyBuy++;
							break;
						case 2:
							totalMoneySell += cur.calculateMoneySell(2);
							sizeMoneySell++;
							break;
						default:
							System.out.println("Please choose 1 or 2");
						}
						break;
					case 3:
						//Calculate money buy of money sell of AUD
						cur.setKindsOfCurrency("AUD");
						cur.setPriceBuy(3);
						cur.setPriceSell(3);
						listCurrency = Arrays.copyOf(listCurrency, listCurrency.length + 1);
						listCurrency[listGold.length - 1] = cur;
						System.out.println("Press 1: Buy");
						System.out.println("Press 2: Sell");
						System.out.println("Please choose 1 or 2)");
						choiceSellBuy = Integer.parseInt(buff.readLine());
						switch (choiceSellBuy) {
						case 1:
							totalMoneyBuy += cur.calculateMoneyBuy(3);
							sizeMoneyBuy++;
							break;
						case 2:
							totalMoneySell += cur.calculateMoneySell(3);
							sizeMoneySell++;
							break;
						default:
							System.out.println("Please choose 1 or 2");
						}
						break;
					default:
						System.out.println("Please choose 1 or 2 or 3");
					}
				break;
				default:
					System.out.println("Please choose 1 or 2");
				}
				
				//Choose 1 or 2 to continue
				System.out.println("Press 1: if you want continue");
				System.out.println("Press 2: if you want quit");
				System.out.println("Please choose 1 or 2");
				int choiceCont = Integer.parseInt(buff.readLine());
				if (choiceCont != 1)
					cont = 0;
			}
			
			//Display money and average money for gold
			if (listGold.length > 0) {
				for (Gold gold : listGold)
					gold.DisplayInfoTransaction();;
				System.out.println("Total money for gold: " + total);
				System.out.println("Average money for gold: "
						+ (total / sizeGold));
			}
			
			//Display money and average money for currency
			if (listCurrency.length > 0) {
				for (Currency cur : listCurrency)
					cur.DisplayInfoTransaction();
				System.out.println(String.format("Total money for sell: %.0f", totalMoneySell));
				System.out.println(String.format("Total money for buy: %.0f", totalMoneyBuy));
				System.out.println(String.format("Average money for sell: %.0f", (totalMoneySell / sizeMoneySell)));
				System.out.println(String.format("Average money for buy: %.0f", (totalMoneyBuy / sizeMoneyBuy)));
			}
		} catch (IOException | NumberFormatException | InputMismatchException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
