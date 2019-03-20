package bittech.lib.commands.ln.channels;

import bittech.lib.protocol.Request;
import bittech.lib.utils.Require;

public class CloseChannelRequest implements Request {
	
	public String channelPoint;
	public boolean force;
	
	public CloseChannelRequest(final String channelPoint, final boolean force) {
		this.channelPoint = Require.notNull(channelPoint, "channelPoint");
		this.force = force;
	}

}
