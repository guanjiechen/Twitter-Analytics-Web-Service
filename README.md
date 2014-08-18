Twitter-Analytics-Web-Service
=============================

15-619 Cloud Computing Project

A client has approached your company and several other companies to compete on a project to build a web service for Twitter data analysis. The client has provided a raw dump of tweets that runs into tens of gigabytes. The dataset will have to be stored within your web service. The web service should be able to handle a specific number of requests per second for several hours. The client has a limited budget for this solution. Your task is to build an effective and cost
efficient solution utilizing Amazon Web Services resources.

Guideline:
1. Front end should be a web service able to receive and respond to queries. The interface of your service is RESTbased. Specifically, the service should handle incoming HTTP requests and provide suitable responses (as defined in the Query Types section below).
  a. Users access your service using an HTTP GET request through an endpoint URL. Different URLs are needed for each query type, which are shown in Query Types section. Query parameters are included within the URL string of the HTTP
request.
  b. An appropriate response should be formulated for each type of query. The response format should be followed exactly otherwise your web service will not provide acceptable responses when tested with our load generator and testing
system.
  c. The web service should run smoothly for the entire test period, which lasts for several hours.
  d. The web service must not refuse queries and can tolerate peak load.

2. Back end system is used to store the data to be queried.
  a. Millions of tweets are used as the dataset, and you definitely need a capable database to manage the data and handle the queries.
  b. You will evaluate SQL(MySQL) and NoSQL(HBase) database in the first two phases of this project. You will perform comparisons between their performance for different query types for different dataset sizes. You will then decide on an
appropriate storage back end for your final system to compete against other systems based on the results of the previous phases.

3. Your web service should meet the requirements for throughput and cost for queries at a provided workload.

4. The overall service (development and deployment test period) should cost under a specified budget. Less is generally better, otherwise your competitor will win the contract.

5. Your client has a limited budget. So, you can ONLY use m1.small, m1.medium and m1.large instances for your web service (your front end and back end systems). However, you can use spot instances for batch jobs and development but not for the deployed web service (during any point in the testing or during the live test period).

Objectives:
The goal of this project is to practice integrating all parts that you have learned from the course in designing, developing and deploying a real working solution. You can use whatever services you have learned so far, configure and build them, make the system work as a solution, and finally optimize for performance and cost. We encourage you to discover and utilize whatever tools you find available to you. If the tools do not appear in the design constraints of this handout, you MUST discuss them with the professor or TAs before using them.

Dataset
The dataset collected by the client is available on S3. The entire dataset contains about 100 millions of tweets.

Input and output
The web service solution should provide responses to specified queries on the twitter dataset. Users can submit queries about tweets based on userids, tweet id, time or geographical location. The client has collected millions of tweets through Twitter’s streaming API and have collected them as JSON formatted files, which is stored on S3.

The input is in a JSON format. Each line is a JSON object representing a tweet. Twitter’s documentation has a good description of the data format for tweets and related entities in this format. https://dev.twitter.com/docs/platformobjects/tweets.

@Author: Qinghao Hou, Zhangning Hu, Shengyi Zhang
