package bittech.lib.commands.ln.peers;

import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataRequest;

public class ListPeersWithChannelsCommand extends Command<NoDataRequest, ListPeersWithChannelsResponse> {
	
	public static ListPeersWithChannelsCommand createStub () {
		return new ListPeersWithChannelsCommand();
	}
	
	public ListPeersWithChannelsCommand() {
		this.request = new NoDataRequest();
	}
}
