hadoop-classpath
================

Sample project to show how to solve classpath issues in Hadoop.
http://vanwilgenburg.wordpress.com/2014/09/07/overriding-hadoop-jars-with-mapreduce-v2-how-to-fix-the-classpath/

This project uses Maven

- build project : mvn clean package
- add input.txt to hdfs : hadoop fs -put input.txt
- run Hadoop job : hadoop jar target/classloading-1.0-SNAPSHOT-job.jar
