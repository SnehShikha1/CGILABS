package Assignn;

public class Assin_method {

        public static String string_op(String s, int choice) {
                        
                        switch(choice) {
                        
                        case 1:
                                return s+s;
                                
                        case 2:
                                char[] charArray = s.toCharArray();
                                for (int i =0; i <charArray.length; i +=2) {
                                        charArray[i] = '#';
                                }
                                return new String(charArray);
                                
                        case 3:
                                
                                StringBuilder result = new StringBuilder();
                                for(char c : s.toCharArray()) {
                                        if(result.indexOf(String.valueOf(c)) == -1) {
                                                result.append(c);
                                        }
                                }
                                
                        case 4:
                                
                                StringBuilder modString = new StringBuilder();
                                for(int i =0 ;i < s.length(); i++) {
                                        char c = s.charAt(i);
                                        if(i % 2 == 0) {
                                                modString.append(Character.toUpperCase(c));
                                        }
                                        else {
                                                modString.append(c);
                                        }
                                }
                                return modString.toString();
                        }
                        return s;
                }
                
                public static void main(String[] args) {
                        String s = "Hello World";
                        int choice = 6;
                        String result = string_op(s,choice);
                        System.out.println("Result:  "+result);
                }

        }                                
                                        
                                        
                                        
                                        
                                        
                                        
                       
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
