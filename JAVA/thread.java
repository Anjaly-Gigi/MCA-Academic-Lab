import java.util.Scanner;
class Fib implements Runnable
{
	int a=0,b=1,c,num;

	Fib(int n)
	{
		num=n;
		Thread t=new Thread(this,"Fibanocci");
		t.start();
	}

	public void run()
	{
		for(int i=0;i<=num;++i)
		{
			System.out.println("Fibanocci : "+a);
			c=a+b;
			a=b;
			b=c;
		}
	}
}

class Even implements Runnable
{
	int num;

	Even(int n)
	{
		num=n;
		Thread t=new Thread(this,"Even");
		t.start();
	}

	public void run()
	{

		for(int i=2;i<=num;i++)
		{
		if(i%2==0)
		{
		  System.out.println("Even : "+i);
		}
		}
	}
}

class thread
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("enter the range");
		n=s.nextInt();

		Fib f=new Fib(n);
		Even e=new Even(n);

	}
}
