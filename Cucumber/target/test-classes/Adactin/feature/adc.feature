Feature: Hotel Booking in Adactin Application

Scenario: User Login in the Web Application
Given User Launch the Adactin Application
When User Enter the Username in Username Field
And User Enter the Password in Password Field
Then User Click the Login Button

Scenario: User Fill the Room Details in Search Hotel Page
When user Select the Location in Location field
And user Select the Hotels in Hotels Field
And user Select the Room_Type in Room_Type Field
And user Select the Number of Rooms in Number of Rooms Field
And user Select the Check In Date in Check In Date Field
And user Select the Check Out Date in Check Out Date Field
And user Select the Adults per room in Adults per Room Field
And user Select the Children's per Room in Children's Room Field
Then user Click the Search Button

Scenario: User Select the Hotel in Select Hotel Page
When user Select the Hotel
Then user Click the Continue Button

Scenario: user Fill the Details in Booking the Hotel Page
When user Fill the Firstname in Firstname Field
And user Fill the Lastname in Billing Field
And user Fill the Credit Card Number in Credit Card Number Field
And user Select the Credit Card Type in Credit card type Field
And user Select the Expire Month in Select Month Field
And user Select the Expire Year in Select Year Field
And user Fill the CVV Number in CVV Number Field
Then user Click the Book Now Button

Scenario: User confirm the Details in the Booking Confirm Page
Then user Click the Logout Button
