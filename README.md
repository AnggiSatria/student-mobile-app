Student Mobile App

Overview

This project is a mobile application for student management, developed using Java and Android. It provides functionalities such as managing student data and other related features.

Installation Guide

Prerequisites

Java Development Kit (JDK):

Install JDK version 8 or later from Oracle JDK or use OpenJDK.

Verify installation:

java -version

Android Studio:

Download and install Android Studio.

Configure the environment and ensure you have an emulator set up.

Git:

Install Git from Git and verify installation:

git --version

Steps to Install

Clone the Repository:

git clone https://github.com/AnggiSatria/student-mobile-app.git
cd student-mobile-app

Install Dependencies:

Run the Gradle build script to download dependencies:

./gradlew build   # For Linux/macOS
gradlew.bat build # For Windows

Open Project in Android Studio:

Open Android Studio.

Navigate to the project folder and click Open.

Wait for Gradle to sync all dependencies.

Running the Application

On Emulator

Set up an Emulator:

Open AVD Manager in Android Studio.

Create and launch an Android Virtual Device (AVD).

Run the Application:

Click the green Run button or press Shift + F10.

Select the emulator as the target device.

On Physical Device

Enable Developer Options:

Go to your device's Settings > About Phone.

Tap Build Number seven times to enable Developer Options.

Enable USB Debugging:

Navigate to Developer Options and enable USB Debugging.

Run on Device:

Connect the device via USB.

Select the device in Android Studio and run the application.

Troubleshooting

Gradle Sync Issues: Ensure you have a stable internet connection and all dependencies are available.

Emulator Issues: Check that the emulator is correctly configured and supports the required API level.

Build Errors: Verify that your Java and Android SDK versions meet the project's requirements.

License

This project is licensed under the MIT License. See the LICENSE file for details.
