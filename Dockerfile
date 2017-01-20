
FROM java:8




EXPOSE 8080

# Copy your fat jar to the container
ADD build/distributions/ft-management.tar.gz /ft-management

# Launch the verticle
WORKDIR /ft-management

CMD run-bin/management.sh