package bittech.lib.commands.ln.onchain;

import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataRequest;
import bittech.lib.protocol.common.NoDataResponse;

public class RegisterFundsReceivedCommand extends Command<NoDataRequest, NoDataResponse> {
	
	public static RegisterFundsReceivedCommand createStub () {
		return new RegisterFundsReceivedCommand();
	}
	
	public RegisterFundsReceivedCommand() {
		this.request = new NoDataRequest();
	}
}
