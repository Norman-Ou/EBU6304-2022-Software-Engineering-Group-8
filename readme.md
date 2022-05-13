# EBU6304-2022-Software-Engineering-Group-8

#### Introduction
This is EBU6304 Software Engineering Coursework repository of Group 8

#### File Overview
```
Doc
Iteration Log
src
├─main
│    ├─java
│    │    ├─BackEnd
│    │    │    ├─GUI
│    │    │    │    ├─backend.java
│    │    │    │    ├─backend.jfd
│    │    │    │    ├─Flight.java
│    │    │    │    ├─Flight.jfd
│    │    │    │    ├─Passenger.java
│    │    │    │    ├─Passenger.jfd
│    │    │    ├─Monitor
│    │    │    │    ├─AdminEnd.java
│    │    │    │    ├─WYTest.java
│    │    │    ├─ToEnterBackend.java
│    │    ├─Beans
│    │    │    ├─Flight
│    │    │    │    ├─Flight.java
│    │    │    │    ├─SubClasses
│    │    │    │    │    ├─ExtraOption.java
│    │    │    │    │    ├─Seat.java
│    │    │    ├─IDDocument
│    │    │    │    ├─IDDocument.java
│    │    │    ├─Passenger
│    │    │    │    ├─Passenger.java
│    │    │    │    ├─SubClasses
│    │    │    │    │    ├─Baggage.java
│    │    │    │    │    ├─BoardingPass.java
│    │    │    │    │    ├─CreditCard.java
│    │    ├─CheckIn
│    │    │    ├─EnterCheckIn.java
│    │    │    ├─GUI
│    │    │    │    ├─Airline_1.java
│    │    │    │    ├─Airline_1.jfd
│    │    │    │    ├─BaggageAdd_10.java
│    │    │    │    ├─BaggageAdd_10.jfd
│    │    │    │    ├─Baggage_7.java
│    │    │    │    ├─Baggage_7.jfd
│    │    │    │    ├─BagStore_8.java
│    │    │    │    ├─BagStore_8.jfd
│    │    │    │    ├─CheckInP.iml
│    │    │    │    ├─CheckIn_3.java
│    │    │    │    ├─CheckIn_2.jfd
│    │    │    │    ├─ConfirmPage_4.java
│    │    │    │    ├─ConfirmPage_3.jfd
│    │    │    │    ├─EnterBN.java
│    │    │    │    ├─EnterBN_3.jfd
│    │    │    │    ├─EnterOther.java
│    │    │    │    ├─EnterOther_3.jfd
│    │    │    │    ├─Error.java
│    │    │    │    ├─Error.jfd
│    │    │    │    ├─exit_16.java
│    │    │    │    ├─Exit.jfd
│    │    │    │    ├─MealAdd_14.java
│    │    │    │    ├─MealAdd_14.jfd
│    │    │    │    ├─MealNorm_13.java
│    │    │    │    ├─MealNorm_13.jfd
│    │    │    │    ├─MealPay_15.java
│    │    │    │    ├─MealPay_15.jfd
│    │    │    │    ├─Meal_12.java
│    │    │    │    ├─Meal_12.jfd
│    │    │    │    ├─PrintBag_11.java
│    │    │    │    ├─PrintBag_11.jfd
│    │    │    │    ├─PrintFlight_6.java
│    │    │    │    ├─PrintFlight_6.jfd
│    │    │    │    ├─SeatFirst_ac5.java
│    │    │    │    ├─SeatFirst_5.jfd
│    │    │    │    ├─SelectSeat_act6.java
│    │    │    │    ├─SelectSeat_act6.jfd
│    │    │    │    ├─VIPSeat.java
│    │    │    │    ├─VIPSeat.jfd
│    │    │    │    ├─VIPSeatPay.java
│    │    │    │    ├─VIPSeatPay.jfd
│    │    │    │    ├─Weight_9.java
│    │    │    │    ├─Weight_9.jfd
│    │    │    ├─Monitor
│    │    │    │    ├─Listeners.java
│    │    │    │    ├─MonitorTest.java
│    │    ├─Config
│    │    │    ├─Config.java
│    │    ├─DataBase
│    │    │    ├─DataBase.java
│    │    │    ├─fDB.java
│    │    │    ├─pDB.java
│    │    ├─Tools
│    │    │    ├─DataCreation.java
│    │    │    ├─DataTransfer.java
│    │    │    ├─FileTreeCreator.java
│    │    │    ├─Utilities.java
│    ├─resources
│    │    ├─Check.properties
│    │    ├─flight_data.json
│    │    ├─icon.png
│    │    ├─img.png
│    │    ├─passenger_data.json
├─test
│    ├─java
```

#### Software Structure
1. Back_End System
2. Check_In System

#### Notifications
1. As for flight categories, we have two kinds of flight regarding their seating list distribution. 
* For `twoSeat.png` kind of seats the type is 'A'
* For `triSeat.png` kind of seats the type is 'B'

* Date Format in JSON data: `"dd-MM-yyyy HH:mm:ss"`

#### How to run this project

1. Install `jdk1.8.0`
2. Import this project into `IDEA`
3. Go into `CheckIn.PassengerEnd.java` and run the `main` method
