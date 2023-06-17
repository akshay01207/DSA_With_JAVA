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
        System.out.print(TestStaticFinal.marks);   //Line 3
    }
}


