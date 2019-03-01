package com.capi.ui;

import java.util.List;
import java.util.Scanner;

import com.capi.beans.Course;
import com.capi.exception.CourseException;
import com.capi.service.CourseService;
import com.capi.service.CourseServiceI;

public class CourseMain {

	public static void main(String[] args) {
		CourseService service = new CourseServiceI();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter Choice");
			System.out.println("1.Insert Details");
			System.out.println("2.Show Details");
			System.out.println("3.Update Details");
			System.out.println("4.Delete Details");
			int ch = sc.nextInt();
			sc.nextLine();
			switch (ch) {
			case 1:

				System.out.println("Enter Course Title");
				String courseTitle = sc.nextLine();
				System.out.println("Enter Fees");
				double fees = sc.nextDouble();
				System.out.println("Enter Duration");
				int duration = sc.nextInt();

				Course course = new Course();

				course.setCourseTitle(courseTitle);
				course.setFees(fees);
				course.setDuration(duration);

				if (!service.validate(course)) {
					System.out.println("Invalid");

				}

				service.inserCourse(course);
				System.out.println("Student record added .. ");
				break;

			case 2:

				List<Course> li;
				try {
					li = service.getAllCourses();

					for (Course c : li) {

						System.out.println("Id:" + c.getCourseId());
						System.out.println("Title:" + c.getCourseTitle());
						System.out.println("Duration:" + c.getDuration());
						System.out.println("Fees:" + c.getFees());
					}
				} catch (CourseException e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				}

				break;
			case 3:
				System.out.println("Enter Course Title that you want to update");
				String courseTitle1 = sc.nextLine();
				System.out.println("Enter New Fees");
				double fees1 = sc.nextDouble();
				System.out.println("Enter New Duration");
				int duration1 = sc.nextInt();

				Course course1 = new Course();

				course1.setCourseTitle(courseTitle1);
				course1.setFees(fees1);
				course1.setDuration(duration1);

				if (service.validate(course1)) {
					System.out.println("Invalid");
				}

				service.updateCourse(course1);
				System.out.println("Student record updated .. ");
				break;

			case 4:
				System.out.println(" Enter Roll No: ");
				int rn = sc.nextInt();
				service.deleteCourse(rn);

				System.out.println("Course removed");

				break;

			}
		}
	}

}
