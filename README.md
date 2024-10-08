
# Android Development Lab Experiments

This repository contains experiments from the **Birzeit University course ENCS5150: Advanced Computer Systems Engineering Laboratory**. The experiments are designed to explore key aspects of Android app development, offering practical experience with essential concepts and techniques.

## Table of Contents

1. [Experiment 1: Basic Android Application](#experiment-1-basic-android-application)
2. [Experiment 2: Activity Lifecycle and Intents](#experiment-2-activity-lifecycle-and-intents)
3. [Experiment 3: Using Intents and Notifications](#experiment-3-using-intents-and-notifications)
4. [Experiment 4: SQLite Database](#experiment-4-sqlite-database)
5. [Experiment 5: Frame Animation and Tween Animation](#experiment-5-frame-animation-and-tween-animation)
6. [Experiment 6: Singleton and Shared Preferences](#experiment-6-singleton-and-shared-preferences)
7. [Experiment 7: Fragments](#experiment-7-fragments)
8. [Experiment 8: Integrating REST API into Android Application](#experiment-8-integrating-rest-api-into-android-application)
9. [Experiment 9: Spring Boot Part 1](#experiment-9-spring-boot-part-1)
10. [Experiment 10: Spring Boot Part 2](#experiment-10-spring-boot-part-2)



## Getting Started

To get started with these experiments, clone the repository and open the desired experiment in Android Studio.

```bash
git clone https://github.com/Mohammed-Abed-Alkareem/Android-Lab.git
```

## Experiment 1: Basic Android Application

### Objectives
- Create a simple Android application.
- Understand the structure of an Android project.
- Learn basic UI components like TextView, EditText, and Button.

### Procedure
1. Create a new Android project in Android Studio.
2. Design a simple UI with a TextView, EditText, and Button.
3. Implement functionality to display a greeting message when the button is clicked.


### Code
<details>
  <summary>Experiment 1 Code</summary>

  - [MainActivity.java](Exp_1/app/src/main/java/com/example/exp_1/MainActivity.java)
  - [activity_main.xml](Exp_1/app/src/main/res/layout/activity_main.xml)

</details>



## Experiment 2: Activity Lifecycle and Intents

### Objectives
- What Views, View Groups, Layouts, and Widgets are and how they relate to each other.
- How to declare layouts dynamically at runtime.
- Adding widgets dynamically at runtime.
- Switching between two Activities.
- How to use Events and Event Listeners.

### Procedure
1. Creating a Customer Model
2. Creating new Activity (Add Customer Activity)
3. Making the activity_add_customer Layout (statically using .xml or drag and drop)
4. Implementing Add Customer Activity Java Class
5. Implementing Main Activity Java class


### Code

<details>
  <summary>Experiment 2 Code</summary>
   
- [MainActivity.java](/Exp_2/app/src/main/java/com/example/exp_2/MainActivity.java)
- [AddCustomerActivity.java](/Exp_2/app/src/main/java/com/example/exp_2/AddCustomerActivity.java)
- [Customer.java](/Exp_2/app/src/main/java/com/example/exp_2/Customer.java)
- [activity_main.xml](/Exp_2/app/src/main/res/layout/activity_main.xml)
- [activity_add_customer.xml](/Exp_2/app/src/main/res/layout/activity_add_customer.xml)
</details>

## Experiment 3: Using Intents and Notifications

### Objectives
- Utilize the Intent class to implement various functionalities.
- Create Toast notifications.
- Integrate Google Maps into an application.
- Integrate Gmail into an application.
- Implement Dial-Up functionality in an application.
- Post notifications to the Notification Bar.

### Procedure
1. Adding Buttons
2. Creating Listener for each Button
   - Create a click Listener to dial button
   - Create a click Listener to gmail button
   - Create a click Listener to Google Maps button
   - Notification Creation
   - Create a click Listener for the Toast Message button


### Code

<details>
  <summary>Experiment 3 Code</summary>
  
- [MainActivity.java](/Exp_3/app/src/main/java/com/example/exp_3/MainActivity.java)
- [activity_main.xml](/Exp_3/app/src/main/res/layout/activity_main.xml)
- [button_selector.xml](/Exp_3/app/src/main/res/drawable/button_selector.xml)
</details>

## Experiment 4: SQLite Database

### Objectives
- Learn to create and manage an SQLite database.
- Understand CRUD operations using SQLite.

### Procedure
1. Create a database schema and contract class.
2. Implement a `SQLiteOpenHelper` class to manage database creation and versioning.
3. Perform insert, update, delete, and query operations.


### Code


<details>
  <summary>Experiment 4 Code</summary>
   
- [MainActivity.java](/Exp_4/app/src/main/java/com/example/exp_2/MainActivity.java)
- [AddCustomerActivity.java](/Exp_4/app/src/main/java/com/example/exp_2/AddCustomerActivity.java)
- [Customer.java](Exp_4/app/src/main/java/com/example/exp_2/Customer.java)
- [DataBaseHelper.java](/Exp_4/app/src/main/java/com/example/exp_2/DataBaseHelper.java)
- [activity_main.xml](/Exp_4/app/src/main/res/layout/activity_main.xml)
- [activity_add_customer.xml](/Exp_4/app/src/main/res/layout/activity_add_customer.xml)
</details>

## Experiment 5: Frame Animation and Tween Animation

### Objectives
- Understand how to use Frame animation and Tween animation in Android.
- Learn attributes of translate, rotate, and scale tags.
- Familiarize with the Animation Class.

### Procedure
1. Create a Frame animation application.
   - Import several images into the `res/drawable` folder.
   - Define an XML Drawable for the animation.
   - Add a button and an image view in the activity_main layout.
   - Implement transition animation between images using `TransitionDrawable`.
2. Create a Tween animation application.
   - Add an image to the `res/drawable` folder.
   - Create animation resource files for rotate, scale, and translate animations.
   - Implement animations in the main activity using `AnimationUtils`.

### Code
<details>
  <summary>Experiment 5 Code</summary>
   
#### Frame animation application

- [MainActivity.java](/Exp_5/Exp_5.1/app/src/main/java/com/example/frameanimationapplication/MainActivity.java)
- [activity_main.xml](/Exp_5/Exp_5.1/app/src/main/res/layout/activity_main.xml)
- [animation.xml](/Exp_5/Exp_5.1/app/src/main/res/drawable/animation.xml)


#### Tween animation application

- [MainActivity.java](/Exp_5/Exp_5.2/app/src/main/java/com/example/tweenanimationapplication/MainActivity.java)
- [activity_main.xml](/Exp_5/Exp_5.2/app/src/main/res/layout/activity_main.xml)
- [rotate.xml](/Exp_5/Exp_5.2/app/src/main/res/anim/rotate.xml)
- [scale.xml](/Exp_5/Exp_5.2/app/src/main/res/anim/scale.xml)
- [translate.xml](/Exp_5/Exp_5.2/app/src/main/res/anim/translate.xml)
</details>


## Experiment 6: Singleton and Shared Preferences

### Objectives
- Gain knowledge of shared preferences in Android.
- Introduce the concept of singleton classes in Java.
- Learn how to save and retrieve various data types (strings, integers, long, Boolean) locally on the device using shared preferences.

### Procedure


1. **Creating a Singleton Class**
   - Implement a singleton class called `SharedPrefManager` to handle shared preferences.
   - Define methods to write and read strings from shared preferences.

2. **Building the MainActivity Layout and Java Class**
   - Design a layout with `EditText` for username and password, and `Button` for saving data and navigating to the second activity.
   - Use `SharedPrefManager` to save the values in shared preferences.

3. **Building the SecondActivity Layout and Java Class**
   - Design a layout with `TextView` for displaying username and password, and `Button` for loading data and navigating back to the main activity.
   - Use `SharedPrefManager` to read values from shared preferences.

### Code
<details>
  <summary>Experiment 6 Code</summary>
   
- [MainActivity.java](/Exp_6/app/src/main/java/com/example/sharedpreferencesapplication/MainActivity.java)
- [SecondActivity.java](/Exp_6/app/src/main/java/com/example/sharedpreferencesapplication/SecondActivity.java)
- [SharedPrefManager.java](/Exp_6/app/src/main/java/com/example/sharedpreferencesapplication/SharedPrefManager.java)
- [Hash.java](/Exp_6/app/src/main/java/com/example/sharedpreferencesapplication/Hash.java)
- [LoginActivity.java](/Exp_6/app/src/main/java/com/example/sharedpreferencesapplication/LoginActivity.java)
- [activity_main.xml](/Exp_6/app/src/main/res/layout/activity_main.xml)
- [second_activity.xml](/Exp_6/app/src/main/res/layout/second_activity.xml)
- [login_activity.java](/Exp_6/app/src/main/res/layout/login_activity.xml)

</details>

## Experiment 7: Fragments

### Objectives
1. **Introduce a New Concept in Android Applications:**

- Learn about the concept of Fragments in Android and how they can be utilized to build more efficient and modular applications.

2. **Simplify Code and Reduce Latency Time:**
   
- Understand how Fragments help in simplifying the application’s code structure and reducing latency by enabling efficient UI design, especially for devices with larger screens.
### Procedure
1. **Create a Fragments Communication Application**.
   - Create an app with two fragments (FirstFragment and SecondFragment).
   - FirstFragment sends a string to SecondFragment indicating how many times a button has been clicked.
   - Implement communication via an interface defined in SecondFragment.
     
2. **Create a Fragments Transaction Application**.
   - Create an app that demonstrates adding, removing, attaching, detaching, and replacing fragments dynamically.


### Code

<details>
  <summary>Experiment 7 Code</summary>

#### Fragments Communication Application

- [MainActivity.java](/Exp_7/Exp_7.1/app/src/main/java/com/example/fragmentscommunicationapplication/MainActivity.java)
- [FirstFragment.java](/Exp_7/Exp_7.1/app/src/main/java/com/example/fragmentscommunicationapplication/FirstFragment.java)
- [SecondFragment.java](/Exp_7/Exp_7.1/app/src/main/java/com/example/fragmentscommunicationapplication/SecondFragment.java)
- [activity_main.xml](/Exp_7/Exp_7.1/app/src/main/res/layout/activity_main.xml)
- [fragment_first.xml](/Exp_7/Exp_7.1/app/src/main/res/layout/fragment_first.xml)
- [fragment_second.xml](/Exp_7/Exp_7.1/app/src/main/res/layout/fragment_second.xml)



#### Fragments Transaction Application

- [MainActivity.java](/Exp_7/Exp_7.2/app/src/main/java/com/example/fragmentscommunicationapplication/MainActivity.java)
- [FirstFragment.java](/Exp_7/Exp_7.2/app/src/main/java/com/example/fragmentscommunicationapplication/FirstFragment.java)
- [SecondFragment.java](/Exp_7/Exp_7.2/app/src/main/java/com/example/fragmentscommunicationapplication/SecondFragment.java)
- [activity_main.xml](/Exp_7/Exp_7.2/app/src/main/res/layout/activity_main.xml)
- [fragment_first.xml](/Exp_7/Exp_7.2/app/src/main/res/layout/fragment_first.xml)
- [fragment_second.xml](/Exp_7/Exp_7.2/app/src/main/res/layout/fragment_second.xml)
</details>


## Experiment 8: Integrating REST API into Android Application

### Objectives
- Learn how to integrate Android applications with RESTful web services.
- Understand how to make GET and POST requests to a REST API.
- Learn to parse JSON responses and display the data in the UI.

### Procedure
1. **Designing the User Interface (UI)**
   - Use `ConstraintLayout` to design the main activity layout.
   - Add necessary UI components like `TextView`, `EditText`, `Button`, and `RecyclerView` to display the data fetched from the API.

2. **Creating the Model Class**
   - Create a model class `Student` to represent the data fetched from the API.
   - Define properties like `id`, `name`, and `grade` along with their getter and setter methods.

3. **Implementing the JSON Parser Class**
   - Create a class `StudentJsonParser` that handles the parsing of JSON data into `Student` objects.
   - Use `JSONObject` and `JSONArray` to parse the JSON structure returned by the API.

4. **Implementing the HTTP Manager Class**
   - Create a class `HttpManager` to manage the network requests.
   - Use `HttpURLConnection` to establish a connection and make GET/POST requests.
   - Handle input/output streams to read the server’s response.

5. **Using `AsyncTask` for Network Operations**
   - Implement an `AsyncTask` subclass to perform network operations in the background.
   - Use the `doInBackground` method to make the API calls.
   - Update the UI with the fetched data in the `onPostExecute` method.

6. **Implementing the Main Activity**
   - Implement `MainActivity.java` to handle user interactions like button clicks.
   - Make API requests using the `HttpManager` and display the data in the `RecyclerView`.
   - Handle UI updates and display the data parsed by `StudentJsonParser`.

7. **Configuring Permissions**
   - Add necessary permissions like `INTERNET` in the Android manifest file.

### Code
<details>
  <summary>Experiment 8 Code</summary>
   
- [MainActivity.java](/Exp_8/app/src/main/java/com/example/restapplication/MainActivity.java)
- [Student.java](/Exp_8/app/src/main/java/com/example/restapplication/Student.java)
- [StudentJsonParser.java](/Exp_8/app/src/main/java/com/example/restapplication/StudentJsonParser.java)
- [HttpManager.java](/Exp_8/app/src/main/java/com/example/restapplication/HttpManager.java)
- [ConnectionAsyncTask.java](/Exp_8/app/src/main/java/com/example/restapplication/ConnectionAsyncTask.java)
- [activity_main.xml](/Exp_8/app/src/main/res/layout)
</details>



## Experiment 9: Spring Boot Part 1

### Objectives
- Understand the fundamentals of Spring Boot for building RESTful web services.
- Learn to set up a Spring Boot project and configure the necessary dependencies.
- Develop REST APIs to handle CRUD operations.
- Test the REST APIs using Postman or similar tools.

### Procedure
1. **Setting Up the Spring Boot Project**
   - Use Spring Initializr to create a new Spring Boot project.
   - Add dependencies such as Spring Web, Spring Data JPA, and H2 Database.
   - Import the project into your preferred IDE.
  
2. **Create Project Structure**
- creating packages under the demo package calling them (Controllers, Services and Models)

3. **Testing**
- Run the Spring Boot application. Use Postman or a similar tool to send requests to the API endpoints.




### Code
<details>
  <summary>Experiment 9 Code</summary>
   
- [DemoApplication.java](/Exp_9/demo/demo/src/main/java/com/example/demo/DemoApplication.java)
- [UserController.java](/Exp_9/demo/demo/src/main/java/com/example/demo/controllers/UserController.java)
- [User.java](/Exp_9/demo/demo/src/main/java/com/example/demo/models/User.java)
- [UserService.java](/Exp_9/demo/demo/src/main/java/com/example/demo/services/UserService.java)
</details>




## Experiment 10: Spring Boot Part 2


### Objectives
- Understand the fundamentals of the **Spring Data JPA** framework.
- Learn to create mappings between Java models and relational database models.
- Connect and perform CRUD operations on a MySQL database using Spring Data JPA.


### Procedure

1. Configurations
- **Application Properties:** Set configurations in `src/main/resources/application.properties`:


2. ORM Mapping
- **User Class:** Define a User entity and map it to a `users` table:


- **JPA Repositories:** Create a repository interface for the User entity:

- **Service Layer:** Inject the repository into the service layer:


- **Controller Layer:** Create a REST API controller to interact with the service:

3. Extra Features
- **Delete User:** Implement a delete operation:



### Code
<details>
  <summary>Experiment 10 Code</summary>
   
- [DemoApplication.java](/Exp_10/demo/demo/src/main/java/com/example/demo/DemoApplication.java)
- [UserController.java](/Exp_10/demo/demo/src/main/java/com/example/demo/controllers/UserController.java)
- [User.java](/Exp_10/demo/demo/src/main/java/com/example/demo/models)
- [UserRepository.java](/Exp_10/demo/demo/src/main/java/com/example/demo/repositories/UserRepository.java)
- [UserService.java](/Exp_10/demo/demo/src/main/java/com/example/demo/services/UserService.java)
- [application.properties](/Exp_10/demo/demo/src/main/resources/application.properties)
</details>

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
