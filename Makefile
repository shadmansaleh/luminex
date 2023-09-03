all: run

package:
	mvn package

build:
	mvn compile

run:
	mvn exec:java

