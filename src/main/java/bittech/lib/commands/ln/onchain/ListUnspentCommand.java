package bittech.lib.commands.ln.onchain;

import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataRequest;

public class ListUnspentCommand extends Command<NoDataRequest, ListUnspentResponse> {
	
	public static ListUnspentCommand createStub () {
		return new ListUnspentCommand();
	}
	
	public ListUnspentCommand() {
		this.request = new NoDataRequest();
	}
}
