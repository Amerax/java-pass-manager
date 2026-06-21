public class Password {
    private String pass;
    private String username;
    private String securityQuestion;
    private String secuitryAnswer;
    private String website;

    public Password(String user, String password, String web){
        this.pass = password;
        this.username = user;
        this.website = web;
    }

    public String getPass(){
        return this.pass;
    }

    public String getUser(){
        return this.username;
    }

    public String getSecAns(){
        return this.secuitryAnswer;
    }

    public String getSecQuesion(){
        return this.securityQuestion;
    }

}
