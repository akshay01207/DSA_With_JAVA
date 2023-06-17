package com.oops;

class TestStaticFinal{
    static int marks;
    void set_marks(int marks)
    {
        this.marks=marks;               //Line 1
    }
}
class MCQ {
    public static void main (String[] args) {
    	TestStaticFinal t=new TestStaticFinal();              
        t.set_marks(78);                //Line 2
        System.out.print(TestStaticFinal.marks);   //Line 3 ==> 78
    }
}

//there is no error in this code. In this class, there is just a single variable, 
//which is, static variable. Static variables are property of the class, but you can access it through objects. 
//Hence, line 1 and 2 did not generate any error.  
