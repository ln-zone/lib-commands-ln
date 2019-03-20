package bittech.lib.commands.ln.channels;

import bittech.lib.protocol.Request;
import bittech.lib.utils.Btc;

public class ChannelChangedRequest implements Request {
	
	public String peerAlias;
	public String peerId;
	public String state;
	public String shortChannelId;
	public String fundingTxId;
	public Btc myAmount;
	public Btc peerAmount;
	public Btc capacity;

	public ChannelChangedRequest() {
		// TODO Auto-generated constructor stub
	}

}
