1.Which of the following are valid black box test case design techniques?



Equivalence partition

Boundary Value Analysis

Decision tables





2.An online shop for selling mozzarella uses a simple form that accepts weight in kilograms and returns the following status and message:



WEIGHT

STATUS

MESSAGE

-1

INVALID

Cannot be negative



WEIGHT

STATUS

MESSAGE

0

INVALID

Cannot be zero



WEIGHT

STATUS

MESSAGE

100

VALID

Ordered



WEIGHT

STATUS

MESSAGE

101

INVALID

Call by phone



3.The workflow of a bug-tracking system is defined by the following rules:



Test case 1

ACTION

NEXT STATE

SUBMIT

SUBMITTED

ASSIGN

ASSIGNED

RESOLVE

RESOLVED

REASSIGN

ASSIGNED

RESOLVE

RESOLVED

RESUBMIT

SUBMITTED

RESOLVE

RESOLVED

CLOSE

CLOSED

Test case 2

ACTION

NEXT STATE

SUBMIT

SUBMITTED

POSTPONE

POSTPONED

ASSIGN

ASSIGNED



4.Which of the following is true for unit testing?

For some software development processes, unit tests are written before the solution itself is written.

Unit tests are a type of white box testing.



5.Given the following data definition, write a query that returns names of employees who have no sales.



SELECT name FROM employees WHERE id NOT IN (SELECT employeeId FROM sales);



6.Today is the last day of your agile team’s 3-week sprint;..



Retest delivered bug fixes, since those bugs were found in the critical features of the solution. [1 hour]
Prepare and deliver the test report. [1 hour]
Write and execute some more test cases for the bonus scheme, to make sure that this important feature has adequate test coverage. [2 hours]


7.Implement the validate function, which accepts a username and returns true if it's acceptable and false if it's not.



public class Username {

    public static boolean validate(String username) {

        int username_length = username.length();

        boolean result = true;

        boolean hitUnderscore = false;

        if (username_length < 4)

            result = false;

        else if (!(Character.isLetter(username.charAt(0))))

            result = false ;

        else if(username.charAt(username_length-1) == '_')

            result = false;

        else

        {

            for(int i=0; i<username_length; i++)

            {

                if((!(Character.isLetter(username.charAt(i)))) && (!(Character.isDigit(username.charAt(i)))) && (username.charAt(i) != '_'))

                {

                    result = false;

                    break;

                }

                if(username.charAt(i) == '_')

                {

                    if (hitUnderscore == false)

                        hitUnderscore = true;

                    else

                    {

                        result = false;

                        break;

                    }

                        

                }

            }

        }

        return result;

        //(!(Character.isLetter(username.charAt(i))))throw new UnsupportedOperationException("Waiting to be implemented.");

    }

    

    public static void main(String[] args) {

        System.out.println(validate("Mike_Standish")); // Valid username

        System.out.println(validate("Mike Standish")); // Invalid username

    }

}







8.Create a new package-private class, named Storm, and move all code duplicated in the classes RainStorm and SnowStorm to Storm:



class Storm {

    protected double eyeRadius;

    protected double eyePositionX;

    protected double eyePositionY;



    public Storm(double eyeRadius, double eyePositionX, double eyePositionY) {

        this.eyeRadius = eyeRadius;

        this.eyePositionX = eyePositionX;

        this.eyePositionY = eyePositionY;

    }



    public boolean isInEyeOfTheStorm(double positionX, double positionY) {

        double distance = Math.sqrt(Math.pow(positionX - eyePositionX, 2) +

                Math.pow(positionY - eyePositionY, 2));

        return distance < eyeRadius;

    }



    public double getEyeRadius() {

        return eyeRadius;

    }



    public double getEyePositionX() {

        return eyePositionX;

    }



    public double getEyePositionY() {

        return eyePositionY;

    }

}





class RainStorm extends Storm{

    

    public RainStorm(double eyeRadius, double eyePositionX, double eyePositionY) {

        super(eyeRadius, eyePositionX, eyeRadius);

    }

    public double amountOfRain() {

        return eyeRadius * 20;

    }

}



class SnowStorm extends Storm{

    private double amountOfSnow;

    

    public SnowStorm(double eyeRadius, double eyePositionX, double eyePositionY, double amountOfSnow) {

        super(eyeRadius, eyePositionX, eyePositionY);

        this.amountOfSnow = amountOfSnow;

    }

	public double getAmountOfSnow() {

		return amountOfSnow;

	}

    

}







9.Select the correct answers about continuous integration:



In addition to the production environment, it is acceptable to have a long-lasting development branch which works on the clone of the production environment, that would not be merged every day.



It is acceptable to have short-lived bug fix branches that are merged with the master branch every day.



Using test-driven development supports good CI process.





10.Which of the following statements are true for merging feature and master branches?



Each developer can have their own local branches and commit changes to them. These branches are not visible to other developers until the developer publishes the changes.



Before merging, we can sync changes from the master branch to the feature branch.



A push command can fail if the master branch was modified in the meantime.





11.Select true statements for user acceptance testing.



Who should perform user acceptance testing?

Customers



When should user acceptance testing be performed?

After all features have been implemented and otherwise tested.



How should user acceptance testing be performed?

Using real life scenarios.





12.What are the different ways to select a menu item that uses the <Select> tag



selectByValue()

selectByVisibleText()

selectByIndex()



13.Look at the code snippet  below . What does it try to accomplish given that driver is a webdriver and element is a weblement



The element in question receives a  right click



14.What are some of the flavours of Acceptance Test Driven Development (ATDD) methodologies?

Story test driven development
behaviour driven development
specification by example


15.What are the valid methods for a driver of type  Selenium webdriver ?



driver.navigate.refresh()

driver.navigate().to("URL")

driver.navigate().forward()



16.A program with high cyclomatic complexity is almost likely to be



difficult to test



17.When should software testing activities  start?



As soon as possible in the development life cycle


