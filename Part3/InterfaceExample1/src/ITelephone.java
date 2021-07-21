public interface ITelephone {
    //the method that form this interface
    //you have to use these method if you use the interface,
    // not defining the methods though, you do that in the class
    //was public void powerOn();, but you will declare this in the class so no need for public
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

}
