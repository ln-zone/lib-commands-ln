package bittech.lib.commands.ln.onchain;

import bittech.lib.protocol.Request;
import bittech.lib.utils.Btc;

public class FundsReceivedRequest implements Request {
	
	public String addr;
	public Btc amount;
	
	public FundsReceivedRequest(String addr,  Btc amount) {
		this.addr = addr;
		this.amount = amount;
	}


}
