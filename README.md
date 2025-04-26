# Travel web application


## Project requirements

A web application where users can interact with the offers and travel packages offered by the travel agency


### TODO list

- Location entity to store info about the locations that are available
  - name, description, ...
- Location repository to connect to the database
- Introduce a way to load some dummy data: see demo/DataLoader.java
- Location service to:
  - return all locations
  - return all locations by id
  - return all locations where descriptions contains a certain word
- Location controller to expose the endpoints
- Global exception handler to capture database exceptions

