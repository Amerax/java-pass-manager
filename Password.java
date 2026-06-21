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

    public String getWebsite(){
        return this.website;
    }

    public String getSecQuesion(){
        return this.securityQuestion;
    }

    public void setSecQuestion(String x){
        this.securityQuestion = x;
    }

    public void setSecAns(String x){
        this.secuitryAnswer = x;
    }
}
