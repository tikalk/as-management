
FROM java:8




EXPOSE 8080

# Copy your fat jar to the container
ADD build/distributions/as-management.tar.gz /as-management

# Launch the verticle
WORKDIR /as-management

CMD run-bin/management.sh