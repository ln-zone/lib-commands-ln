package bittech.lib.commands.ln.onchain;

import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataRequest;

public class NewAddressCommand extends Command<NoDataRequest, NewAddressResponse> {
	
	public static NewAddressCommand createStub () {
		return new NewAddressCommand();
	}
	
	public NewAddressCommand() {
		this.request = new NoDataRequest();
	}
}
