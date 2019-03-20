package bittech.lib.commands.ln.channels;

import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataRequest;

public class ListPendingChannelsCommand extends Command<NoDataRequest, ListPendingChannelsResponse> {
	
	public static ListPendingChannelsCommand createStub () {
		return new ListPendingChannelsCommand();
	}
	
	public ListPendingChannelsCommand() {
		this.request = new NoDataRequest();
	}
}
