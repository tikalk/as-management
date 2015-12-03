# AngelSense Management Service

This microservice is the management service for the AngelSense, where UI and other service can manage the entities of the system (Angel, Guardian, Device etc).
It is based on SpringBoot platform

## How to build
_______________
From the project home folder run the following command:

./gradlew clean build -x test

This will create self contained zip, that you can unzip on host container. The output zip is located at
as-managemet/build/distributions/as-management.zip 

## How to run
-----------
You must run MySQL and have the user and schema according to the config file.

Unzip the file as-managemet/build/distributions/as-management.zip  
cd to the created folder (as-management)
Run the following command : 
./run-bin/management.sh







 

