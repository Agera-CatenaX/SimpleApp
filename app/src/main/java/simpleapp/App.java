/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package simpleapp;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public String getAnotherGreeting() {
        return "Greetings!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        System.out.println(new App().getAnotherGreeting());
    }
}
