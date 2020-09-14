
public class Singleton {
	
	private static Singleton s=null;
	private Singleton()	{}
	
	public static Singleton getSingleton()
	{
		if(s==null)
		{
			s=new Singleton();	
			
		}
		return s;
	}
public static void main(String[] args) {

	Singleton ss=Singleton.getSingleton();
	Singleton s1=Singleton.getSingleton();
	Singleton s2=Singleton.getSingleton();
	Singleton s3=Singleton.getSingleton();
	System.out.println(ss);
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	
	
}

}
