# Simple Spring API demo for Todo items
- OpenApi spec in Apicur.io
- Spring backend generated by OpenAPI generator
- customized templated pojo.mustache template to include Spring specific @annotations
- API testing using schemathesis

- done following this RedHat tutorial https://appdev.consulting.redhat.com/tracks/contract-first/introduction-to-openapi-and-apicurio.html



# Original generted read.me
## OpenAPI generated server

Spring Boot Server

### Overview
This server was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.
By using the [OpenAPI-Spec](https://openapis.org), you can easily generate a server stub.
This is an example of building a OpenAPI-enabled server in Java using the SpringBoot framework.


The underlying library integrating OpenAPI to Spring Boot is [springdoc](https://springdoc.org).
Springdoc will generate an OpenAPI v3 specification based on the generated Controller and Model classes.
The specification is available to download using the following url:
http://localhost:8080/v3/api-docs/

Start your server as a simple java application

You can view the api documentation in swagger-ui by pointing to
http://localhost:8080/swagger-ui.html

Change default port value in application.properties
