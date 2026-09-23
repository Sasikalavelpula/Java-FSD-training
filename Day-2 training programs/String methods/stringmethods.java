public class stringmethods{
    public static void main(String[] args){
        String str="Java programming";
        System.out.println("original:"+str);
        System.out.println("Length:"+str.length());
        System.out.println("Character at index 2:"+str.charAt(2));
        System.out.println("Uppercase:"+str.toUpperCase());
        System.out.println("Lowercase:"+str.toLowerCase());
        System.out.println("Substring from index 5:"+str.substring(5));
        System.out.println("Substring from index 5 to 10:"+str.substring(5,10));
        System.out.println("Index of 'p':"+str.indexOf('p'));
        System.out.println("Last index of 'a':"+str.lastIndexOf('a'));
        System.out.println("Replace 'a' with 'o':"+str.replace('a','o'));
        System.out.println("equals 'Java programming':"+str.equals("Java programming"));
        System.out.println("Trimmed string:"+str.trim());
        System.out.println("Starts with 'Java':"+str.startsWith("Java"));
        System.out.println("Ends with 'programming':"+str.endsWith("programming"));
        System.out.println("equalsIgnoranceCase 'java programming':"+str.equalsIgnoreCase("java programming"));

    }
}