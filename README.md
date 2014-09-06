hadoop-classpath
================

Sample project to show how to solve classpath issues in Hadoop.

This project uses Maven

- build project : mvn clean package
- add input.txt to hdfs : hadoop fs -put input.txt
- run Hadoop job : hadoop jar target/classloading-1.0-SNAPSHOT-job.jar
