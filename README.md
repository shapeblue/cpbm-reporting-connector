### Setting up CPBM SDK

1. Download the CPBM [sdk](http://www.betterbydesign.uk.com/download/cssdk-standard_2.3.0.zip) and extract cssdk-standard.jar

2. Run the SDK jar to install jars and scripts to a directory

3. Go to the directory, fix CRLF in bin/ using sed -i 's/\r//g' bash-script

4. Run the script to install the jars in your local Maven ~/.m2

### Setting up development environment:

1. Download Spring STS from http://spring.io/tools

2. Import this project into STS (Eclipse based Spring IDE)

3. Run mvn clean install once or through STS to setup the project (will take some time)
