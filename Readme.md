# Web Automation Testing with Java and Selenium

- Main Objective is to test android app using java, Slenium ,TestNg



## Getting Started
- JAVA - https://linuxize.com/post/install-java-on-ubuntu-18-04/
- Eclipse - https://linuxize.com/post/how-to-install-the-latest-eclipse-ide-on-ubuntu-18-04/
- Intelij - https://www.jetbrains.com/idea/download/#section=linux
- Maven - https://linuxize.com/post/how-to-install-apache-maven-on-ubuntu-18-04/
- TestNg - https://www.guru99.com/install-testng-in-eclipse.html
- selenium - https://www.selenium.dev/

## Installation Steps :walking:

### 1. Fork it :fork_and_knife:

You can get your own fork/copy of [Test-Automation-Portal](https://github.com/shikshalokam/Test-Automation-Portal) by using the <kbd><b>Fork</b></kbd> button.

### 2. Clone it :busts_in_silhouette:

You need to clone (download) it to a local machine using

```sh
git clone https://github.com/Your_Username/Test-Automation-Portal.git
```

> This makes a local copy of the repository in your machine.

Once you have cloned the `Test-Automation-Portal` repository in GitHub, move to that folder first using the change directory command.

```sh
# This will change directory to a folder Test-Automation-Portal
cd Test-Automation-Portal
```

Move to this folder for all other commands.

### 3. Set it up :arrow_up:

Run the following commands to see that _your local copy_ has a reference to _your forked remote repository_ in GitHub :octocat:

```sh
git remote -v
origin  https://github.com/Your_Username/Test-Automation-Portal.git (fetch)
origin  https://github.com/Your_Username/Test-Automation-Portal.git (push)
```

Now, add a reference to the original [Test-Automation-Portal](https://github.com/shikshalokam/Test-Automation-Portal) repository using

```sh
git remote add upstream https://github.com/shikshalokam/Test-Automation-Portal.git
```

> This adds a new remote named **_upstream_**.

See the changes using

```sh
git remote -v
origin    https://github.com/Your_Username/Test-Automation-Portal.git (fetch)
origin    https://github.com/Your_Username/Test-Automation-Portal.git (push)
upstream  https://github.com/shikshalokam/Test-Automation-Portal.git (fetch)
upstream  https://github.com/shikshalokam/Test-Automation-Portal.git (push)
```

### 4. Run it :checkered_flag:
- `mvn clean test`
- Open Eclipse 
   - File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
   - Select the right project
- Right Click testng.xml file and Run as Java TestNG


### Remote URL

 -need to be added


### MVN Command to run in Local (Physical device needs to be connected or an Emulator)

mvn clean test -Psmoke -DMode=local
