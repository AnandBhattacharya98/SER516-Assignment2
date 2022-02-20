# SER516-Assignment2
Question 1: Caesar Cipher
Logs from command line for testing

Question 1b - Encryption fails
anandbhattacharya@Anands-MacBook-Air SER516-Assignment2 % javac cipher.java TestJunit.java TestRunner.java
anandbhattacharya@Anands-MacBook-Air SER516-Assignment2 % java TestRunner                                 
Encrypt Shift : 330
testEncrypt(TestJunit): expected:<[zwddgOGJDV]> but was:<[helloWORLD]>
false

Question 1c - Encryption pass
anandbhattacharya@Anands-MacBook-Air SER516-Assignment2 % javac cipher.java TestJunit.java TestRunner.java
anandbhattacharya@Anands-MacBook-Air SER516-Assignment2 % java TestRunner                                 
Encrypt Shift : 330
true

Question 1d - Decryption fails
anandbhattacharya@Anands-MacBook-Air SER516-Assignment2 % javac cipher.java TestJunit.java TestRunner.java
anandbhattacharya@Anands-MacBook-Air SER516-Assignment2 % java TestRunner                                 
Decrypt Shift: 330
testDecrypt(TestJunit): expected:<[helloWORLD]> but was:<[zwddgOGJDV]>
false

Question 1e - Decryption pass
anandbhattacharya@Anands-MacBook-Air SER516-Assignment2 % javac cipher.java TestJunit.java TestRunner.java
anandbhattacharya@Anands-MacBook-Air SER516-Assignment2 % java TestRunner                                 
Decrypt Shift: 330
true