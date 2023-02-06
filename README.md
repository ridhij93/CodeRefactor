# CodeRefactor

## SourceCode-ReduceCommunication
It takes a monolithic application and its clustering meta data, and:
(a) Creates clusters with the meta data recommendation.
(b) Computes the movable subgraphs and API candidates.
(c) Relocates the subgraphs based on the isolation information and reduces cross-cluster dependencies.

## Results-ReduceCommunication
Contains clusters for five monolith applications (DayTrader, Acmeair, PetClinic, PlantsByWebsphere, and Mayocat).

## Results-IdApproach
Contains the deployable microservices for five monolith applications (DayTrader, Acmeair, PetClinic, PlantsByWebsphere, and Mayocat). The Swagger files and refactored microservices are in ui/data in the respective folders. It refactors monolith applications into deployable microservices by 
(a) exposing endpoints, 
(b) converting method calls to REST API calls, and 
(c) communicates data using id-passing approach between microservices via APIs.

This work is part of the following paper:
### "Handling Communication via APIs for Microservices", Vini Kanvar, Ridhi Jain, Srikanth Tamilselvam. International Conference on Software Engineering, ICSE-NIER 2023.
