// primitive data types
// range from -128 to 127; uses 1 byte in memory
byte userAge = 20;

// range from -32768 to 32767; uses 2 bytes in memory
short numberOfStudents = 45;

// range from 2^31 to 2^31 - 1; uses 4 bytes in memory
int numberOfEmployees = 500;

// range from -2^63 to 2^63 - 1; uses 8 bytes in memory; rarely used
long numberOfInhabitants = 21021313012678L;

// from -3.4... x 10^38 to 3.4... x 10^38; uses 4 bytes; precise to 7 digits
float hourlyRate = 60.5F;

// default when using 'floats'; range from 1.7 x 10^308
// precision of 15 digits; uses 8 bytes in memory
double numberOfHours = 5120.5;

// single unicode with single quotes; uses 2 bytes in memory
char grade = 'A';
boolean promote = true;

// can declare and initialize multiple variables
// with the same data type in one line
byte level = 2, userExperience = 5;

byte year; // declare the variable first
year = 20; // initialize it later

// if both are integers, answer is an integer
// if either is not an int, you get a non int answer
7 / 2 = 3
7.0 / 2 = 3.5

// one is an int, the other is a float, therefore this is true:
7 != 7.0

// assignment operators
x += 2 // same as x = x + 2
x -= 2 // same as x = x - 2
x *= 2 // same as x = x * 2
x++ // same as x = x + 1
x-- // same as x = x - 1

// ++ and -- can be in front of or behind the variable name, e.g.:
// System.out.println(counter++);
// prints the original value of counter, then increments by one
// System.out.println(counter);
// counter = counter + 1;
// ON THE OTHER HAND
// System.out.println(++counter);
// increments the counter and then prints the value
// counter = counter + 1
// System.out.println(counter);
