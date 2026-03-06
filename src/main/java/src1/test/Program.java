package src1.test;

class Parent
{        
    public  String HelloWorld()
    {
        return "Hello world from Parent";
    }

    public String GoodbyeWorld()
    {
        return "Goodbye world from Parent";
    }
}

 class Child extends Parent
{
     // override: exact same signature, parent method must be virtual
    public  String HelloWorld()
    {
        return "Hello World from Child";
    }

     // overload: same name, different order of parameter types
    public String GoodbyeWorld(String name)
    {
        return GoodbyeWorld() + " from " + name +"from child";
    }
}

