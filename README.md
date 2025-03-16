# Magento 2 Admin Panel Test Automation

## Project Overview
This project aims to automate the testing of the Magento 2 Admin Panel using Selenium WebDriver, Java, and TestNG. It covers the following key areas to ensure system stability and functionality:

- **Login**
- **Dashboard**
- **Product Management**
- **Order Management**
- **User Roles & Permissions**

## Tech Stack

- **Programming Language:** Java
- **Automation Framework:** Selenium WebDriver, TestNG
- **Build Tool:** Maven
- **Reporting:** Extent Reports / Allure Reports
- **Version Control:** Git & GitHub
- **CI/CD (Optional):** GitHub Actions / Jenkins

## Getting Started

### Prerequisites
Ensure you have the following installed on your system:
- Java Development Kit (JDK) 8+
- Apache Maven
- Git
- Google Chrome
- ChromeDriver

### Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/mrakiyaaa/Magento-2-Admin-Panel-Test-Automation.git
   cd magento2-test-automation
   ```
2. Install dependencies using Maven:
   ```sh
   mvn clean install
   ```

### Running the Tests
To execute the tests, use the following command:
```sh
mvn test
```

### Reporting
After test execution, reports can be accessed in:
- **Extent Reports:** `target/extent-reports/index.html`
- **Allure Reports:** Generate the report using:
  ```sh
  mvn allure:serve
  ```

## CI/CD Integration (Optional)
This project supports continuous integration using GitHub Actions or Jenkins. Configure your pipeline to trigger tests on every code push.

## Contributing
Feel free to fork this repository and submit pull requests for enhancements and bug fixes.

## License
This project is licensed under the MIT License.

