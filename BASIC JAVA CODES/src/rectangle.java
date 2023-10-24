class Email {

   	String email;

public String get_email() {
   return email; 
 } 
    public void set_email(String email) {
    this.email = email;
    }
    public boolean check() {
    int count = 0;
    for(int i=0; i<email.length(); i++) {
    if(email.charAt(i) != '@')
    count++;
    
    }
        if(count == email.length())
        return false;
        else
        return true;
    }
    }


