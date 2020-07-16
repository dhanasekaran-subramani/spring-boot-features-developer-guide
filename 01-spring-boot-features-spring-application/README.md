##### 1. SpringApplication 
Bootstrap a Spring application started with ``main()`` method

    public static void main(String[] args) {
          SpringApplication.run(MySpringConfiguration.class, args);
      }
Startup information logging can be turned off by setting spring.main.log-startup-info to false

    spring.main.log-startup-info=false

This can be done java class also

    public static void main(String[] args) {
    		new SpringApplicationBuilder(Application.class)
    				.logStartupInfo(false)
    				.run(args);
    
##### 1.1. Startup Failure 

##### 1.2. Lazy Initialization

##### 1.3. Customizing the Banner

##### 1.4. Customizing SpringApplication

##### 1.5. Fluent Builder API

##### 1.6. Application Availability

##### 1.6.1. Liveness State

##### 1.6.2. Readiness State

##### 1.6.3. Managing the Application Availability State

##### 1.7. Application Events and Listeners

##### 1.8. Web Environment

##### 1.9. Accessing Application Arguments

##### 1.10. Using the ApplicationRunner or CommandLineRunner

##### 1.11. Application Exit

##### 1.12. Admin Features