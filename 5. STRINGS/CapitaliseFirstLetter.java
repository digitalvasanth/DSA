import java.util.*;
class CapitaliseFirstLetter{
    public static String capitalise(String sentence)
    {
        StringBuilder sb=new StringBuilder();

        char ch=Character.toUpperCase(sentence.charAt(0));
        sb.append(ch);
        for(int i=1;i<sentence.length();i++){
            char c=sentence.charAt(i);

            if(c==' '){
            sb.append(c);
            i++;
            sb.append(Character.toUpperCase(sentence.charAt(i)));

            }
            else
            sb.append(sentence.charAt(i));


        }
        return sb.toString();

    }
    public static void main(String []args)
    {
        String sentence= "Hi i am digital vasanth";


        System.out.println(capitalise(sentence));
    }
}