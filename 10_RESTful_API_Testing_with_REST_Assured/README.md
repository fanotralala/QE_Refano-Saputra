# API Automation Testing with Rest Assured

## **Rest API**
### API Concept
User (Mobile App) -> Waiter (API) -> Kitchen (Application)

### Fundamemtal API Integration
Mobile App -> API Server -> Ext Process -> API Testing

### Fundamental API Integration (Test Process)
* Record Define API Information
* Parsing, Filter or Recording API Data and then extract
* Recontruction API calls, and sent them from a simulate client
* Test Validation

### The Pratical Test Pyramid
* Unit
* Component
* Integration
* UI

## **BDD Framework with Cucumber**
### BDD With Cucumber Step Overview
1. Write Story
2. Map Steps to Java
3. Configure Stories
4. Run Stories
5. View Reports

## **Rest Assured**
### Feature
* Support for HTTP
* Spport for BBD / Gherkin
* Use of Hamcrest matches for checks
* User of Gpath for selecting element from JSON response

### Preparation
1. Java
2. Maven
3. Compiler (VSCode, Intellij)

### Steps Installation until Testing
1. Install Java, Maven
2. Open compiler
3. Make project structure
4. Create story and Runner class
5. Writing the test with :
   * .given{} > Test Setup
   * .when{} > Test Action
   * .then{} > Test Verification
6. Validation crucial response
7. Validation JSON Schema
8. Reporting by Serenity