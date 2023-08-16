# Archetype parameters rules:
# name      -> name of the application                                                   e.g. Customer Management
# domain    -> one capitalized (first letter camel case) word                            e.g. Customer
# className -> artifactId compacted (all together capitalized). Default value is domain. e.g. CustomerManagement

mvn clean install # install archetype

FOLDER=base-microservice
rm -rf $FOLDER
mkdir $FOLDER
cd $FOLDER

mvn archetype:generate -B \
  -DarchetypeGroupId=com.pilot2023 \
  -DarchetypeArtifactId=spring-boot-archetype-clean-architecture \
  -DarchetypeVersion=1.0.0-SNAPSHOT \
  \
  -DgroupId=com.pilot2023.txt \
  -DartifactId=customer-management \
  -Dversion=1.0.0-SNAPSHOT \
  -Dname="Customer Management" \
  -Ddomain=Customer \
  -DclassName=CustomerManagement

cd customer-management
cp ../../src/main/resources/archetype-resources/.gitignore . # copy .gitignore to microservice folder
mvn clean install # install microservice
cd ../..