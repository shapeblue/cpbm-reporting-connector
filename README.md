### Setting up CPBM SDK

1. Download the CPBM [sdk](http://www.betterbydesign.uk.com/download/cssdk-standard_2.3.0.zip) and extract cssdk-standard.jar

2. Run the SDK jar to install jars and scripts to a directory

3. Go to the directory, fix CRLF in bin/ using sed -i 's/\r//g' {script} or tr -d '\r' < bash-script.sh > final-script.sh

4. Run the script to install the jars in your local Maven ~/.m2

### Setting up development environment:

1. Download Spring STS from http://spring.io/tools

2. Import this project into STS (Eclipse based Spring IDE)

3. Run mvn clean install once or through STS to setup the project (will take some time)

### Install and Usage

After building the jars (both service and fragment connectors), put the jar
file in /usr/share/vts3/connector_ext and put the following line in the
`com.citrix.cpbm.connector.ext.plan` file:

    <artifact type="bundle" name="com.shapeblue.cpbm.reporting" version="[1.0.0, 2.0.0)"/>
    <artifact type="bundle" name="com.shapeblue.reporting.fragment" version="[1.0.0, 2.0.0)"/>

Now, restart cloud-portal service. In the logs (/var/log/cloud/portal/) you should
see the new plugin installed/setup.

Upon installation the fragment/UI connector's endpoints are accessible here:

    http://<IP>:8080/portal/portal/connector_resources/shapebluereports_fragment/reports
