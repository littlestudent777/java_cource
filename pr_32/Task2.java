public class Task2 {
    public static void main(String[] args) {
        // Преобразование String в StringBuffer
        String originalString = "Hello, World!";
        StringBuffer stringBuffer = new StringBuffer(originalString);
        System.out.println("StringBuffer: " + stringBuffer);
        
        // Преобразование String в StringBuilder
        StringBuilder stringBuilder = new StringBuilder(originalString);
        System.out.println("StringBuilder: " + stringBuilder);
        
        // Преобразование StringBuffer в String
        String strFromBuffer = stringBuffer.toString();
        System.out.println("String from StringBuffer: " + strFromBuffer);
        
        // Преобразование StringBuilder в String
        String strFromBuilder = stringBuilder.toString();
        System.out.println("String from StringBuilder: " + strFromBuilder);
        
        // Преобразование StringBuffer в StringBuilder
        StringBuilder newStringBuilder = new StringBuilder(stringBuffer.toString());
        System.out.println("StringBuilder from StringBuffer: " + newStringBuilder);
        
        // Преобразование StringBuilder в StringBuffer
        StringBuffer newStringBuffer = new StringBuffer(stringBuilder.toString());
        System.out.println("StringBuffer from StringBuilder: " + newStringBuffer);
    }
}
/*
Вывод:
StringBuffer: Hello, World!
StringBuilder: Hello, World!
String from StringBuffer: Hello, World!
String from StringBuilder: Hello, World!
StringBuilder from StringBuffer: Hello, World!
StringBuffer from StringBuilder: Hello, World!
*/
