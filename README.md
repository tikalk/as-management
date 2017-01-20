# FleetTracker Management Service

This microservice is the management service for the FleetTracker, where UI and other service can manage the entities of the system (Vehicle, Guardian, Device etc).
It is based on SpringBoot platform

## How to build
_______________
From the project home folder run the following command:

./gradlew clean build -x test

This will create self contained zip, that you can unzip on host container. The output zip is located at
ft-managemet/build/distributions/ft-management.zip

## How to run
-----------
You must run MySQL and have the user and schema according to the config file.

Unzip the file ft-managemet/build/distributions/ft-management.zip
cd to the created folder (ft-management)
Run the following command : 
./run-bin/management.sh







 

