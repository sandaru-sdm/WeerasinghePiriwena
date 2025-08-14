# Weerasinghe Piriwena

A Java Swing desktop application designed to manage and streamline operations for the Weerasinghe Piriwena educational institute. The application provides an intuitive interface for handling student, teacher, and guardian information, subject management, and reporting, all tailored for Sri Lankan educational needs.

## Key Features
- **User Authentication:** Secure login system for administrators and staff.
- **Student Management:** Add, edit, and view student profiles and academic records.
- **Teacher & Guardian Management:** Manage teacher and guardian details efficiently.
- **Subject & Rank Management:** Assign subjects, track student ranks, and generate reports.
- **Dashboard:** Visual overview of key metrics and institute activities.
- **Customizable Themes:** Switch between dark and light modes for better accessibility.
- **Reporting:** Generate printable reports using JasperReports integration.
- **Sri Lankan Phone Validation:** Ensures phone numbers conform to local standards.
- **Image Uploads:** Attach profile images for students and staff.

## Installation & Setup
1. **Clone the repository:**
	```powershell
	git clone https://github.com/sandaru-sdm/WeerasinghePiriwena.git
	```
2. **Navigate to the project directory:**
	```powershell
	cd WeerasinghePiriwena
	```
3. **Build the project:**
	- Use Apache Ant (with `build.xml`) or your preferred IDE (NetBeans recommended).
	- For Ant:
	  ```powershell
	  ant clean
	  ant build
	  ```
4. **Run the application:**
	- Locate the generated JAR file in the `build` directory and run:
	  ```powershell
	  java -jar build/classes/Weerasingha_Piriwena.jar
	  ```
	- Or use your IDE's run configuration.

## Technologies Used
- **Java Swing**: UI development
- **JasperReports**: Reporting
- **FlatLaf**: Modern look and feel
- **Apache Ant**: Build automation
- **NetBeans IDE**: Project structure
- **SVG/PNG Icons**: Custom icons and themes

## Author / Maintainer
- **Sandaru Gunathilake**
- GitHub: [sandaru-sdm](https://github.com/sandaru-sdm)
- For contributions, issues, or feature requests, please open an issue or submit a pull request.

---

Feel free to contribute to this project to improve its features and usability for Sri Lankan educational institutes.

