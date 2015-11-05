# Test-Automation-Intro

Repository for Introduction to test automation training

---

# Requirements / environment setup

## Firefox plugins

- Firebug
  - https://addons.mozilla.org/en-US/firefox/addon/firebug/


- Firepath
  - https://addons.mozilla.org/en-US/firefox/addon/firepath/



## Java

1. Download and install Java SE Development Kit (JDK)
  - http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html


2. Set JAVA_HOME environment variable
  - Right click on Computer and select Properties
  - Click on Advanced system settings (left menu panel)
  - Click on Environment Variables button
  - Click on New button (System variables section)
    - Variable name: JAVA_HOME
    - Variable value: location of the installed JDK, e.g. C:\Program Files\Java\jdk1.8.0_66
  - Extend Path system variable with ;%JAVA_HOME%\bin


## Maven

1. Download and extract Apache Maven
  - http://maven.apache.org/download.cgi (choose binary zip archive)


2. Set M2_HOME environment variable
  - Right click on My Computer and select Properties
  - Click on Advanced system settings (left menu panel)
  - Click on Environment Variables button
  - Click on New button (System variables section)
  - Click on New button (System variables section)
    - Variable name: M2_HOME
    - Variable value: location of installed Maven, e.g. C:\Applications\apache-maven-3.3.3
  - Extend Path system variable with ;%M2_HOME%\bin


## SourceTree

1. Download and install SourceTree
  - https://www.sourcetreeapp.com/download/


2. On the startup screen
  - Tick the I agree to the license agreement
  - Untick the Help improve SourceTree by sending data about your usage
  - Click on the Continue button (necessary components will be downloaded automatically, click on the Next button at the end)


3. Install global ignore file window (You don't have a global ignore file configured currently, would you like SourceTree to install a default one?)
  - Answer no


4. Add an account screen
  - Account: GitHub
  - Username: type your username
  - Password: type your password
  - Click on the OK button


5. If SourceTree asks whether you have an SSH key
  - Answer no


6. Add/clone a repository (main window)
  - Click on the Clone/New button
  - Source Path/URL: https://github.com/TrainingGuestLead/Test-Automation-Intro.git
  - Choose a Destination Path as well, to where the source will be downloaded
  - Click on the Clone button


## Eclipse

1. Download and extract Eclipse
  - https://eclipse.org/downloads/ (Eclipse IDE for Java Developers)


2. Import existing Maven project:
  - File -> Import -> Maven -> Existing Maven Project
  - Click on Next button
  - Browse for the folder which contains pom.xml
  - Click on Finish button


## Test execution

- Right click on the test -> Run As -> JUnit Test
