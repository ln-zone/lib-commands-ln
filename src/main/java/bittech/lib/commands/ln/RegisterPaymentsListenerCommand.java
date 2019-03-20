package bittech.lib.commands.ln;

import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataRequest;
import bittech.lib.protocol.common.NoDataResponse;

public class RegisterPaymentsListenerCommand extends Command<NoDataRequest, NoDataResponse> {

	public static RegisterPaymentsListenerCommand createStub() {
		return new RegisterPaymentsListenerCommand();
	}
	
	public RegisterPaymentsListenerCommand() {
		this.request = new NoDataRequest();
	}
	
}
