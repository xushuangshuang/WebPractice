#!/bin/sh
mkdir -p $CATALINA_HOME/webapps/WebPractice/
cp -r ./src/main/webapp/*  $CATALINA_HOME/webapps/WebPractice/
cp -r ./taraget/classes $CATALINA_HOME/webapps/WebPractice/WEB-INF/

$CATALINA_HOME/bin/shutdown.sh

$CATALINA_HOME/bin/startup.sh
