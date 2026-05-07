package Interface;

  class PayUPI implements payment{
    
    public void pay()
    {
        int a=1000;
       
        System.out.println("PAYMENT Using UPI");
        System.out.println("Payment Done: " +a);
    }
}
