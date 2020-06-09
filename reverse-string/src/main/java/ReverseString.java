class ReverseString {

    String reverse(String inputString) {
        String[] forwards = inputString.split("");
        String backwards = "";
        for(int i = forwards.length; i > 0 ; i--) {
            backwards = backwards + forwards[i -1];
        }
        return backwards;
    }
  
}
