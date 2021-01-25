Simple app to test for proxy interferance with 401 response.

Project generated using spring initializr. https://start.spring.io/

## Building the application
`gradle build`

## Running the application
`gradle bootRun`

TODO: build war

## Checking responses

There are 2 endpoints set up in [ResponseController.java](src/main/java/com/example/demo401/ResponseController.java)

### response/200

Using network tools, make a GET request to this endpoint and verify the response status is 200.

`curl -IX GET http://localhost:8080/demo401/response/200`

output

```
HTTP/1.1 200 
Content-Length: 0
Date: Mon, 25 Jan 2021 19:10:17 GMT
```

### response/401

Using network tools, make a GET request to this endpoint and verify the response status is 401.

`curl -IX GET http://localhost:8080/demo401/response/401`

output
```
HTTP/1.1 401 
Content-Length: 0
Date: Mon, 25 Jan 2021 19:09:54 GMT
```



TODO: maybe check PUT while we're at it
