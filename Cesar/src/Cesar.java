import java.util.Arrays;


public class Cesar {
	private int msg[];
	private int msgCode[];
	private Character cle;
	private Alphabet a;
	
	
	public Cesar(String msg, char cle)
	{
		a = new Alphabet();
		this.msg = new int[msg.length()];
		this.msgCode = new int[msg.length()];
		this.cle = cle;
		msg = msg.toUpperCase();
		for(int i = 0;i<msg.length();i++)
		{
			this.msg[i] = a.position(msg.charAt(i));
		}
		
	}
	
	public void coder()
	{
		for(int i=0; i<msg.length;i++)
		{
			msgCode[i] = msg[i]+a.position(cle);
		}
	}
	
	
	public String getMsg()
	{
		String retour = new String("");
		for (int i =0;i<msg.length;i++) {
			retour = retour.concat(a.lettreCorrespondante(msg[i]).toString());
		}
		return retour;
	}
	
	public String getMsgCode()
	{
		String retour = new String("");
		for (int i =0;i<msgCode.length;i++) {
			retour = retour.concat(a.lettreCorrespondante(msgCode[i]).toString());
		}
		return retour;
	}
	
	@Override
	public String toString() {
		return "Cesar [msg=" + Arrays.toString(msg) + ", msgCode=" + Arrays.toString(msgCode) + ", cle=" + cle + "]";
	}
	
	

}
