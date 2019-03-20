package bittech.lib.commands.ln.peers;

import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataRequest;

public class ListPeersCommand extends Command<NoDataRequest, ListPeersResponse> {
	
	public static ListPeersCommand createStub () {
		return new ListPeersCommand();
	}
	
	public ListPeersCommand() {
		this.request = new NoDataRequest();
	}
}
