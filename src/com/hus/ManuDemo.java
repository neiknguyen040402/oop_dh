package com.hus;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.hus.homework1.*;
import com.hus.homework2.*;
import com.hus.homework3.theaccount.TestAccount;
import com.hus.homework3.theauthorbook.TestAuthor;
import com.hus.homework3.theauthorbookyourturn.TestBook;
import com.hus.homework3.theball.TestBall;
import com.hus.homework3.thecircle.TestCircle;
import com.hus.homework3.thecustomeraccount.TestMainCustomerAccount;
import com.hus.homework3.thecustomerinvoice.TestMainCustomerInvoice;
import com.hus.homework3.thedate.TestDate;
import com.hus.homework3.theemployee.TestEmployee;
import com.hus.homework3.theinvoiceitem.TestInvoiceitem;
import com.hus.homework3.themycirclemypoint.TestMainCirclePoint;
import com.hus.homework3.themylineandmypoint.TestMainLinePoint;
import com.hus.homework3.themypoint.TestMainMyPoint;
import com.hus.homework3.themyrectanglemypoint.TestMainRectanglePoint;
import com.hus.homework3.themytriangleandmypoint.TestMainTrianglePoint;
import com.hus.homework3.therectangle.TestRectangle;
import com.hus.homework3.thetime.TestTime;
import com.hus.homework4.TestBigInteger;
import com.hus.homework4.bouncingballs.TestBouncingBall;
import com.hus.homework4.bouncingballs.TestContainer;
import com.hus.homework4.soccergame.TestGame;
import com.hus.homework4.themycomplex.MyComplexApp;
import com.hus.homework4.themydate.TestMyDate;
import com.hus.homework4.themypolynomial.TestMyPolynomial;
import com.hus.homework4.themytime.TestMyTime;
import com.hus.homework5.animals.TestAnimalThemeSubclass;
import com.hus.homework5.circleandcylinder.TestCylinder;
import com.hus.homework5.circleandcylinder.TestCylinderComposed;
import com.hus.homework5.personandits.TestPerson;
import com.hus.homework5.point2dand3d.Test2DAnd3D;
import com.hus.homework5.pointandline.TestLineSub;
import com.hus.homework5.pointandline.TestPoint;
import com.hus.homework5.shape.SimpleTestShape;
import com.hus.homework6.animal.TestAnimalVer1;
import com.hus.homework6.animal_ver2.TestAnimalVer2;
import com.hus.homework6.geometric.TestGeometric;
import com.hus.homework6.movable.TestMovableVer1;
import com.hus.homework6.movable_ver2.TestMovableVer2;
import com.hus.homework6.movable_ver3.TestMovableVer3;
import com.hus.homework6.resizable_geometric.TestResizableCircle;
import com.hus.homework6.shape_abstract.TestShape;
import com.hus.lab1.*;
import com.hus.lab2.*;
import com.hus.lab6.discount.TestDiscountSystem;
import com.hus.lab6.polyline_of_points.TestPolyLine;

public class ManuDemo {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            printManu();
            try {
                System.out.print("Choose your choice: ");
                int choice = in.nextInt();
                switch (choice) {
                    case 1:
                        selectLab1(args);
                        break;
                    case 2:
                        selectLab2(args);
                        break;
                    case 3:
                        selectLab6(args);
                        break;
                    case 4:
                        selectHomework1(args);
                        break;
                    case 5:
                        selectHomework2(args);
                        break;
                    case 6:
                        selectHomework3(args);
                        break;
                    case 7:
                        selectHomework4(args);
                        break;
                    case 8:
                        selectHomework5(args);
                        break;
                    case 9:
                        selectHomework6(args);
                        break;
                    case 10:
                        exit = true;
                        break;
                    default:
                        System.out.println("Select not valid!!!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("You must insert a number!!");
                in.next();
            }
        }

    }

    public static void printManu() {
        System.out.println("============================");
        System.out.println("| MAIN MANU SELECTION DEMO |");
        System.out.println("|--------------------------|");
        System.out.println("| 1.lab1                   |");
        System.out.println("| 2.lab2                   |");
        System.out.println("| 3.lab6                   |");
        System.out.println("| 4.homework1              |");
        System.out.println("| 5.homework2              |");
        System.out.println("| 6.homework3              |");
        System.out.println("| 7.homework4              |");
        System.out.println("| 8.homework5              |");
        System.out.println("| 9.homework6              |");
        System.out.println("|10.exit                   |");
        System.out.println("============================");

    }

    public static void printManuLab1() {
        System.out.println("================================================");
        System.out.println("|              MANU SELECTION                  |");
        System.out.println("|----------------------------------------------|");
        System.out.println("| 1. CheckPassFail                             |");
        System.out.println("| 2. CheckOddEven                              |");
        System.out.println("| 3. PrintNumberInWord                         |");
        System.out.println("| 4. PrintDayInWord                            |");
        System.out.println("| 5. SumAverageRunningInt                      |");
        System.out.println("| 6. HarmonicSum                               |");
        System.out.println("| 7. ComputePI                                 |");
        System.out.println("| 8. Fibonacci                                 |");
        System.out.println("| 9. ExtractDigits                             |");
        System.out.println("|10. SumProductMinMax3                         |");
        System.out.println("|11. SumProductMinMax5                         |");
        System.out.println("|12. CircleComputation                         |");
        System.out.println("|13. SphereComputation                         |");
        System.out.println("|14. CylinderComputation                       |");
        System.out.println("|15. PensionContributionCalculator             |");
        System.out.println("|16. PensionContributionCalculatorWithSentinel |");
        System.out.println("|17. ReverseInt                                |");
        System.out.println("|18. InputValidation                           |");
        System.out.println("|19. AverageWithInputValidation                |");
        System.out.println("|20. Back to main menu                         |");
        System.out.println("===============================================");
    }

    public static void printManuLab2() {
        System.out.println("================================================");
        System.out.println("|              MANU SELECTION                  |");
        System.out.println("|----------------------------------------------|");
        System.out.println("| 1. PrintArray                                |");
        System.out.println("| 2. PrintArrayInStars                         |");
        System.out.println("| 3. GradesStatistics                          |");
        System.out.println("| 4. Hex2Bin                                   |");
        System.out.println("| 5. Dec2Hex                                   |");
        System.out.println("| 6. Exponent                                  |");
        System.out.println("| 7. hasEight()                                |");
        System.out.println("| 8. Print                                     |");
        System.out.println("| 9. ArrayToString                             |");
        System.out.println("|10. ExercisesContains                         |");
        System.out.println("|11. ExercisesSearch                           |");
        System.out.println("|12. ExercisesEquals                           |");
        System.out.println("|13. ExercisesCopyOf                           |");
        System.out.println("|14. SwappingTwoArrays                         |");
        System.out.println("|15. ExercisesReverse                          |");
        System.out.println("|16. GradesStatisticsUpdate                    |");
        System.out.println("|17. Back to main menu                         |");
        System.out.println("================================================");

    }

    public static void printManuLab6() {
        System.out.println("================================================");
        System.out.println("|              MANU SELECTION                  |");
        System.out.println("|----------------------------------------------|");
        System.out.println("| 1. The Discount System                       |");
        System.out.println("| 2. Polyline of Points with ArrayList         |");
        System.out.println("| 3. Back to main menu                         |");
        System.out.println("================================================");
    }

    public static void printManuHomework1() {
        System.out.println("================================================");
        System.out.println("|              MANU SELECTION                  |");
        System.out.println("|----------------------------------------------|");
        System.out.println("| 1. SquarePattern                             |");
        System.out.println("| 2. CheckerPattern                            |");
        System.out.println("| 3. TimeTable                                 |");
        System.out.println("| 4. TriangularPattern                         |");
        System.out.println("| 5. BoxPattern                                |");
        System.out.println("| 6. HillPattern                               |");
        System.out.println("| 7. Factorial                                 |");
        System.out.println("| 8. ReverseString                             |");
        System.out.println("| 9. CountVowelsDigits                         |");
        System.out.println("|10. PhoneKeyPad                               |");
        System.out.println("|11. CaesarCode                                |");
        System.out.println("|12. DecipherCaesarCode                        |");
        System.out.println("|13. ExchangeCipher                            |");
        System.out.println("|14. TestPalindromicWord                       |");
        System.out.println("|15. TestPalindromicPhrase                     |");
        System.out.println("|16. CheckHexStr                               |");
        System.out.println("|17. Bin2Dec                                   |");
        System.out.println("|18. Hex2Dec                                   |");
        System.out.println("|19. Oct2Dec                                   |");
        System.out.println("|20. RadixN2Dec                                |");
        System.out.println("|21. Back to main menu                         |");
        System.out.println("================================================");
    }

    public static void printManuHomework2() {
        System.out.println("================================================");
        System.out.println("|              MANU SELECTION                  |");
        System.out.println("|----------------------------------------------|");
        System.out.println("| 1. Matrices                                  |");
        System.out.println("| 2. TrigonometricSeries.                      |");
        System.out.println("| 3. SpecialSeries                             |");
        System.out.println("| 4. FactorialInt (Handling Overflow)          |");
        System.out.println("| 5. FibonacciInt (Handling Overflow)          |");
        System.out.println("| 6. NumberConversion                          |");
        System.out.println("| 7. NumberGuess                               |");
        System.out.println("| 8. WordGuess                                 |");
        System.out.println("| 9. DateUtil                                  |");
        System.out.println("|10. Factorial Recusive                        |");
        System.out.println("|11. Fibonacci (Recursive)                     |");
        System.out.println("|12. Length of a Running Number Sequence       |");
        System.out.println("|13. GCD (Recursive)                           |");
        System.out.println("|14. Linear Search                             |");
        System.out.println("|15. Recursive Binary Search                   |");
        System.out.println("|16. Bubble Sort                               |");
        System.out.println("|17. Selection Sort                            |");
        System.out.println("|18. Insertion Sort                            |");
        System.out.println("|19. Perfect and Deficient Numbers             |");
        System.out.println("|20. Prime Numbers                             |");
        System.out.println("|21. Prime Factors                             |");
        System.out.println("|22. Greatest Common Divisor                   |");
        System.out.println("|23. Back to main menu                         |");
        System.out.println("================================================");
    }

    public static void printManuHomework3() {
        System.out.println("================================================");
        System.out.println("|              MANU SELECTION                  |");
        System.out.println("|----------------------------------------------|");
        System.out.println("| 1. The Circle Class                          |");
        System.out.println("| 2. The Rectangle Class                       |");
        System.out.println("| 3. The Employee Class                        |");
        System.out.println("| 4. The InvoiceItem Class                     |");
        System.out.println("| 5. The Account Class                         |");
        System.out.println("| 6. The Date Class                            |");
        System.out.println("| 7. The Time Class                            |");
        System.out.println("| 8. The Ball Class                            |");
        System.out.println("| 9. The Author and Book classes               |");
        System.out.println("|10. The Author and Book Classes - Your Turn   |");
        System.out.println("|11. The Customer and Invoice classes          |");
        System.out.println("|12. The Customer and Account classes          |");
        System.out.println("|13. The MyPoint Class                         |");
        System.out.println("|14. The MyLine and MyPoint Classes            |");
        System.out.println("|15. The MyCircle and MyPoint Classes          |");
        System.out.println("|16. The MyTriangle and MyPoint Classes        |");
        System.out.println("|17. The MyRectangle and MyPoint Classes       |");
        System.out.println("|18. Back to main menu                         |");
        System.out.println("================================================");
    }

    public static void printManuHomework4() {
        System.out.println("================================================");
        System.out.println("|              MANU SELECTION                  |");
        System.out.println("|----------------------------------------------|");
        System.out.println("| 1. The MyComplex class                       |");
        System.out.println("| 2. The MyPolynomial Class                    |");
        System.out.println("| 3. Using JDK’s BigInteger Class              |");
        System.out.println("| 4. The MyTime Class                          |");
        System.out.println("| 5. The MyDate Class                          |");
        System.out.println("| 6. Bouncing Balls-Ball and Container Classes |");
        System.out.println("| 7. The Ball and Player Classes               |");
        System.out.println("| 8. Back to main menu                         |");
        System.out.println("================================================");

    }

    public static void printManuHomework5() {
        System.out.println("=======================================================");
        System.out.println("|              MANU SELECTION                         |");
        System.out.println("|-----------------------------------------------------|");
        System.out.println("| 1. The Circle and Cylinder Classes                  |");
        System.out.println("| 2. Superclass Person and its subclasses             |");
        System.out.println("| 3. Point2D and Point3D                              |");
        System.out.println("| 4. Superclass Shape                                 |");
        System.out.println("| 5. Superclass Animal and its subclasses             |");
        System.out.println("| 6. The Point and Line Classes                       |");
        System.out.println("| 7. The Circle and Cylinder Classes Using Composition|");
        System.out.println("| 8. Back to main menu                                |");
        System.out.println("=======================================================");

    }

    public static void printManuHomework6() {
        System.out.println("==================================================================");
        System.out.println("|                         MANU SELECTION                         |");
        System.out.println("|----------------------------------------------------------------|");
        System.out.println("| 1. Abstract Superclass Shape and Its Concrete Subclasses       |");
        System.out.println("| 2. GeometricObject Interface and its Implementation            |");
        System.out.println("| 3. Movable Interface and its Implementation                    |");
        System.out.println("| 4. Movable Interface and its Implementation                    |");
        System.out.println("| 5. Interfaces Resizable and GeometricObject                    |");
        System.out.println("| 6. Abstract Superclass Animal and its Implementation Subclasses|");
        System.out.println("| 7. Another View of Abstract Superclass Animal and its          |");
        System.out.println("|     Implementation Subclasses                                  |");
        System.out.println("| 8. Interface Movable and its implementation subclasses         |");
        System.out.println("|     MovablePoint and MovableCircle                             |");
        System.out.println("| 9. Back to main menu                                           |");
        System.out.println("==================================================================");

    }

    public static void selectLab1(String[] args) {
        boolean exitPackage = false;
        while (!exitPackage) {
            printManuLab1();
            System.out.print("Choose your choice: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1.1 CheckPassFail");
                    CheckPassFail.main(args);
                    break;
                case 2:
                    System.out.println("1.2 CheckOddEven");
                    CheckOddEven.main(args);
                    break;
                case 3:
                    System.out.println("1.3 PrintNumberInWord");
                    PrintNumberInWord.main(args);
                    break;
                case 4:
                    System.out.println("1.4 PrintDayInWord");
                    PrintDayInWord.main(args);
                    break;
                case 5:
                    System.out.println("2.1 SumAverageRunningInt");
                    SumAverageRunningInt.main(args);
                    break;
                case 6:
                    System.out.println("2.2 HarmonicSum");
                    HarmonicSum.main(args);
                    break;
                case 7:
                    System.out.println("2.3 ComputePI");
                    ComputePI.main(args);
                    break;
                case 8:
                    System.out.println("2.4 Fibonacci");
                    Fibonacci.main(args);
                    break;
                case 9:
                    System.out.println("2.5 ExtractDigits");
                    ExtractDigits.main(args);
                    break;
                case 10:
                    System.out.println("3.1.1 SumProductMinMax3");
                    SumProductMinMax3.main(args);
                    break;
                case 11:
                    System.out.println("3.1.2 SumProductMinMax5");
                    SumProductMinMax5.main(args);
                    break;
                case 12:
                    System.out.println("3.2.1 CircleComputation");
                    CircleComputation.main(args);
                    break;
                case 13:
                    System.out.println("3.2.2 SphereComputation");
                    SphereComputation.main(args);
                    break;
                case 14:
                    System.out.println("3.2.3 CylinderComputation");
                    CylinderComputation.main(args);
                    break;
                case 15:
                    System.out.println("3.3 PensionContributionCalculator");
                    PensionContributionCalculator.main(args);
                    break;
                case 16:
                    System.out.println("3.4 PensionContributionCalculatorWithSentinel");
                    PensionContributionCalculatorWithSentinel.main(args);
                    break;
                case 17:
                    System.out.println("3.5 ReverseInt");
                    ReverseInt.main(args);
                    break;
                case 18:
                    System.out.println("3.6 InputValidation");
                    InputValidation.main(args);
                    break;
                case 19:
                    System.out.println("3.7 AverageWithInputValidation");
                    AverageWithInputValidation.main(args);
                    break;
                case 20:
                    exitPackage = true;
                    break;
                default:
                    System.out.println("select not valid");
                    break;
            }
        }
    }

    public static void selectLab2(String[] args) {
        boolean exitPackage = false;
        while (!exitPackage) {
            printManuLab2();
            System.out.print("Choose your choice: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1.1 PrintArray");
                    PrintArray.main(args);
                    break;
                case 2:
                    System.out.println("1.2 PrintArrayInStars");
                    PrintArrayInStars.main(args);
                    break;
                case 3:
                    System.out.println("1.3 GradesStatistics");
                    GradesStatistics.main(args);
                    break;
                case 4:
                    System.out.println("1.4 Hex2Bin");
                    Hex2Bin.main(args);
                    break;
                case 5:
                    System.out.println("1.5 Dec2Hex");
                    Dec2Hex.main(args);
                    break;
                case 6:
                    System.out.println("2.1 exponent()");
                    Exponent.main(args);
                    break;
                case 7:
                    System.out.println("2.2 hasEight()");
                    MagicSum.main(args);
                    break;
                case 8:
                    System.out.println("2.3 print()");
                    Print.main(args);
                    break;
                case 9:
                    System.out.println("2.4 arrayToString()");
                    ArrayToString.main(args);
                    break;
                case 10:
                    System.out.println("2.5 contains()");
                    ExercisesContainsSearch.main(args);
                    break;
                case 11:
                    System.out.println("2.6 search()");
                    ExercisesContainsSearch.main(args);
                    break;
                case 12:
                    System.out.println("2.7 equals()");
                    ExercisesEquals.main(args);
                    break;
                case 13:
                    System.out.println("2.8 copyOf()");
                    ExercisesCopyOf.main(args);
                    break;
                case 14:
                    System.out.println("2.9 swap()");
                    SwappingTwoArrays.main(args);
                    break;
                case 15:
                    System.out.println("2.10 reverse()");
                    ExercisesReverse.main(args);
                    break;
                case 16:
                    System.out.println("2.11 GradesStatistics");
                    GradesStatisticsUpdate.main(args);
                    break;
                case 17:
                    exitPackage = true;
                    break;
                default:
                    System.out.println("select not valid");
                    break;
            }
        }
    }

    public static void selectLab6(String[] args) {
        boolean exitPackage = false;
        while (!exitPackage) {
            printManuLab6();
            System.out.print("Choose your choice: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. The Discount System");
                    TestDiscountSystem.main(args);
                    break;
                case 2:
                    System.out.println("2. Polyline of Points with ArrayList");
                    TestPolyLine.main(args);
                    break;
                case 3:
                    exitPackage = true;
                    break;
                default:
                    System.out.println("select not valid");
                    break;
            }
        }
    }

    public static void selectHomework1(String[] args) {
        boolean exitPackage = false;
        while (!exitPackage) {
            printManuHomework1();
            System.out.print("Choose your choice: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1.1 SquarePattern");
                    SquarePattern.main(args);
                    break;
                case 2:
                    System.out.println("1.2 CheckerPattern");
                    CheckerPattern.main(args);
                    break;
                case 3:
                    System.out.println("1.3 TimeTable");
                    TimeTable.main(args);
                    break;
                case 4:
                    System.out.println("1.4 TriangularPattern");
                    TriangularPattern.main(args);
                    break;
                case 5:
                    System.out.println("1.5 BoxPattern");
                    BoxPattern.main(args);
                    break;
                case 6:
                    System.out.println("1.6 HillPattern");
                    HillPattern.main(args);
                    break;
                case 7:
                    System.out.println("2.1 Factorial");
                    Factorial.main(args);
                    break;
                case 8:
                    System.out.println("3.1 ReverseString");
                    ReverseString.main(args);
                    break;
                case 9:
                    System.out.println("3.2 CountVowelsDigits");
                    CountVowelsDigits.main(args);
                    break;
                case 10:
                    System.out.println("3.3 PhoneKeyPad");
                    PhoneKeyPad.main(args);
                    break;
                case 11:
                    System.out.println("3.4 CaesarCode");
                    CaesarCode.main(args);
                    break;
                case 12:
                    System.out.println("3.5 DecipherCaesarCode");
                    DecipherCaesarCode.main(args);
                    break;
                case 13:
                    System.out.println("3.6 ExchangeCipher");
                    ExchangeCipher.main(args);
                    break;
                case 14:
                    System.out.println("3.7.1 TestPalindromicWord");
                    TestPalindromic.main(args);
                    break;
                case 15:
                    System.out.println("3.7.2 TestPalindromicPhrase");
                    TestPalindromicPhrase.main(args);
                    break;
                case 16:
                    System.out.println("3.8 CheckHexStr");
                    CheckHexStr.main(args);
                    break;
                case 17:
                    System.out.println("3.9 Bin2Dec");
                    Bin2Dec.main(args);
                    break;
                case 18:
                    System.out.println("3.10 Hex2Dec");
                    Hex2Dec.main(args);
                    break;
                case 19:
                    System.out.println("3.11 Oct2Dec");
                    Oct2Dec.main(args);
                    break;
                case 20:
                    System.out.println("3.12 RadixN2Dec");
                    RadixN2Dec.main(args);
                    break;
                case 21:
                    exitPackage = true;
                    break;
                default:
                    System.out.println("select not valid");
                    break;
            }
        }
    }

    public static void selectHomework2(String[] args) {
        boolean exitPackage = false;
        while (!exitPackage) {
            printManuHomework2();
            System.out.print("Choose your choice: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1.1 Matrices (2D Arrays)");
                    Matrix.main(args);
                    break;
                case 2:
                    System.out.println("1.2 Trigonometric Series");
                    TrigonometricSeries.main(args);
                    break;
                case 3:
                    System.out.println("1.3 Exponential Series");
                    SpecialSeries.main(args);
                    break;
                case 4:
                    System.out.println("1.4 FactorialInt (Handling Overflow)");
                    FactorialInt.main(args);
                    break;
                case 5:
                    System.out.println("1.5 FibonacciInt (Handling Overflow)");
                    FibonacciInt.main(args);
                    break;
                case 6:
                    System.out.println("1.6 Number System Conversion");
                    NumberConversion.main(args);
                    break;
                case 7:
                    System.out.println("1.7 NumberGuess");
                    NumberGuess.main(args);
                    break;
                case 8:
                    System.out.println("1.8 WordGuess");
                    WordGuess.main(args);
                    break;
                case 9:
                    System.out.println("1.9 DateUtil");
                    DateUtil.main(args);
                    break;
                case 10:
                    System.out.println("2.1 Factorial Recusive");
                    FactorialFibonacciRecusive.main(args);
                    break;
                case 11:
                    System.out.println("2.2 Fibonacci (Recursive)");
                    FactorialFibonacciRecusive.main(args);
                    break;
                case 12:
                    System.out.println("2.3 Length of a Running Number Sequence (Recursive)");
                    LengthOfNumberSequence.main(args);
                    break;
                case 13:
                    System.out.println("2.4 GCD (Recursive)");
                    GCDExample.main(args);
                    break;
                case 14:
                    System.out.println("3.1 Linear Search");
                    LinearSearchExercise.main(args);
                    break;
                case 15:
                    System.out.println("3.2 Recursive Binary Search");
                    BinarySearchExercise.main(args);
                    break;
                case 16:
                    System.out.println("3.3 Bubble Sort");
                    Sort.main(args);
                    break;
                case 17:
                    System.out.println("3.4 Selection Sort");
                    Sort.main(args);
                    break;
                case 18:
                    System.out.println("3.5 Insertion Sort");
                    Sort.main(args);
                    break;
                case 19:
                    System.out.println("4.1 Perfect and Deficient Numbers");
                    PerfectNumberList.main(args);
                    break;
                case 20:
                    System.out.println("4.2 Prime Numbers");
                    PrimeList.main(args);
                    break;
                case 21:
                    System.out.println("4.3 Prime Factors");
                    PerfectPrimeFactorList.main(args);
                    break;
                case 22:
                    System.out.println("4.4 Greatest Common Divisor (GCD)");
                    GreatestCommonDivisor.main(args);
                    break;
                case 23:
                    exitPackage = true;
                    break;
                default:
                    System.out.println("select not valid");
                    break;
            }
        }
    }

    public static void selectHomework3(String[] args) {
        boolean exitPackage = false;
        while (!exitPackage) {
            printManuHomework3();
            System.out.print("Choose your choice: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1.1 The Circle Class");
                    TestCircle.main(args);
                    break;
                case 2:
                    System.out.println("1.3 The Rectangle Class");
                    TestRectangle.main(args);
                    break;
                case 3:
                    System.out.println("1.4 The Employee Class");
                    TestEmployee.main(args);
                    break;
                case 4:
                    System.out.println("1.5 The InvoiceItem Class");
                    TestInvoiceitem.main(args);
                    break;
                case 5:
                    System.out.println("1.6 The Account Class");
                    TestAccount.main(args);
                    break;
                case 6:
                    System.out.println("1.7 The Date Class");
                    TestDate.main(args);
                    break;
                case 7:
                    System.out.println("1.8 The Time Class");
                    TestTime.main(args);
                    break;
                case 8:
                    System.out.println("1.9 The Ball Class");
                    TestBall.main(args);
                    break;
                case 9:
                    System.out.println("2.1 The Author and Book classes");
                    TestAuthor.main(args);
                    break;
                case 10:
                    System.out.println("2.3 The Author and Book Classes - Your Turn");
                    TestBook.main(args);
                    break;
                case 11:
                    System.out.println("2.4 The Customer and Invoice classes");
                    TestMainCustomerInvoice.main(args);
                    break;
                case 12:
                    System.out.println("2.5 The Customer and Account classes");
                    TestMainCustomerAccount.main(args);
                    break;
                case 13:
                    System.out.println("2.6 The MyPoint Class");
                    TestMainMyPoint.main(args);
                    break;
                case 14:
                    System.out.println("2.7 The MyLine and MyPoint Classes");
                    TestMainLinePoint.main(args);
                    break;
                case 15:
                    System.out.println("2.8 The MyCircle and MyPoint Classes");
                    TestMainCirclePoint.main(args);
                    break;
                case 16:
                    System.out.println("2.9 The MyTriangle and MyPoint Classes");
                    TestMainTrianglePoint.main(args);
                    break;
                case 17:
                    System.out.println("2.10 The MyRectangle and MyPoint Classes");
                    TestMainRectanglePoint.main(args);
                    break;
                case 18:
                    exitPackage = true;
                    break;
                default:
                    System.out.println("select not valid");
                    break;
            }
        }
    }

    public static void selectHomework4(String[] args) {
        boolean exitPackage = false;
        while (!exitPackage) {
            printManuHomework4();
            System.out.print("Choose your choice: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1.1 The MyComplex class");
                    MyComplexApp.main(args);
                    break;
                case 2:
                    System.out.println("1.2 The MyPolynomial Class");
                    TestMyPolynomial.main(args);
                    break;
                case 3:
                    System.out.println("1.3 Using JDK’s BigInteger Class");
                    TestBigInteger.main(args);
                    break;
                case 4:
                    System.out.println("1.4 The MyTime Class");
                    TestMyTime.main(args);
                    break;
                case 5:
                    System.out.println("1.5 The MyDate Class");
                    TestMyDate.main(args);
                    break;
                case 6:
                    System.out.println("1.6 Bouncing Balls - Ball and Container Classes");
                    System.out.println("There are 2 options for you: 1.TestBall   2.TestContainer.  What are your options?");
                    int choiceCase6 = in.nextInt();
                    switch (choiceCase6) {
                        case 1:
                            TestBouncingBall.main(args);
                            break;
                        case 2:
                            TestContainer.main(args);
                            break;
                        default:
                            System.out.println("select not valid");
                            break;
                    }
                    break;
                case 7:
                    System.out.println("1.7 The Ball and Player Classes");
                    TestGame.main(args);
                    break;
                case 8:
                    exitPackage = true;
                    break;
                default:
                    System.out.println("select not valid");
                    break;
            }
        }
    }

    public static void selectHomework5(String[] args) {
        boolean exitPackage = false;
        while (!exitPackage) {
            printManuHomework5();
            System.out.print("Choose your choice: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1.1 The Circle and Cylinder Classes");
                    TestCylinder.main(args);
                    break;
                case 2:
                    System.out.println("1.2 Superclass Person and its subclasses");
                    TestPerson.main(args);
                    break;
                case 3:
                    System.out.println("1.3 Point2D and Point3D");
                    Test2DAnd3D.main(args);
                    break;
                case 4:
                    System.out.println("1.4 Superclass Shape and its subclasses");
                    SimpleTestShape.main(args);
                    break;
                case 5:
                    System.out.println("1.5 Superclass Animal and its subclasses");
                    TestAnimalThemeSubclass.main(args);
                    break;
                case 6:
                    System.out.println("2.1 The Point and Line Classes");
                    System.out.println("There are 2 options for you: 1.TestLineSub   2.TestPoint.  What are your options?");
                    System.out.print("My options: ");
                    int choiceCase6 = in.nextInt();
                    switch (choiceCase6) {
                        case 1:
                            TestLineSub.main(args);
                            break;
                        case 2:
                            TestPoint.main(args);
                            break;
                        default:
                            System.out.println("select not valid");
                            break;
                    }
                    break;
                case 7:
                    System.out.println("2.2 The Circle and Cylinder Classes Using Composition");
                    TestCylinderComposed.main(args);
                    break;
                case 8:
                    exitPackage = true;
                    break;
                default:
                    System.out.println("select not valid");
                    break;
            }
        }
    }

    public static void selectHomework6(String[] args) {
        boolean exitPackage = false;
        while (!exitPackage) {
            printManuHomework6();
            System.out.print("Choose your choice: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1.1 Abstract Superclass Shape and Its Concrete Subclasses");
                    TestShape.main(args);
                    break;
                case 2:
                    System.out.println("1.2 GeometricObject Interface and its Implementation");
                    TestGeometric.main(args);
                    break;
                case 3:
                    System.out.println("1.3 Movable Interface and its Implementation");
                    TestMovableVer1.main(args);
                    break;
                case 4:
                    System.out.println("1.4 Movable Interface and its Implementation" +
                            " Classes MovablePoint and MovableCircle");
                    TestMovableVer2.main(args);
                    break;
                case 5:
                    System.out.println("1.5 Interfaces Resizable and GeometricObject");
                    TestResizableCircle.main(args);
                    break;
                case 6:
                    System.out.println("1.6 Abstract Superclass Animal and its Implementation Subclasses");
                    TestAnimalVer1.main(args);
                    break;
                case 7:
                    System.out.println("1.7 Another View of Abstract Superclass Animal and its" +
                            " Implementation Subclasses");
                    TestAnimalVer2.main(args);
                    break;
                case 8:
                    System.out.println("1.8 Interface Movable and its implementation subclasses " +
                            "MovablePoint and MovableCircle");
                    TestMovableVer3.main(args);
                    break;
                case 9:
                    exitPackage = true;
                    break;
                default:
                    System.out.println("select not valid");
                    break;
            }
        }
    }
}

