How to run:

1. This is a spring boot application, which can be run as Java application directly.
2. There are two rest resources @GET which reads the input from existing file under src/main/resources
	and @POST which can be tested using POSTMAN 
3. The application will be running on port 8090 defined in application.properties
4. Filepath can be changed in RoombaConstancts.java file to take input from file
5. There are two test cases respective to each readInput and generateOutput method
6. To run the program on Unix, jar can be build using maven clean package which will create a snapshot jar roomba_robot-0.0.1-SNAPSHOT.jar
	which can be deployed on unix and can be run using java -jar roomba_robot-0.0.1-SNAPSHOT.jar command or by shell script