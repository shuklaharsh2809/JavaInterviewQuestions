class ReverseString{
    public static void main(String[] args) {
        String s="Selenium";
        //String is imutable so it does not have reverse function
      //1 Using for loop  
       int len=s.length();
       String rev="";
       for(int i=len-1;i>=0;i--){
          rev=rev + s.charAt(i);

        }
       System.out.println(rev);
   //2) using STRING BUFFER
   //StringBuffer sf = new StringBuffer(s);
  // System.out.println(sf.reverse());
    }
}











