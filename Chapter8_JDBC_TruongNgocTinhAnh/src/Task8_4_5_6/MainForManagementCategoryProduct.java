package Task8_4_5_6;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 16 - 09 - 2016
 * @Version: 01
 * @class for management product and category
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainForManagementCategoryProduct {
	/**
	 * @Function for check continue activity
	 * @Input: none
	 * @Output: none
	 */
	public static String check() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Please choose y / n? ");
		String check = input.readLine().toLowerCase();
		if (!check.equals("y") && !check.equals("n"))
			throw new ArithmeticException("Choice value is not valid!");
		return check;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		CategoryController categoryController = new CategoryController();
		ProductController productController = new ProductController();
		String check = "y";
		//Display menu
		while (check.equals("y")) {
			System.out.println("What do you want: ");
			System.out.println("1. View list of all categories " + "\n2. Add product into category "
					+ "\n3. Search product by name product" + "\n4. Update price and amount of product"
							+ "\n5. Delete product");
			System.out.println("Please choose 1 / 2 / 3 / 4 / 5 ");
			int active = Integer.parseInt(input.readLine());
			switch (active) {
			case 1:
				// View all accounts in mySql database
				List<Category> list = new ArrayList<>();
				list = categoryController.ShowCategory();
				for (int i = 0; i < list.size(); i++) {
					System.out.print("Category " + (i + 1) + ": ");
					list.get(i).displayCategory();
				}
				System.out.println("------------------------------------------");
				System.out.println("Do you want to continue ? ");
				check = check();
				break;
			case 2:
				//Loop add new product in other category
				String rep = "y";
				while (rep.equals("y")) {
					System.out.println("Please choose a Category to add product: ");
					System.out.println("Press 1: Water ");
					System.out.println("Press 2: Fruits ");
					System.out.println("Press 3: Cake ");
					System.out.println("Press 4: Shampoo ");
					int cateId = Integer.parseInt(input.readLine());

					// Loop add new product in choosen category
					String reply = "y";
					while (reply.equals("y")) {
						// Created information of new product
						System.out.print("Enter name of product: ");
						String name = input.readLine();
						System.out.print("Enter price: ");
						double price = Double.parseDouble(input.readLine());
						System.out.print("Enter amount: ");
						int amount = Integer.parseInt(input.readLine());
						Product product = new Product(name, price, amount, cateId);
						productController.insertProduct(product);
						System.out.println("New product is added successful!");

						System.out.println("------------------------------------------");
						System.out.println("Do you want to continue add new product in this category? ");
						reply = check();
					}
					System.out.println("------------------------------------------");
					System.out.println("Do you want to continue add new product in other category? ");
					rep = check();
				}
				System.out.println("------------------------------------------");
				System.out.println("Do you want to continue ? ");
				check = check();
				break;
			case 3:
				//Search product by name
				System.out.println("Enter name of product to search: ");
				String key = input.readLine();
				List<Product> listPro = new ArrayList<>();
				listPro = productController.searchProduct(key);
				if (listPro.size() != 0) {
					for (int i = 0; i < listPro.size(); i++)
						listPro.get(i).displayInfoProduct();
				} else
					System.out.println("The value not exist in database");

				System.out.println("------------------------------------------");
				System.out.println("Do you want to continue ? ");
				check = check();
				break;
			case 4:
				//Update price and amount of product by ID product
				System.out.println("Enter ID of product to update: ");
				int id = Integer.parseInt(input.readLine());
				System.out.println("Enter update price: ");
				double price = Double.parseDouble(input.readLine());
				System.out.println("Enter update amount: ");
				int amount = Integer.parseInt(input.readLine());
				productController.updateProduct(new Product(id, price, amount));
				System.out.println("The product is updated successful!");
				System.out.println("------------------------------------------");
				System.out.println("Do you want to continue ? ");
				check = check();
				break;
			case 5:
				//Delete product by ID product
				System.out.println("Enter ID of product to delete: ");
				int deleteId = Integer.parseInt(input.readLine());
				productController.deleteProduct(deleteId);
				System.out.println("The product is deleted successful!");
				System.out.println("------------------------------------------");
				System.out.println("Do you want to continue ? ");
				check = check();
				break;
			default:
				throw new ArithmeticException("Choice is not valid!");
			}
		}
	}
}
