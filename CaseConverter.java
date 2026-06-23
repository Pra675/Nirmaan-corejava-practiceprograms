/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class StringCompare {
    private String str1;
    private String str2;

    StringCompare(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    void compare() {
        if (str1.equals(str2)) {
            System.out.println("Strings are Equal");
        } else {
            System.out.println("Strings are Not Equal");
        }
    }

    public static void main(String[] args) {
        StringCompare obj = new StringCompare("Java", "Java");
        obj.compare();
    }
}