package ManagementScore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainForManageScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			ArrayList<Subject> subject1 = new ArrayList<>();
			ArrayList<Subject> subject2 = new ArrayList<>();
			// default list subject
			Subject javaBasic = new Subject("11/08/2016", "Ms. Phuong", "Java Basic", 12, "11/07/2016");
			subject1.add(javaBasic);
			Subject javaAdvance = new Subject("11/09/2016", "Ms. Phuong", "Java Advance", 12, "12/08/2016");
			subject2.add(javaAdvance);

			ArrayList<Student> student1 = new ArrayList<>();
			ArrayList<DailyScore> arrScore = new ArrayList<>();
			Class class1 = new Class("11/09/2016", "c11", "Java072016", "11/07/2016", 24, subject1, student1);

			// List student
			Student tinhAnh = new Student("Truong Ngoc Tinh Anh", "10/12/1993", "anhtruong1012@gmail.com",
					"01688669952");
			student1.add(tinhAnh);
			Student thanhThao = new Student("Truong Thi Thanh Thao", "05/09/1993", "thaotruong0509@gmail.com",
					"0164244442");
			student1.add(thanhThao);

			// Create daily core of subject java basic for student tinh anh and
			// add into list
			DailyScore tinhAnh_1 = new DailyScore(10, 10, 10);
			DailyScore tinhAnh_2 = new DailyScore(10, 10, 10);
			DailyScore tinhAnh_3 = new DailyScore(10, 10, 10);
			List<DailyScore> listTinhAnh = new ArrayList<>();
			listTinhAnh.add(tinhAnh_1);
			listTinhAnh.add(tinhAnh_2);
			listTinhAnh.add(tinhAnh_3);

			// Create final code of java basic of Tinh Anh
			FinalScore finalTinhAnh_basic = new FinalScore(listTinhAnh, 8, 8, javaBasic, tinhAnh);

			// Create daily core of subject java basic for student thanh thao
			// and add into list
			DailyScore thanhThao_1 = new DailyScore(10, 10, 10);
			DailyScore thanhThao_2 = new DailyScore(10, 10, 10);
			DailyScore thanhThao_3 = new DailyScore(10, 10, 10);
			List<DailyScore> listThanhThao = new ArrayList<>();
			listThanhThao.add(thanhThao_1);
			listThanhThao.add(thanhThao_2);
			listThanhThao.add(thanhThao_3);

			// Create final code of java basic of thanh thao
			FinalScore finalThanhThao_basic = new FinalScore(listThanhThao, 8, 8, javaBasic, thanhThao);

			// Create daily core of subject java advance for student tinh anh
			// and add into list
			DailyScore tinhAnh_4 = new DailyScore(10, 10, 10);
			DailyScore tinhAnh_5 = new DailyScore(10, 10, 10);
			DailyScore tinhAnh_6 = new DailyScore(10, 10, 10);
			List<DailyScore> listTinhAnh_1 = new ArrayList<>();
			listTinhAnh_1.add(tinhAnh_4);
			listTinhAnh_1.add(tinhAnh_5);
			listTinhAnh_1.add(tinhAnh_6);

			// Create final code of java advance of tinh anh
			FinalScore finalTinhAnh_advance = new FinalScore(listTinhAnh_1, 7, 7, javaAdvance, tinhAnh);

			// Create daily core of subject java basic for student thanh thao
			// and add into list
			DailyScore thanhThao_4 = new DailyScore(10, 10, 10);
			DailyScore thanhThao_5 = new DailyScore(10, 10, 10);
			DailyScore thanhThao_6 = new DailyScore(10, 10, 10);
			List<DailyScore> listThanhThao_1 = new ArrayList<>();
			listThanhThao_1.add(thanhThao_1);
			listThanhThao_1.add(thanhThao_2);
			listThanhThao_1.add(thanhThao_3);

			// Create final code of java advance of thanh thao
			FinalScore finalThanhThao_advance = new FinalScore(listThanhThao_1, 7, 7, javaAdvance, thanhThao);

			// Create list of final score
			List<FinalScore> listFinal = new ArrayList<FinalScore>();
			listFinal.add(finalTinhAnh_basic);
			listFinal.add(finalTinhAnh_advance);
			listFinal.add(finalThanhThao_basic);
			listFinal.add(finalThanhThao_advance);

			class1.setList(listFinal);

			// Choose activity
			String re = "y";
			while (re.equals("y")) {
				System.out.println("What do you want: ");
				System.out.println("1. Add information of new student");
				System.out.println("2. View information of student");
				System.out.println("3. View mark table all student");
				System.out.println("4. Update score");
				System.out.println("Please choose student 1 / 2 / 3 / 4 ");
				int active = Integer.parseInt(input.readLine());
				if (active < 1 || active > 4) {
					throw new ArithmeticException("Invalid values! Please choose again!");
				}
				switch (active) {
				case 1:

					String cont = "y";
					while (cont.equals("y")) {
						// Enter information of student
						System.out.println("Enter information of student: ");
						System.out.println("Enter name of student: ");
						String name = input.readLine();
						System.out.println("Enter date of birth: ");
						String date = input.readLine();
						System.out.println("Enter email: ");
						String email = input.readLine();
						System.out.println("Enter phone number: ");
						String phone = input.readLine();
						student1.add(new Student(name, date, email, phone));
						System.out.println("------------------------------------------");
						System.out.println("Do you want to continue add other student? ");
						System.out.println("Please choose y / n ? ");
						cont = input.readLine().toLowerCase();
						if (!cont.equals("y") && !cont.equals("n"))
							throw new ArithmeticException("Choice value is not valid!");
					}
					break;
				case 2:
					// Display list information of student
					int i = 1;
					for (Student info : student1) {
						System.out.print(i + ". ");
						info.displayInfoStudent();
						i++;
					}
					break;
				case 3:
					List<FinalScore> list = class1.getList();
					for (FinalScore finalScore : list) {
						Student student = finalScore.getStudent();
						student.displayInfoStudent();
						Subject subject = finalScore.getSubject();
						System.out.println(subject.displayInfoSubject());
						System.out.println(finalScore.getMultipleChoiceTestScore());
						System.out.println(finalScore.getPracticeScore());

						int j = 1;
						List<DailyScore> listDaily = finalScore.getList();
						for (DailyScore score : listDaily) {
							System.out.println();
							System.out.println("Session " + j);
							System.out.println("assignment score: " + score.getAssignmentScore());
							System.out.println("diligence score: " + score.getDiligenceScore());
							System.out.println("positive score: " + score.getPositiveScore());
						}
						System.out.println(finalScore.calTotalScore());
						System.out.println("===========================================");
					}
					break;

				case 4:
					System.out.println("Choose class to enter score: ");
					System.out.println("1. Class Java072016 / 2. Class Java102016 ");
					System.out.println("Please choose student 1 / 2 ");
					int cla = Integer.parseInt(input.readLine());
					if (cla < 1 || cla > 2) {
						throw new ArithmeticException("Invalid values! Please choose again!");
					}
					System.out.println("Choose subject: ");
					System.out.println("1. Java Advance / 2. Java Basic");
					System.out.println("Please choose subject 1 / 2 ");
					int sub = Integer.parseInt(input.readLine());
					if (sub < 1 || sub > 2) {
						throw new ArithmeticException("Invalid values! Please choose again!");
					}
					for (Student student : class1.getM_Student()) {
						System.out.println("Enter score of " + student.getName());
						System.out.println("Choose score: ");
						System.out.println("1. Daily score / 2. Final score");
						System.out.println("Please choose student 1 / 2 ");
						int reScore = Integer.parseInt(input.readLine());
						if (reScore < 1 || reScore > 2) {
							throw new ArithmeticException("Invalid values! Please choose again!");
						}

						double dili, posi, assi, prac, test;
						if (reScore == 1) {
							int count = 1;
							for (Student value : student1) {
								System.out.println("Study session: " + count++);
								System.out.println("Enter diligence score: ");
								dili = Double.parseDouble(input.readLine());
								System.out.println("Enter positive score: ");
								posi = Double.parseDouble(input.readLine());
								System.out.println("Enter assignment score: ");
								assi = Double.parseDouble(input.readLine());
								DailyScore dai = new DailyScore(assi, dili, posi);
								double daily = dai.calScore();
								dai.displayDailyScore(daily);
								arrScore.add(new DailyScore(assi, dili, posi));
							}
						} else {
							for (Student value : student1) {
								System.out.println("Enter practive score: ");
								prac = Double.parseDouble(input.readLine());
								System.out.println("Enter multiple choice test score: ");
								test = Double.parseDouble(input.readLine());
								double fin = value.m_TestScore.calScore();
								FinalScore fan = new FinalScore();
								fan.displayFinalScore(fin);
							}
						}
					}
					break;
				}

				System.out.println("------------------------------------------");
				System.out.println("Do you want to continue other activity? ");
				System.out.println("Please choose y / n ? ");
				re = input.readLine().toLowerCase();
				if (!re.equals("y") && !re.equals("n"))
					throw new ArithmeticException("Choice value is not valid!");
			}
		} catch (IOException | NumberFormatException | ArithmeticException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
}
