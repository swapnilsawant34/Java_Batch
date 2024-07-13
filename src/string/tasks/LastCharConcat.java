package string.tasks;


public class LastCharConcat {
    public static void main(String[] args) {
       
        String[] strings = {"India", "won", "the", "world","cup"};

        
        String r = "";

       
        for (int i = 0; i < strings.length; i++) {
            String str = strings[i];
            if (str != null && str.length() > 0) {
                r =r+ str.charAt(str.length() - 1);
            }
        }

     
        System.out.println("Concatenated string is: " + r);
    }
}

