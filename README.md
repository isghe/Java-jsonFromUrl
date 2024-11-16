# Java - jsonFromUrl

from: [simplest-way-to-read-json-from-a-url-in-java](https://stackoverflow.com/a/27028548)

## Install dependencies
### JSON-java
```shell
₿ git clone https://github.com/stleary/JSON-java.git
₿ cd JSON-java/src/main/java
₿ javac org/json/*.java
₿ jar cf json-java.jar org/json/*.class
₿ cd ../../../../
₿ ln -s -i JSON-java/src/main/java/json-java.jar json-java.jar
```
### commons-io-2.17.0
[IOUtils](https://dlcdn.apache.org//commons/io/binaries/commons-io-2.17.0-bin.tar.gz)
```shell
₿ tar xvf commons-io-2.17.0-bin.tar.gz
₿ ln -s -i commons-io-2.17.0/commons-io-2.17.0.jar commons-io-2.17.0.jar
```

# Compile
```shell
₿ . compile.sh
```

# Run
```shell
₿ . run.sh https://jsonplaceholder.typicode.com/users/1 | jq
```
```json
[
  {
    "fromUrl": {
      "website": "hildegard.org",
      "address": {
        "zipcode": "92998-3874",
        "geo": {
          "lng": "81.1496",
          "lat": "-37.3159"
        },
        "suite": "Apt. 556",
        "city": "Gwenborough",
        "street": "Kulas Light"
      },
      "phone": "1-770-736-8031 x56442",
      "name": "Leanne Graham",
      "company": {
        "bs": "harness real-time e-markets",
        "catchPhrase": "Multi-layered client-server neural-net",
        "name": "Romaguera-Crona"
      },
      "id": 1,
      "email": "Sincere@april.biz",
      "username": "Bret"
    },
    "index": 1
  }
]

```
