//package (folder) containing all classes(.java files)
package AddressBook;

//UserMenu Class File

//libraries used
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
//java libraries utilized
import java.util.Scanner;

//main menu method
public class UserMenu {

    public static void main(String[] args) {
    	
    	//Collection interface of ArrayList Entries
        Collection<Entries> c = new ArrayList<Entries>();

        //Try statement (catch at end)
        try (Scanner s = new Scanner(System.in)) {
        	
            // user menu choice input is integer because user inputs 1-6
            int choice;
            
            // boolean (true or false) used for delete and search entries
            boolean found = false;
            
            //do-while statement
            //Statements within the Do block are ran at least once, always
            
            do {
                System.out.println("1) Add an entry");
                System.out.println("2) Remove an entry"); // delete by email only
                System.out.println("3) Search for a specific entry"); // Search by either 1stname, lastname, phone, or email
                System.out.println("4) Print Address Book");
                System.out.println("5) Delete Entries in Address Book");
                System.out.println("6) Quit");
                System.out.println("Please choose what you'd like to do with the database:");
                
                //scanner (scans for next Int entered by user)
                choice = s.nextInt();

                // spacer
                System.out.println();

                // not needed?
                // Iterator<Entries> i;

                switch (choice) {
                
                    case 1:
                    	
                        // add entries method - DONE EXCEPT for Unique Email Address using Set collections
                    	//method still adds emails that are duplicates
                        System.out.println("Enter first name of entry: ");
                        
                        //Scanner next String entered by user
                        String firstname = s.next();

                        System.out.println("Enter last name of entry: ");
                        String lastname = s.next();

                        System.out.println("Enter phone number of entry: ");
                        String phonenumber = s.next();

                        System.out.println("Enter email address of entry: ");
                        String email = s.next();

                        // c = collection(interface).add function, new Entries (element in list)
                        // (elements in list))
                        
                        // Add (E element) used to add element 'element to the collection c.
                        //If element is added, it returns true, else it will return false
                        c.add(new Entries(firstname, lastname, phonenumber, email));

                        System.out.println("\nAdded new entry!\n");

                        break;
                        
                    case 2:
                        // delete by email - DONE
                    	//boolean found t/f
                    	found = false;
                        System.out.println("Enter entry's email address to delete:");
                        String emailaddress = s.next();
                        System.out.println();
                        //iterator function of entry list
                        //iterator is the object used to loop through collection such as array list.
                        Iterator<Entries> iterator = c.iterator();

                        // while loop used instead of for - thanks mike
                        while (iterator.hasNext()) {
                            Entries temp = iterator.next();

                            // if statement within while loop as while continues to run while for is one and done
                            if (temp.getEmailaddress().equals(emailaddress)) {
                                System.out.println("Following Entry deleted succesfully: ");
                                System.out.println("************");
                                System.out.println(temp);
                                System.out.println("************\n");
                                iterator.remove();
                                found = true;
                            }
                        }
                        while (!found) {
                        System.out.println("\nNo record found\n");
                        break;
                    }
                        break;
                        
                    case 3:
                        // Search entries by all inputs - DONE
                        System.out.println("1) First Name");
                        System.out.println("2) Last Name");
                        System.out.println("3) Phone Number");
                        System.out.println("4) Email Adress");
                        System.out.println("Chose a search type: ");
                        int search = s.nextInt();

                        // spacer
                        System.out.println();
                        found = false;
                        if (search == 1) {
                            System.out.println("Enter your Search: ");
                            firstname = s.next();
                            System.out.println();
                            // iterator function of entry list
                            iterator = c.iterator();

                            // while loop used instead of for
                            while (iterator.hasNext()) {
                                Entries temp = iterator.next();

                                // if statement is within while loop as while loops continues to run BUT for loops is one and done
                                //startsWith to output all entries Starting with the Strings entered by user instead of equal or contains
                                if (temp.getFirstname().startsWith(firstname)) {
                                    found = true;
                                    System.out.println("************");
                                    System.out.println(temp);
                                    System.out.println("************\n");
                                }
                            }
                            if (!found) {
                                System.out.println("No record found\n");
                            }
                            break;
                        } else if (search == 2) {
                            System.out.println("Enter your Search: ");
                            lastname = s.next();
                            System.out.println();
                            // iterator function of entry list
                            iterator = c.iterator();

                            // while loop used instead of for
                            while (iterator.hasNext()) {
                                Entries temp = iterator.next();

                                // if within while loop as while continues to run while for is one and done
                                if (temp.getLastname().startsWith(lastname)) {
                                    found = true;
                                    System.out.println("************");
                                    System.out.println(temp);
                                    System.out.println("************\n");
                                }
                            }
                            if (!found) {
                                System.out.println("No record found\n");
                            }
                            break;
                        } else if (search == 3) {
                            System.out.println("Enter your Search: ");
                            phonenumber = s.next();
                            System.out.println();
                            // iterator function of entry list
                            iterator = c.iterator();

                            // while loop used instead of for
                            while (iterator.hasNext()) {
                                Entries temp = iterator.next();

                                // if within while loop as while continues to run while for is one and done
                                if (temp.getPhonenumber().startsWith(phonenumber)) {
                                    found = true;
                                    System.out.println("************");
                                    System.out.println(temp);
                                    System.out.println("************\n");
                                }
                            }
                            if (!found) {
                                System.out.println("No record found\n");
                            }
                            break;
                        } else if (search == 4) {
                            System.out.println("Enter your Search: ");
                            emailaddress = s.next();
                            System.out.println();
                            // iterator function of entry list
                            iterator = c.iterator();

                            // while loop used instead of for
                            while (iterator.hasNext()) {
                                Entries temp = iterator.next();

                                // if within while loop as while continues to run while for is one and done
                                if (temp.getEmailaddress().equals(emailaddress)) {
                                    found = true;
                                    System.out.println("************");
                                    System.out.println(temp);
                                    System.out.println("************\n");
                                }
                            }
                            if (!found) {
                                System.out.println("No record found\n");
                            }
                            break;
                        } else {
                            System.out.println("\nPICK 1-4 ONLY!\n");
                        }
                        break;
                        
                    case 4:
                        // print entire address book entries - Done
                        Iterator<Entries> i1 = c.iterator();
                        while (i1.hasNext()) {
                            System.out.println("************");
                            Entries e = i1.next();
                            System.out.println(e);
                            System.out.println("************\n");
                        }
                        if (c.isEmpty()) {
                            System.out.println(
                                    "\nThere are no entries in the Address book\n");
                        }
                        // spacer
                        System.out.println();
                        break;
                        
                    case 5:
                        // Delete all entries in address book - DONE
                        c.removeAll(c);
                        System.out.println("Address book cleared!");
                        System.out.println();
                        break;
                        
                    case 6:
                        // exit program - DONE
                        System.out.println("\nProgram exiting...");
                        System.exit(0);
                        break;
                    default:
                        // user input validation of main menu
                        System.out.println("Invalid input! Please enter only integers 1-6\n");
                        break;
                        
                }
            } while (choice != 0);
        }
        catch(Exception e)
        {
        	System.out.println("You entered a non-integer. Program exiting...\n");
        }
        
    }
    // BELOW STILL NEEDS TO BE IMPLEMENTED:
    // Emails need to be unique so User CANNOT enter same email as
    // another user for add entry method so I could use set for collections but all other inputs for gucci
    
    // put methods here instead of leaving them in the switch case
    
    //input validation such as phone number and email in the format phone number = 9 ints at least or email containing @ currently not implemented
    
    //catch for the do-while currently exits program and isnt used for any of the scanner inputs such as search entry
}
