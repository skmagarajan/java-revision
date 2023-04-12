package n2s.ehc;

import java.util.Scanner;

public class UserMain {
    static Scanner scanner = new Scanner(System.in);
    private int getInput() throws UserExceptions.InvalidEntry {
        try {
            return scanner.nextInt();
        }
        catch (Exception e){
            throw new UserExceptions.InvalidEntry("Invalid Option Selected");
        }
    }

    private boolean userSameOption(String option) {
        System.out.println("Wish to "+option+" more (y/n):");
        String selectedOption = scanner.next();
        if(selectedOption.equals("y")){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        UserMain mainObject = new UserMain();
        UserOptions userOptions = new UserOptions();
        UserBean userBean = new UserBean();
        while(true){
            System.out.println("Choose the option below"+"\n"+"***********************");
            String[] options = {"1 - Insert","2 - Update","3 - Delete","4 - View","5 - Exit"};

            for(String option : options){
                System.out.println(option);
            }

            System.out.println("Enter your option value: ");
            try{
                userBean.setOptionValue(mainObject.getInput());
                switch (userBean.getOptionValue()){
                    case 1: {
                        do{
                            try{
                                System.out.println("Insert"+"\n"+"********");
                                System.out.println("Enter UserId");
                                userBean.setUserId(scanner.nextInt());

                                if(userOptions.containsUserId(userBean.getUserId())){
                                    throw new UserExceptions.InvalidUserId("User Id already exist. Try different");
                                }
                                else{
                                    System.out.println("Enter Name");
                                    userBean.setUserName(scanner.next());
                                    userOptions.insert(userBean);
                                }
                            }
                            catch (UserExceptions.InvalidUserId e){
                                e.printStackTrace();
                            }
                        }while(mainObject.userSameOption("Insert"));
                        break;
                    }
                    case 2: {
                        do{
                            try{
                                System.out.println("Update"+"\n"+"********");
                                System.out.println("Enter UserId");
                                userBean.setUserId(scanner.nextInt());

                                if(!userOptions.containsUserId(userBean.getUserId())){
                                    throw new UserExceptions.UserIdNotFound("User Id not available. Try different");
                                }
                                else{
                                    System.out.println("Enter Name");
                                    userBean.setUserName(scanner.next());
                                    userOptions.update(userBean);
                                }
                            }
                            catch (UserExceptions.UserIdNotFound e){
                                e.printStackTrace();
                            }
                        }while(mainObject.userSameOption("Update"));
                        break;
                    }
                    case 3: {
                        do{
                            try{
                                System.out.println("Delete"+"\n"+"********");
                                System.out.println("Enter UserId");
                                userBean.setUserId(scanner.nextInt());

                                if(!userOptions.containsUserId(userBean.getUserId())){
                                    throw new UserExceptions.UserIdNotFound("User Id not available. Try different");
                                }
                                else{
                                    userOptions.delete(userBean.getUserId());
                                }
                            }
                            catch (UserExceptions.UserIdNotFound e){
                                e.printStackTrace();
                            }
                        }while(mainObject.userSameOption("Delete"));
                        break;
                    }
                    case 4 : {
                        userOptions.view();
                        break;
                    }
                    case 5: {
                        scanner.close();
                        userOptions.exit();
                    }
                    default:{
                        throw new UserExceptions.InvalidEntry("Invalid Option Selected");
                    }
                }
            }
            catch (UserExceptions.InvalidEntry e){
                e.printStackTrace();
                break;
            }
        }
    }
}
