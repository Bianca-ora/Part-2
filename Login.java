/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poepart2;

/**
 *
 * @author User
 */
public class Login extends Registration{
    
    String loginUsername;
    String loginPassword;

    public Login() {
        super();
    }

    public Login(String firstName, String lastName, String userName,
            String password, String cellphone) {

        super(firstName, lastName, userName, password, cellphone);
    }

    public void setLoginDetails(String username, String password) {
        this.loginUsername = username;
        this.loginPassword = password;
    }

    public boolean loginUser(String loginUsername1, String loginPassword1) {
        if (loginUsername == null || loginPassword == null) {
            return false;
        }

        return loginUsername.equals(userName)
                && loginPassword.equals(password);
    }

    public boolean loginUser(String username, String password,
            Registration registration) {

        if (username == null || password == null || registration == null) {
            return false;
        }

        return username.equals(registration.getUserName())
                && password.equals(registration.getPassword());
    }

    public String returnLoginStatus(boolean status) {
        if (status) {
            return "Welcome, it is great to see you again.";
        }

        return "Username or password incorrect, please try again.";
    }

   boolean registerStatus(String name, String password, String cellphone) {
        // Call the validation methods inherited from Registration
        boolean isValidUsername = checkUserName(name);
        boolean isValidPassword = checkPasswordComplexity(password);
        boolean isValidCell = checkCellPhoneNumber(cellphone); // Adjust method name if yours is different

        if (isValidUsername && isValidPassword && isValidCell) {
            // Save the details or set them to fields if necessary
            return true;
        }
        
        return false;
    }
}

 