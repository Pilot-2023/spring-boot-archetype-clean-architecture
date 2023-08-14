# Archetype parameters rules:
# name      -> name of the application
# domain    -> one capitalized (first letter camel case) word
# className -> artifactId compacted (all together capitalized). Default value is domain.

FOLDER=base-microservice

mvn clean install # install archetype

rm -rf $FOLDER
mkdir $FOLDER
cd $FOLDER

mvn archetype:generate -B \
  -DarchetypeGroupId=com.pilot2023 \
  -DarchetypeArtifactId=spring-boot-archetype-clean-architecture \
  -DarchetypeVersion=1.0.0-SNAPSHOT \
  \
  -DgroupId=com.pilot2023.txt \
  -DartifactId=expense-management \
  -Dversion=1.0.0-SNAPSHOT \
  -Dname="Expense Management" \
  -Ddomain=Expense \
  -DclassName=ExpenseManagement

cd expense-management
cp ../../src/main/resources/archetype-resources/.gitignore . # copy .gitignore to microservice folder
mvn clean install # install microservice
cd ../..