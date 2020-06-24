# Instructions

	Repo for Search Restaurants Project


## Getting Started

	These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

	To run the project locally, please make sure to have the following downloaded and installed (if applicable):

	* [Java 8 JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - any version of Java Standard Edition Development Kit 8
	* [Eclipse](http://www.eclipse.org/downloads/eclipse-packages/) - any newer version of Eclipse IDE for Java EE Developers

### Setup

	1. Download and install Java JDK
	2. Download and extract Eclipse
	3. Eclipse: Window >> Preferences >> Java >> Installed JREs >> select installed JREs >> Edit >> make sure that JRE Home points to C:\Program Files\Java\jdk1.8.0_xxx\jre directory
	4. Eclipse: Help >> Eclipse Marketplace >> type testng in Find search box >> click install button for TestNG for Eclipse
	5. Download and extract [SearchRestaurantsProject repo](https://github.com/rayzhangqa/SearchRestaurantsProject)
	6. Copy/Paste SearchRestaurantsProject folder to your Eclipse's workspace folder
	7. Eclipse: File >> Import >> Existing Maven Projects >> Next >> Root Directory should be your Eclipse's workspace\SearchRestaurantsProject folder (for example: C:\Users\username\Desktop\workspace\SearchRestaurantsProject) >> Finish

### Running the tests

	1. To run individual test: Eclipse >> expand src/test/java within package explorer >> right mouse click any test (.java file) within any testCases package >> Run As >> TestNG Test
	2. To run group of tests within the test suit: Eclipse >> expand resources within package explorer >> right mouse click testng.xml >> Run As >> TestNG Suite


###The introduction of SearchRestaurantsProject Automated Test Framework.

	Language: Java.  
	IDE: Eclipse
	Framework Type: Behavioral-driven by using Page Object Model design pattern.
	POM: We maintained a class for every web page. 
	Packages: All page classes are under pageObjects package. All test related classes are under testCases package.
	TestNG: Using TestNG for Assertions, Grouping and Parallel execution.
	Maven: For build, execution, and dependency. Integrating the TestNG dependency in the POM.xml.
	Version Control Tool: use github as a repository to store my test scripts.

	

 
