# spring-jms-mq
Springboot sample to work with JMS using IBM MQ as the MQ provider

This uses the sample at http://ciruk.pl/2017/01/testing-jms-bridge-to-ibm-mq-with-spring-boot/ as the basis.

This uses a number of components and we need to keep it simple and reduce all the dependencies to the bare minimum.

Use the following commands to add MQ jars to local maven repo:

mvn install:install-file -Dfile=com.ibm.mq.allclient.jar -DgroupId=com.ibm.mq -DartifactId=mq-jms-allclient  -Dversion=7.5 -Dpackaging=jar -DgeneratePom=true  

mvn install:install-file -Dfile=com.ibm.mq.axis2.jar -DgroupId=com.ibm.mq -DartifactId=mq-jms-axis2  -Dversion=7.5 -Dpackaging=jar -DgeneratePom=true  

mvn install:install-file -Dfile=com.ibm.mq.defaultconfig.jar -DgroupId=com.ibm.mq -DartifactId=mq-jms-defaultconfig  -Dversion=7.5 -Dpackaging=jar -DgeneratePom=true

mvn install:install-file -Dfile=com.ibm.mq.headers.jar -DgroupId=com.ibm.mq -DartifactId=mq-jms-mqheaders  -Dversion=7.5 -Dpackaging=jar -DgeneratePom=true

mvn install:install-file -Dfile=com.ibm.mq.jar -DgroupId=com.ibm.mq -DartifactId=mq-jms-mq  -Dversion=7.5 -Dpackaging=jar -DgeneratePom=true

mvn install:install-file -Dfile=com.ibm.mq.jmqi.jar -DgroupId=com.ibm.mq -DartifactId=mq-jms-jmqi  -Dversion=7.5 -Dpackaging=jar -DgeneratePom=true

mvn install:install-file -Dfile=com.ibm.mq.jms.Nojndi.jar -DgroupId=com.ibm.mq -DartifactId=mq-jms-nojndi  -Dversion=7.5 -Dpackaging=jar -DgeneratePom=true

mvn install:install-file -Dfile=com.ibm.mq.pcf.jar -DgroupId=com.ibm.mq -DartifactId=mq-jms-pcf  -Dversion=7.5 -Dpackaging=jar -DgeneratePom=true

mvn install:install-file -Dfile=com.ibm.mq.soap.jar -DgroupId=com.ibm.mq -DartifactId=mq-jms-soap  -Dversion=7.5 -Dpackaging=jar -DgeneratePom=true

mvn install:install-file -Dfile=com.ibm.mq.postcard.jar -DgroupId=com.ibm.mq -DartifactId=mq-jms-postcard  -Dversion=7.5 -Dpackaging=jar -DgeneratePom=true

mvn install:install-file -Dfile=com.ibm.mq.tools.ras.jar -DgroupId=com.ibm.mq -DartifactId=mq-jms-ras  -Dversion=7.5 -Dpackaging=jar -DgeneratePom=true

mvn install:install-file -Dfile=com.ibm.mq.traceControl.jar -DgroupId=com.ibm.mq -DartifactId=mq-jms-tracecontrol  -Dversion=7.5 -Dpackaging=jar -DgeneratePom=true

