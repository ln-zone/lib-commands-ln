package bittech.lib.commands.ln.onchain;

import bittech.lib.protocol.Request;
import bittech.lib.utils.Btc;

public class SendOnChainRequest implements Request {
	
	public String addr;
	public Btc amount;
	
	public SendOnChainRequest(String addr,  Btc amount) {
		this.addr = addr;
		this.amount = amount;
	}


}
