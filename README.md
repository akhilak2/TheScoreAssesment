## Prerequisites: ##
1. Install Android Studio 2021.1.1
2. JDK 1.8 or greater
3. Appium Server v1.22.3

## Configure steps ##
1. Open Android studio -> Device Manager and create Device
2. Install the TheScore APK in emulator using adb install <theScore.apk> command from command prompt.
3. Clone the git repo
4. Update the config.properties file.
5. Run the test using mvn clean test command.