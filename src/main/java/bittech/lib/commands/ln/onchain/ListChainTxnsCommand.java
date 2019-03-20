package bittech.lib.commands.ln.onchain;

import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataRequest;

public class ListChainTxnsCommand extends Command<NoDataRequest, ListChainTxnsResponse> {
	
	public static ListChainTxnsCommand createStub () {
		return new ListChainTxnsCommand();
	}
	
	public ListChainTxnsCommand() {
		this.request = new NoDataRequest();
	}
}
