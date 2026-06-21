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
}
