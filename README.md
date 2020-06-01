## A CLEAN ARCHITECTURE MULTI-PROJECT STRUCTURE USING KOTLIN MODULES

#### GOALS
- Separate concerns and promote architecture levels isolation
- Rely only on own language modifiers and gradle to enforce dependencies violation among clean architecture levels
- Dependency violation detect on development/compilation time
- Dependency flow always points inward

#### COMPONENTS

<p align="center">
  <img width="600px" src="./clean_arch.jpg">
</p>

- **entities**, **application** and **adapters** layers
- **entities** are fully independent of any other layer
- **application** only depends on **entities**
- **adapters** only depend on **application** and **entities**
- frameworks and all other external dependencies are all centralized in the **adapters** layer
- no external dependencies are allowed in entities and application, so that business rules and enterprise rules
 are not polluted with external libraries

#### STACK
- IntelliJ IDEA 2020.1
- Gradle 6.1 
- Kotlin 1.3.72
