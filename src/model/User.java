package model;

public class User {
    private String username;
    private String password;
    private List<Quotation> quotationsList;
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.quotationsList = new List<Quotation>();
    }

    // ------------------------------ Getter and Setters ------------------------------

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Quotation> getQuotatiosnList() {
        return quotationsList;
    }

    public void setQuotatiosnList(List<Quotation> quotationsList) {
        this.quotationsList = quotationsList;
    }
}
