package test;


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

      }

    

    public static void main(String[] args) {

        System.out.println(validate("Mike_Standish")); // Valid username

        System.out.println(validate("Mike Standish")); // Invalid username

    }
    
    

}



