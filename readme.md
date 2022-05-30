# Atlas - Smart Flight Check-in Kiosk for Heathrow

> EBU6304-2022-Software-Engineering-Group-8

**The software program for Heathrow's smart check-in kiosks, which can:**

- Search for scheduled flights based on:
  - Booking Number
  - Passenger Surname and Passenger ID
  - Passenger's ID Card
- Choose the seat.
  - Support cabin upgrade during check-in.
- Choose airline food.
  - Visual menu ordering.
- Print the boarding pass after check-in.

**Reserve the following data interfaces for airport management staff:** 

*We wrote an interactive Demo user interface called `BackEnd`*

- Check flight info
  - flight number, boarding time, time left to board, destination, unboarded passenger...
- Check passenger info
  - Reservation

# How to Run?

## Running Environment

- **JDK** 16

- **Apache Maven** 3.8.1

## Start Command

**In the directory where the JAR package is stored**

- Check-in Program

```shell
java -jar CheckIn.jar
```

- BackEnd (Demo)

```shell
java -jar BackEnd.jar
```

## Running Source Code

1. Import this project into `IDEA`

2. Make sure Project SDK configuration is `16`

   ![image-20220530215416203](https://typorastroage.oss-cn-beijing.aliyuncs.com/img/image-20220530215416203.png)

2. Program Entrance:

   - Check-in project entrance.

   ```
   src/java/EnterCheckIn.java
   ```

   - BackEnd Demo entrance

   ```
   src/java/EnterBackEnd.java
   ```

## Configuration

Configure at  `src/java/Config/Config`

**Test data Updated configuration information**:

- Interval between the closing time of all flights and the real time time (unit: minute)
  - Default: 3 minutes

```java
public static final int closeFromNow_min = 3;;
```

- Time interval between closing and check-in of different flights (unit: hour)
  - Default: 4 testing flight. Step[0, 3, 24, 26]

```java
public static final int[] flightStep_hour = {0, 3, 24, 26};
```

- How long will it take off after the check-in is closed
  - Default: 30 minutes

```java
public static final int departureAfterClose = 30;
```

# Directions for use

## Kiosk manual



## Back End Demo manual



# Software Structure

7 Packages

- CheckIn
- BackEnd
- Beans
- Config
- DataBase
- Exceptions
- Tools

# Notifications
* Date Format in this program: `"dd-MM-yyyy HH:mm:ss"`

