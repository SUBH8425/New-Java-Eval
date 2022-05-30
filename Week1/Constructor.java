package Week1;
//Q1) Explain the difference between IS-A and Has-A relationship with the help of an
//example and explain about access modifiers and their accessibility?

/*
 * Whenever IS- A and Has -A relationship is asked about in coding first thing that come to our mind 
 * is that it is a Inheritance we are talking about. Inheritance is formed when some of the Parent class 
 * features are passed down to the child class with the help of the syntax - extends.
 * 
 * Is - A relationship means their can be found that Two classes can form a direct relation between each other.
 * were as in Has - A relationship no direct relation can be traced.
 * let see this with example.
 * 
 * */
public class Constructor {

	
}
// example.......
// class Games is a parent class or super class constructor.........
class Games {
	
}

// class Football is a Child class or subclass constructor....... 
// this gives us an idea of the IS-A relationship
class Football extends Games{
	
}

// Now let say we make another class Cricket..... 
// this class will again extends class Games 
// but the relation between the football and Cricket Has-A relation we can say that.....
class Cricket extends Games{
	
}


///// access modifiers and their accessibility///////

/*
 * Few Examples of Access modifiers are : 1. Public , 2. Protected , 3. Static , 4. Default.
 * 
 * Public modifiers can be accessed anywhere inside outside actually it make it available for everyone.
 * 
 * Protected the scope of this is limited as and for the security purpose. (Used within its block.) 
 * 
 * Static is the most common used it makes the data set on the context area asap.
 * 
 * and, default has the property almost same as of the public if you do not put any of this access modifier.
 * 
 * 
 * */



