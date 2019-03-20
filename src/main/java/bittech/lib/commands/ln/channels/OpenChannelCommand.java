package bittech.lib.commands.ln.channels;

import bittech.lib.protocol.Command;
import bittech.lib.utils.Btc;

public class OpenChannelCommand extends Command<OpenChannelRequest, OpenChannelResponse> {
	
	public static OpenChannelCommand createStub () {
		return new OpenChannelCommand("", new Btc(), new Btc());
	}
	
	public OpenChannelCommand(String nodeId, Btc capacity, Btc pushAmount) {
		this.request = new OpenChannelRequest(nodeId, capacity, pushAmount);
	}
}
