package model;

import java.util.Arrays;

public class Model {
    private List<User> usersList;

    public Model() {
        this.usersList = new List<User>();
        usersList.push(new User("hectogre", "coca"));
    }

    // -------------------------------------------------- Getters and Setters --------------------------------------------------
    public List<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<User> usersList) {
        this.usersList = usersList;
    }

    // -------------------------------------------------- Login --------------------------------------------------
    public int searchUser(String target) {
        for(int i = 0; i < usersList.length(); i++) {
            if(usersList.valueOf(i).getUsername().equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public User loginUser(int index, String password) {
        if(usersList.valueOf(index).getPassword().equals(password)) {
            return usersList.valueOf(index);
        }
        return null;
    }

    // -------------------------------------------------- Sign up --------------------------------------------------
    public void registerUser(String username, String password) {
        usersList.push(new User(username, password));
    }

    // -------------------------------------------------- Home --------------------------------------------------



    // -------------------------------------------------- Register --------------------------------------------------
    public double destinationPrice(int days, String destination) {
        System.out.println("Entro a la funcion");
        if(destination.equals("Playa del carmen")) {
            return 1500 * days;
        }
        if(destination.equals("Chapala")) {
            return 500 * days;
        }
        if(destination.equals("Ecatepec")) {
            return 50 * days;
        }
        if(destination.equals("Los Cabos")) {
            return 1000 * days;
        }
        if(destination.equals("Lago <asdentro")) {
            return 3500 * days;
        }
        return 0;
    }

    public double roomPrice(int days, String roomKind) {
        if(roomKind.equals("Sencilla")) {
            return 1200 * days;
        }
        if(roomKind.equals("Doble")) {
            return 2100 * days;
        }
        if(roomKind.equals("Suite")) {
            return 3500 * days;
        }
        return 0;
    }

    public double calcSubtotal(int days, String destination, String roomKind) {

        double subtotal = (destinationPrice(days, destination) * days) + (roomPrice(days, roomKind) * days);
        return subtotal;
    }

    public void registerQuotation(User actualUser, int days, String destination, String roomKind, String payMethod, double subtotal) {
        actualUser.getQuotatiosnList().push(new Quotation(days, destination, roomKind,payMethod, subtotal));
    }

}
