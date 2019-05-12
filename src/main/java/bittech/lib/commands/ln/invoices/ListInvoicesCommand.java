package bittech.lib.commands.ln.invoices;

import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataRequest;

public class ListInvoicesCommand extends Command<NoDataRequest, ListInvoicesResponse> {
	
	public static ListInvoicesCommand createStub () {
		return new ListInvoicesCommand();
	}
	
	public ListInvoicesCommand() {
		this.request = new NoDataRequest();
	}
	
}
