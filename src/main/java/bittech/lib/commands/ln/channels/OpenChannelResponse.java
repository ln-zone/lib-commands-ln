package bittech.lib.commands.ln.channels;

import bittech.lib.protocol.Response;

public class OpenChannelResponse implements Response {

	/** Hex-encoded string representing the funding transaction */
	public String txId;
	
	/** The index of the output of the funding transaction */
	public int outputIndex;

	
}
