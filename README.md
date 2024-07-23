
# Android Development Lab Experiments

Welcome to the Android Development Lab Experiments repository! This repository contains a series of experiments designed to cover various aspects of Android app development. Each experiment is intended to help you understand core Android concepts and practices.

## Table of Contents

1. [Experiment 1: Basic Android Application](#experiment-1-basic-android-application)
2. [Experiment 2: Activity Lifecycle and Intents](#experiment-2-activity-lifecycle-and-intents)
3. [Experiment 3: Using Intents and Notifications](#experiment-3-using-intents-and-notifications)
4. [Experiment 4: SQLite Database](#experiment-4-sqlite-database)

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
- [MainActivity.java](/Exp_1/app/src/main/java/com/example/exp_1/MainActivity.java)
- [activity_main.xml](/Exp_1/app/src/main/res/layout/activity_main.xml)


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
- [MainActivity.java](/Exp_2/app/src/main/java/com/example/exp_2/MainActivity.java)
- [AddCustomerActivity.java](/Exp_2/app/src/main/java/com/example/exp_2/AddCustomerActivity.java)
- [Customer.java](/Exp_2/app/src/main/java/com/example/exp_2/Customer.java)
- [activity_main.xml](/Exp_2/app/src/main/res/layout/activity_main.xml)
- [activity_add_customer.xml](/Exp_2/app/src/main/res/layout/activity_add_customer.xml)


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
- [MainActivity.java](/Exp_3/app/src/main/java/com/example/exp_3/MainActivity.java)
- [activity_main.xml](/Exp_3/app/src/main/res/layout/activity_main.xml)
- [button_selector.xml](/Exp_3/app/src/main/res/drawable/button_selector.xml)

## Experiment 4: SQLite Database

### Objectives
- Learn to create and manage an SQLite database.
- Understand CRUD operations using SQLite.

### Procedure
1. Create a database schema and contract class.
2. Implement a `SQLiteOpenHelper` class to manage database creation and versioning.
3. Perform insert, update, delete, and query operations.


### Code
- [MainActivity.java](/Exp_4/app/src/main/java/com/example/exp_2/MainActivity.java)
- [AddCustomerActivity.java](/Exp_4/app/src/main/java/com/example/exp_2/AddCustomerActivity.java)
- [Customer.java](Exp_4/app/src/main/java/com/example/exp_2/Customer.java)
- [Customer.java](/Exp_4/app/src/main/java/com/example/exp_2/DataBaseHelper.java)
- [activity_main.xml](/Exp_4/app/src/main/res/layout/activity_main.xml)
- [activity_add_customer.xml](/Exp_4/app/src/main/res/layout/activity_add_customer.xml)


## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
