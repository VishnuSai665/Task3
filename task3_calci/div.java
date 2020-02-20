package epam.task3_calci;

class div
{
	float a,b;
	div(float one,float two)
	{
		a=one;
		b=two;
	}
	boolean quo(float a,float b)
	{
	if(b!=0)
		{
		System.out.println(a/b);
		return true;
		}
	else 
		{
		System.out.println("Invalid operation");
		return false;
		}
	}
}