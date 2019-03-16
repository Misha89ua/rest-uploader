It is aSpring Boot application with the following characteristics:


1) To be exposed as a REST service consuming a file (multipart).
2) To expect 2 request parameters, param1 and param2.
3) The app to be secured with Basic Auth.
4) Set the RestController endpoint to be defined in the YAML properties file.
5) Define a logging configuration using RollingFileAppender with a rolling size of 10KB.
6) Set the logging file path and name to be defined in the YAML properties file.
7) Add a handler/interceptor for the request that logs the file content.
8) Implementation of the application to be to simply log the received request parameters and 
   then return OK to the caller.