# Courses and Reviews REST API
A simple REST api project built with Spark.

#### I. Intro
 This project provides the following REST endpoints:
- **/courses**
	- POST: add a course to server;
	- GET: get all courses from server.
- **/courses/{id}**
	- GET: get a specific course from server.
- **/courses/{id}/reviews**
	- POST: add a review to a specific course;
	- GET: get the reviews of a specific course.

#### II. What you can learn
From this project, besides knowing the basic steps to build REST service, you can also get familiar with the following topics.

**IntelliJ IDEA**
The IDE used in this project, one of the most popular Java IDE.

**Gradle**
One of the most popular java building tools.  There are also other java building tools like Maven, Ant, etc.
[Java Build Tools: Ant vs Maven vs Gradle](https://technologyconversations.com/2014/06/18/build-tools/)

**Spark**
A micro framework for creating web applications in Java 8 with minimal effort, **NOT** the well known Apache Spark. Spark is built around Java 8's lambda philosophy, which makes a typical Spark application a lot less verbose than most application written in other Java web frameworks.
[Spark Homepage](http://sparkjava.com)

**Dao:**
Data Access Object is an object that provides an abstract interface to some type of database or other persistence mechanism. By mapping application calls to the persistence layer, DAO provide some specific data operations without exposing details of the database.

**Serialization**
Serialization is usually used When the need arises to send your data over network or stored in files. By data I mean objects and not text.
Now the problem is your Network infrastructure and your Hard disk are hardware components that understand bits and bytes but not JAVA objects.
Serialization is the translation of your Java object's values/states to bytes to send it over network or save it.
This is analogous to how your voice is transmitted over PSTN telephone lines.

**GSON**
A Java serialization/deserialization library that can convert Java Objects into JSON and back. Created by google.
[GSON Homepage](https://github.com/google/gson)

**Sql2o**
Sql2o is a small java framework that makes it easy to execute sql statements on your JDBC compliant database from java.
[Sql2o Homepage](http://www.sql2o.org)

**Lambda Expression**
Introduced in Java 8. It is an **anonymous function** that you can use to create delegates or expression tree types. By using lambda expressions, you can write local functions that can be passed as arguments or returned as the value of function calls. 

**Test cases**
There are some test cases example included in the project, clone the code and check them out! :)