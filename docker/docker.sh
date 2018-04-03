#!/bin/bash

docker run --name some-mongo --volume /home/mongo/Databases/MongoDB:/data/db --publish 27017:27017 --env MONGO_DATA_DIR=/data/db --env MONGO_LOG_DIR=/dev/null --detach mongo:3.6.3