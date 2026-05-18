//Part 1, task 1
class VoidContainer {}

class Main
{
    VoidContainer item_1 = new VoidContainer(); //it works, we can create new object of an empty class

    //from Part 2, task 2
    public static void main(String[] args)
    {
        Product laptop = new Product("Laptop", 14999.00);
        Product mouse = new Product("Mouse", 600.00);
        Product keyboard = new Product("Keyboard", 699.00);

        laptop.displayInfo();
        mouse.displayInfo();
        keyboard.displayInfo();

        System.out.println("Total products created: " + Product.totalProductsCreated);
        System.out.println();

        //Shadowing challenge
        double price = 14999.00;

        price = 10000.00; //local change

        laptop.price = 11399.00; //instance change

        System.out.println("Local variable price: " + price);
        System.out.println("Laptop object's updated price: " + laptop.price);
        System.out.println();
    }
}

//task 2
/*class true
        {
//it says "identifier expected" and "'class' or 'interface' expected"
}*/

//task 3
class StringCase
{
    String message; //not initialized
}

class Check
{
    public static void main(String[] args)
    {
        StringCase example = new StringCase();
        System.out.println(example.message); //prints "null"
    }
}

//task 4
class InstanceVsLocal
{
    int x = 10; //instance variable
    void demonstrateShadowing()
    {
        int x = 20; //local variable
        System.out.println(x); //wins local variable (20), with "this.x" instance variable would win over the local one
    }
}

//task 5
class Counter
{
    static int count = 0;
    void increment()
    {
        count++;
    }
}

class CounterInc
{
    public static void main(String[] args)
    {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        c1.increment();
        c2.increment();
        c3.increment();

        System.out.println(c1.count); //it will be 3, since it shares value among all three objects cuz of a static
    }
}

//task 6
class FinalLockdown
{
    final double PI = 3.14;
    void tryChangingPI()
    {
        //PI = 4.0;
        System.out.println(PI); //compiler says "cannot assign a value to final variable 'PI'"
    }
}

//task 7
class Student
{
    String name;
}

class NullTrap
{
    void demonstrate()
    {
        Student s;
        //System.out.println(s.name); //it says "variable s might not have been initialized"
    }
}

//task 8
class DefaultPrimitives
{
    int quantity;
    boolean happy;
    double weight;

    void Defaults()
    {
        System.out.println("Default int: " + quantity); // = 0
        System.out.println("Default boolean: " + happy); // = false
        System.out.println("Default double: " + weight); // = 0.0
    }
}

//task9
class MethodMath
{
    static int square(int n)
    {
        return n * n;
    }

    public static void main(String[] args)
    {
        int result = square(5); //calling the method
        System.out.println("Result: " + result); // = 25
    }
}

//task 10
class User
{
    String name;
    String email;
    String phone;

    User(String name, String email, String phone)
    {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    void printBusinessCard()
    {
        System.out.println
                (
                "===== BUSINESS CARD =====\n" +
                "Name:\t" + name + "\n" +
                "Email:\t" + email + "\n" +
                "Phone:\t" + phone + "\n" +
                "========================="
                );
    }
}

//Part 2, task 1
class Product
{
    String name;
    double price;
    final int id;
    static int totalProductsCreated = 0;

    Product(String name, double price)
    {
        this.name = name;
        this.price = price;
        totalProductsCreated++;
        this.id = totalProductsCreated;
    }

    void displayInfo()
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
    }
}
//head to the line 4 for task 2

//Part 3, task 1-4
class ScopeDetective
{
    int instVal = 70; //instance variable

    void ogMethod(String line)
    {
        System.out.println("Parameter line: " + line); //parameter variable: visible only inside this method

        System.out.println("Instance instVal: " + instVal); //instance variable visible inside methods

        for (int i = 0; i < 3; i++) //loop variable scope
        {
            System.out.println("Inside loop, i = " + i);
        }
        
        //System.out.println(i); compiler cannot resolve the symbol cuz out of loop
    }

    void anotherMethod()
    {
        System.out.println("anotherMethod can see instVal: " + instVal);

        //System.out.println(line); compiler cannot resolve the symbol cuz not an instance variable
    }
}