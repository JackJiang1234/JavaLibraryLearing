package thread.communcation.synchronize;

public class DrawTest
{
	public static void main(String[] args)
	{
		Account acct = new Account("1234567" , 0);
		new DrawThread("取钱者甲" , acct , 800).start();
		new DrawThread("取钱者乙" , acct , 800).start();
		new DrawThread("取钱者丙" , acct , 800).start();
		new DepositThread("存款者甲" , acct , 800).start();
		new DepositThread("存款者乙" , acct , 800).start();
		new DepositThread("存款者丙" , acct , 800).start();
		
		//System.out.println("done!");
	}
}