# Pirate Server Microservices Backend
This application is the first iteration of a distributed system that allows you to manage pirates and hire a pirate if you so desire.

This application consists of a Microservices backend. An image below describes the overall architecture (React client not included):
![architecture.PNG](architecture.png)


## Description of Each Service
The following is a list of the various repositories that contain the code for each microservice:
- [Pirate Server](https://github.com/2011JavaReact/7w-PirateServer-SpringBoot) (this repo): Contains endpoints that allow you to GET and POST pirates. Used for managing the data regarding pirates. Operates on an H2 DB
- [HirePirateService](https://github.com/2011JavaReact/7w-HirePirateService): Has one endpoint that uses a rest template to make a request of the Pirate Server. It has another endpoint that will allow it to act as an SNS client and send push notifications through SNS. AWS SNS will then send a message that will be stored in AWS SQS
- [HireServiceProcessor](https://github.com/2011JavaReact/7w-HireServiceProcessor): Polls the AWS SQS Queue with an SQS client. Doesn't do anything with the messages right now.
- [Service Registry (Eureka)](https://github.com/2011JavaReact/7w-eureka-service-registry): Generic Service registry that uses Eureka

## Getting Started
1. Pull the source code for all of the repos above
1. If you want to run the `HirePirateService` and the `HireServiceProcessor` you have to set up an AWS SQS queue and hook it up to AWS SNS.
    - Video on how to do it [here](https://www.youtube.com/watch?v=VXsAgYoC1Jc)
1. You will also want to use AWS IAM to create a new user with full permissions on AWS SNS and AWS SQS. Make sure you allow for programmatic access and take note of the `Access Key Id` and `Secret Key Id`. 
1. You will need to set environment variables for both of these values in the `HirePirateService` and the `HireServiceProcessor`.
1. In addition, set an environment variable for the `TOPIC_ARN` in the `HirePirateService` and the `QUEUE_URL` in the `HireServiceProcessor`
1. Once you have done all of this configuration, you can start your spring boot applications. Start with the Eureka server, then run the rest in any order.


