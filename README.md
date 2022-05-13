Effective Kafka
===
This is the repository accompanying [Effective Kafka](https://apachekafkabook.com).

<a href="https://apachekafkabook.com"><img src="https://www.apachekafkabook.com/hero2x.jpeg" width="50%" alt="Effective Kafka cover"/></a>

[The Streams API is not compatible with Kafka clusters running older Kafka versions (0.7, 0.8, 0.9).](https://docs.confluent.io/platform/current/streams/introduction.html#requirements)

[Confluent Platform and Apache Kafka Compatibility](https://docs.confluent.io/platform/current/installation/versions-interoperability.html#cp-and-apache-ak-compatibility)
| Confluent Platform | Apache Kafka® | Release Date       | Standard End of Support | Platinum End of Support |
|--------------------|---------------|--------------------|-------------------------|-------------------------|
| 7.1.x              | 3.1.x         | April 5, 2022      | April 5, 2024           | April 5, 2025           |
| 7.0.x              | 3.0.x         | October 27, 2021   | October 27, 2023        | October 27, 2024        |
| 6.2.x              | 2.8.x         | June 8, 2021       | June 8, 2023            | June 8, 2024            |
| 6.1.x              | 2.7.x         | February 9, 2021   | February 9, 2023        | February 9, 2024        |
| 6.0.x              | 2.6.x         | September 24, 2020 | September 24, 2022      | September 24, 2023      |
| 5.5.x              | 2.5.x         | April 24, 2020     | April 24, 2022          | April 24, 2023          |
| 5.4.x              | 2.4.x         | January 10, 2020   | January 10, 2022        | January 10, 2023        |
| 5.3.x              | 2.3.x         | July 19, 2019      | July 19, 2021           | July 19, 2022           |
| 5.2.x              | 2.2.x         | March 28, 2019     | March 28, 2021          | March 28, 2022          |
| 5.1.x              | 2.1.x         | December 14, 2018  | December 14, 2020       | December 14, 2021       |
| 5.0.x              | 2.0.x         | July 31, 2018      | July 31, 2020           | July 31, 2021           |
| 4.1.x              | 1.1.x         | April 16, 2018     | April 16, 2020          | April 16, 2021          |
| 4.0.x              | 1.0.x         | November 28, 2017  | November 28, 2019       | November 28, 2020       |
| 3.3.x              | 0.11.0.x      | August 1, 2017     | August 1, 2019          | August 1, 2020          |
| 3.2.x              | 0.10.2.x      | March 2, 2017      | March 2, 2019           | March 2, 2020           |
| 3.1.x              | 0.10.1.x      | November 15, 2016  | November 15, 2018       | November 15, 2019       |
| 3.0.x              | 0.10.0.x      | May 24, 2016       | May 24, 2018            | May 24, 2019            |
| 2.0.x              | 0.9.0.x       | December 7, 2015   | December 7, 2017        | December 7, 2018        |
| 1.0.0              | –             | February 25, 2015  | February 25, 2017       | February 25, 2018       |

[Confluent for Kubernetes(CFK)](https://docs.confluent.io/platform/current/installation/versions-interoperability.html#operator-cp-compatibility)
| CFK Version | Compatible Confluent Platform Versions | Compatible Kubernetes Versions     | Release Date  | End of Support |
|-------------|----------------------------------------|------------------------------------|---------------|----------------|
| 2.3.x       | 7.0.x, 7.1.x                           | 1.18 - 1.23 (OpenShift 4.6 - 4.10) | April 5, 2022 | April 5, 2023  |
| 2.2.x       | 6.2.x, 7.0.x                           | 1.17 - 1.22 (OpenShift 4.6 - 4.9)  | Nov 3, 2021   | Nov 3, 2022    |
| 2.1.x       | 6.0.x, 6.1.x, 6.2.x                    | 1.17 - 1.22 (OpenShift 4.6 - 4.9)  | Oct 12, 2021  | Oct 12, 2022   |
| 2.0.x       | 6.0.x, 6.1.x, 6.2.x                    | 1.15 - 1.20                        | May 12, 2021  | May 12, 2022   |

[Kafka Client Compatibility](https://github.com/spring-cloud/spring-cloud-stream/wiki/Kafka-Client-Compatibility)
| Spring Cloud Stream Version | Spring for Apache Kafka Version | Spring Integration for Apache Kafka Version | kafka-clients | Spring Boot  | Spring Cloud |
|-----------------------------|---------------------------------|---------------------------------------------|---------------|--------------|--------------|
| 3.1.x (2020.0.x)            | 2.6.x                           | 5.4.x                                       | 2.6.x         | 2.4.x        | 2020.0.x     |
| 3.0.x (Horsham)*            | 2.5.x, 2.3.x                    | 3.3.x, 3.2.x                                | 2.5.x, 2.3.x  | 2.3.x, 2.2.x | Hoxton*      |


[upgrade-guide](https://kafka.apache.org/31/documentation/streams/upgrade-guide)


# A proposed Kafka maturity model
For a comparison, check out the Confluent white paper titled, “[Five Stages to Streaming Platform Adoption](https://assets.confluent.io/m/41f3c9186d4adb03/original/20180927-WP-Five-Stages_to_Streaming_Platform_Adoption.pdf?ajs_aid=4224d8d2-95b7-4b07-92d7-0dba251be61e&_ga=2.84813978.2024891929.1650607704-1763164608.1648258250)” , which presents a different perspective that encompasses five stages of their streaming maturity model with distinct criteria for each stage . 

# Use Cases
Kafka Streams is optimized for processing unbounded datasets quickly and efficiently, and is therefore a great solution for problems in low-latency, time-critical domains. A few example use cases include:
* Financial data processing ( [Flipkart](https://oreil.ly/dAcbY) ), purchase monitoring, fraud detection
* Algorithmic trading
* Stock market/crypto exchange monitoring
* Real-time inventory tracking and replenishment ( [Walmart](https://oreil.ly/VoF76) )
* Event booking, seat selection ( [Ticketmaster](https://oreil.ly/V4t1h) )
* Email delivery tracking and monitoring (Mailchimp)
* Video game telemetry processing (Activision, the publisher of [Call of Duty](https://oreil.ly/Skan3) )
* Search indexing ( [Yelp](https://oreil.ly/IhCnC) )
* Geospatial tracking/calculations (e.g., distance comparison, arrival projections)
* Smart Home/IoT sensor processing (sometimes called AIOT, or the Artificial Intelligence of Things)
* Change data capture ( [Redhat](https://oreil.ly/INs3z) )
* Sports broadcasting/real-time widgets ( [Gracenote](https://oreil.ly/YeX33) )
* Real-time ad platforms ( [Pinterest](https://oreil.ly/cBgSG) )
* Predictive healthcare, vitals monitoring ( [Children’s Healthcare of Atlanta](https://oreil.ly/4MYLc) )
* Chat infrastructure ( [Slack](https://oreil.ly/_n7sZ) ), chat bots, virtual assistants
* Machine learning pipelines ( [Twitter](https://oreil.ly/RuPPV) ) and platforms ( [Kafka Graphs](https://oreil.ly/8IHKT) )

The list goes on and on, but the common characteristic across all of these examples is that they require (or at least benefit from) `real-time decision making` or data processing. The spectrum of these use cases, and others you will encounter in the wild, is really quite fascinating. On one end of the spectrum, you may be processing streams at the hobbyist level by analyzing sensor output from a Smart Home device. However, you could also use Kafka Streams in a healthcare setting to monitor and react to changes in a trauma victim’s condition, as Children’s Healthcare of Atlanta has done.

Kafka Streams is also a great choice for building microservices on top of real-time event streams. It not only simplifies typical stream processing operations (filtering, joining, windowing, and transforming data), but as you will see in “Interactive Queries”, it is also capable of exposing the state of a stream using a feature called ``interactive queries``. The state of a stream could be an aggregation of some kind (e.g., the total number of views for each video in a streaming platform) or even the latest representation for a rapidly changing entity in your event stream (e.g., the latest stock price for a given stock symbol).

Now that you have some idea of who is using Kafka Streams and what kinds of use cases it is well suited for, let’s take a quick look at Kafka Streams’ architecture before we start writing any code.

# The 20 fastest-rising and sharpest-declining tech skills of the past 5 years: Kafka
https://www.techrepublic.com/article/the-20-fastest-rising-and-sharpest-declining-tech-skills-of-the-past-5-years/


# Kafka Streams Official Examples
https://github.com/confluentinc/kafka-streams-examples