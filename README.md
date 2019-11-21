# Reservations Service

## Prequisites
* [Java (1.8+)]()
* [Maven]()
* [Shared Static Data Service](https://github.com/billybissic/shared-static-data-service)

## Pre-Build Tasks
##### Configurations
BookingInquiry.java

In the BookingInquiry class you will find the WebMvcConfigurer. You will need to modify by adding the urls that you would like to have access to the booking inquiry service. If you need to specify a port appended it to the url. 

Ex.
```
@Bean
public WebMvcConfigurer corsConfigurer() {
  return new WebMvcConfigurerAdapter() {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/BookingInquiryServices/**").allowedOrigins(
            "http://someURLsGoHere",
            "http://someOtherUrlGoesHere:80"
        );
    }
  };
}
```

This will be moved to the application properties soon. From there you will be able to update a single file for configurations.

## Build
##### Maven
To build with Maven, simply run maven's package command:

```
mvn package
```
## Installation
Once the package is successful you should find the war file in the target directory. Install into your tomcat or jetty server.

```
total 49392
drwxr-xr-x 1 197121        0 Nov 21 01:13 maven-status/
drwxr-xr-x 1 197121        0 Nov 21 01:13 generated-sources/
drwxr-xr-x 1 197121        0 Nov 21 01:13 classes/
drwxr-xr-x 1 197121        0 Nov 21 01:13 reservations-service/
drwxr-xr-x 1 197121        0 Nov 21 01:13 maven-archiver/
-rw-r--r-- 1 197121 28397806 Nov 21 01:13 reservations-service.war
```
