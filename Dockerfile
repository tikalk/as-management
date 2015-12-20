
FROM java:8




EXPOSE 8080

# Copy your fat jar to the container
ADD build/distributions/as-management.tar.gz /as-management

# Launch the verticle
ENV WORKDIR /as-management/run-bin
ENTRYPOINT ["sh", "-c"]
CMD ["cd $WORKDIR ; ./management.sh"]