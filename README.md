# Java - jsonFromUrl

from: [simplest-way-to-read-json-from-a-url-in-java](https://stackoverflow.com/a/27028548)

## Install dependencies
### JSON-java
```shell
$ git clone https://github.com/stleary/JSON-java.git
$ cd JSON-java/src/main/java
$ javac org/json/*.java
$ jar cf json-java.jar org/json/*.class
$ cd ../../../../
$ ln -s -i JSON-java/src/main/java/json-java.jar json-java.jar
```
### commons-io-2.9.0
[IOUtils](https://downloads.apache.org//commons/io/source/commons-io-2.9.0-src.tar.gz)
```shell
$ tar xvf commons-io-2.9.0-src.tar.gz
$ ln -s -i commons-io-2.9.0/commons-io-2.9.0.jar commons-io-2.9.0.jar
```

# Compile
```shell
$ . compile.sh
```

# Run
```shell
$ . run.sh | jq
```
```json
[
  {
    "fromUrl": {
      "date": "2021-05-30T14:58:48.165Z",
      "headers": {
        "x-request-id": "*",
        "x-forwarded-proto": "https",
        "connect-time": "1",
        "total-route-time": "0",
        "host": "get-my-public-ip-address.herokuapp.com",
        "x-request-start": "***",
        "x-forwarded-port": "*",
        "connection": "close",
        "x-forwarded-for": "*.*.*.*",
        "user-agent": "Java/1.8.0_261",
        "accept": "text/html, image/gif, image/jpeg, *; q=.2, */*; q=.2",
        "via": "1.1 vegur"
      },
      "ip": "*.*.*.*",
      "remoteAddress": "*"
    },
    "index": 1
  }
]

```