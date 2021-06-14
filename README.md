# Prepare for test
1. create a configuration file corresponding to tst environment, like uat named application-${env}.yaml file.  
2. use start up command line `java -jar ${absolute or relative path}/business-card-srv.jar --spring.profiles.active=${env} --spring.config.additional-location=${file path} --logging.file.path=${folder path} >nohup.output  2>&1 &`  
3. start testing your server