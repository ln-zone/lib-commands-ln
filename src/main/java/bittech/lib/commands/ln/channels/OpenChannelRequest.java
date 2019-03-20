package bittech.lib.commands.ln.channels;

import bittech.lib.protocol.Request;
import bittech.lib.utils.Btc;
import bittech.lib.utils.Require;

public class OpenChannelRequest implements Request {
	
	public String nodeId;
	public Btc capacity;
	public Btc pushAmount;
	
	public OpenChannelRequest(String nodeId, Btc capacity, Btc pushAmount) {
		this.nodeId = Require.notNull(nodeId, "nodeId");
		this.capacity = Require.notNull(capacity, "capacity");
		this.pushAmount = Require.notNull(pushAmount, "pushAmount");
	}


}
