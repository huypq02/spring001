# Exercises 
## Message
  - Request: student object with name (string) and age (int)
  - Response: list student 
## Requirement
  - return list JSON student

# CURL

## Using @RequestParam
```commandline
curl --location 'localhost:8080/student/v1' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--data-urlencode 'name=<name>' \
--data-urlencode 'age=<age>'
```
## Using @PathVariable
```commandline
curl --location --request POST 'localhost:8080/student/v2/<name>/age/<age>'
```
## Using @RequestBody
```commandline
curl --location 'localhost:8080/student/v3' \
--header 'Content-Type: application/json' \
--data '{
    "name": "<name>",
    "age": <age>
}'
```