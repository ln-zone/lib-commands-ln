package bittech.lib.commands.ln.channels;

import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataResponse;

public class CloseChannelCommand extends Command<CloseChannelRequest, NoDataResponse> {
	
	public static CloseChannelCommand createStub () {
		return new CloseChannelCommand("", false);
	}
	
	public CloseChannelCommand(final String channelPoint, final boolean force) {
		this.request = new CloseChannelRequest(channelPoint, force);
	}
}
