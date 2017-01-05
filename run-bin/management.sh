#!/bin/bash

echo "Starting FleetTracker Management"

set -x

DIRNAME=`dirname $0`
APP_HOME=`cd $DIRNAME/..;pwd;`

java -Duser.timezone="UTC" -jar $APP_HOME/build/libs/as-management.jar -cp $APP_HOME/config