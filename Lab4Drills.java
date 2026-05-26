public class Lab4Drills
{
    //Drill1
    String name;
    static void something()
    {
        name = "something";
    }

    //Drill2
    int sum(int... numbers) //variable arguments (any amount of int)
    {
        int total = 0;

        for (int number : numbers) //for-each
        {
            total += number;
        }
        return total;
    }

    //Drill3
    void test(int... nums, String s){} //error says "Vararg parameter must be the last in the list"

    //Drill4
    static class MyClass
    {
        public MyClass(String text)
        {
        System.out.println(text);
        }

        MyClass obj = new MyClass(); //Expected 1 argument but found 0
    }

    //Drill5
    static class States
    {
        String state;
        int age;

        public States(String state)
        {
            this(state, 19); //calls the constructor below
        }

        public States(String state, int age)
        {
            this.state = state;
            this.age = age;
        }
    }

    //Drill6
    static class Calc
    {
        public static void main(String[] args)
        {
            double result = Math.sqrt(144);
            int amount = Integer.parseInt("100");
            //both are static methods since they're belong to class and not specific object, so we call them directly without needing to create an instance
        }

    }

    //Drill7
    void change(final int x)
    {
        x = 10;//Cannot assign a value to final variable 'x'
    }

    //Drill8
    static class Example
    {
        void show()
        {
            System.out.println(this); //Example@12db4781
        }

        public static void main(String[] args)
        {
            Example obj = new Example();
            System.out.println(obj);
            obj.show();
        }
    }

    //Drill9
    static class AnotherClass
    {

        public static void main(String[] args)
        {
            System.out.println("It works");
        }
    }

    //Drill10
    String name1;

    void setName(String name1)
    {
        this.name1 = name1;
    }


    //Part 2, task 1
    static class Student
    {

        String name;
        int id;

        static int studentCount = 0;

        Student(String name)
        {
            this.name = name;

            studentCount++;
            id = studentCount;
        }
    }

    static class Program
    {

        public static void main(String[] args)
        {

            Student lastStudent = null;

            for (int i = 1; i <= 5; i++)
            {
                lastStudent = new Student("Student " + i);
            }

            System.out.println(lastStudent.id); //5
        }

        //part 2, task 2 demonstration
        {
            BankAccount acc = new BankAccount("UA123", 500);

            acc.accountNumber = "EN751"; //Cannot assign a value to final variable 'accountNumber'
        }

    }

    //task 2
    static class BankAccount
    {
        double balance;
        final String accountNumber;

        BankAccount(String accountNumber, double balance)
        {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        void deposit(double amount)
        {

            if (amount < 0)
            {
                return;
            }

            balance += amount;
        }

        void withdraw(double amount)
        {

            if (amount > balance)
            {
                System.out.println("Insufficient funds");
                return;
            }

            balance -= amount;
        }
    }

    //task 3
    static class Student1
    {

        String name;

        Student1(String name)
        {
            this.name = name;
        }
    }

    static class PassByValueTest
    {
        void swap(int a, int b)
        {
            int temp = a;
            a = b;
            b = temp;
        }

        void changeName(Student s)
        {
            s.name = "Changed"; //changes the object's field through the copied reference
        }

        void replaceStudent(Student s)
        {
            s = new Student("New Person");
        }

        public static void main(String[] args)
        {

            PassByValueTest test = new PassByValueTest();

            int x = 5;
            int y = 10;

            System.out.println("Before swap: " + x + " " + y);

            test.swap(x, y);

            System.out.println("After swap: " + x + " " + y);

            Student st = new Student("Alice"); //changes local copy

            System.out.println("Before changeName: " + st.name);

            test.changeName(st);

            System.out.println("After changeName: " + st.name);

            test.replaceStudent(st);

            System.out.println("After replaceStudent: " + st.name);
        }
    }

    //part 4

    static class Book
    {
        final String isbn;
        final String title;

        Book(String isbn, String title)
        {
            this.isbn = isbn;
            this.title = title;
        }
    }

    static class Library
    {
        static int totalBooks = 0;
        Book[] collection = new Book[100];
        int index = 0;

        void addBooks(Book... newBooks)
        {

            for (Book b : newBooks)
            {
                collection[index] = b;
                index++;

                totalBooks++;
            }
        }
    }

    static class Main
    {
        public static void main(String[] args)
        {
            Library lib1 = new Library();
            Library lib2 = new Library();

            Book b1 = new Book("111", "Java Basics");
            Book b2 = new Book("222", "OOP Mastery");
            Book b3 = new Book("333", "Memory Logic");

            Book b4 = new Book("444", "Algorithms");
            Book b5 = new Book("555", "Data Structures");

            lib1.addBooks(b1, b2, b3);
            lib2.addBooks(b4, b5);

            System.out.println("Total books: " + Library.totalBooks);
        }
    }
}