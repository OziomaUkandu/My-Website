import.java.util.Scanner

public class AveragePopulation
{
    public static void main (String []args)
  {
	  Scanner group6 = new Scanner (System.in);
	  //prompt user to enter the first country
	  System.out.println ("Enter name of first country");
      //take input and store into a variable

      //prompt user to enter population for first country
	  System.out.println ("Enter population for first country");
	  //take input and store into a variable
	  String PopFirstCountry = group6.nextLine();

	  //prompt user to enter second country
	  System.out.println ("Enter second country");
	  //take input and store into a variable
	  String secondCountry = group6.nextLine();

	  //prompt user to enter population for second country
	  System.out.println ("Enter population for second country");
	  //take input and store into a variable
	  String PopSecondCountry = group6.nextLine();

	  //prompt user to enter third country
	  System.out.println ("Enter third country");
	  //take input and store into a variable
	  String thirdCountry = group6.nextLine();


	  //prompt user to enter population for third country
	  System.out.println ("Enter population for third country");
	  //take input and store into a variable
	  String PopThirdCountry = group6.nextLine();

	  double PopFirstCountry; //declare
	  double PopSecondCountry; //declare
	  double PopThirdCountry; //declare


	  System.out.println("Total population=" + (PopFirstCountry+PopSecondCountry+PopThirdCountry);
	  System.out.println ("Average population= ") + (total/3);
		%1d

 }
}