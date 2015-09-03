// Max Grossman
// 03-09-15
//CSE002
// The purpose of this program is to measure the time and distance of a bikecycle trip as well as the number of rotations of the bicycle  wheels\
public class Cyclometer{
// main method for every java program
public static void main(String[] args){
//the first class
int secsTrip1=480; // amount of time for the first trip
int secsTrip2=3220; // amount of time for the second trip
int countsTrip1=1561; // number of wheel rotations for the first trip
int countsTrip2=9037; // number of wheel rotations for the second trip
double wheelDiameter=27.0; // the diamater of the bike wheel
double PI=3.14159; // the first six digits of pi used for finding circumfrence of the bike wheel
int feetPerMile=5280; // the number of feet in a mile
int inchesPerFoot=12; // the number of inches in a foot
int secondsPerMinute=60; // the number of seconds in a minute
// the variables above are used to find the number of roatations, the time taken, and the distance traveled in miles for each trip
double distanceTrip1, distanceTrip2, totaldistance; // the distance of the first and second trip as well as the total distance
System.out.println("trip one took "+ secsTrip1/secondsPerMinute + " minutes and had " + countsTrip1 + " counts.");
System.out.println("trip two took "+ secsTrip2/secondsPerMinute + " minutes and had " + countsTrip2 + " counts.");
distanceTrip1 = countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile; // multiplying the number of wheel rotations by wheel circumfrence and dividing by inches to get miles
distanceTrip2 = countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; // multiplying the number of wheel rotations by wheel circumfrence and dividing by inches to get miles
totaldistance= distanceTrip1 + distanceTrip2; // adding the distance of Trip 1 and Trip 2 together
System.out.println("Trip 1 was " +distanceTrip1+ " miles");
System.out.println("Trip 2 was " +distanceTrip2+ " miles");
System.out.println("The total distance was " +totaldistance+ " miles");
}
}