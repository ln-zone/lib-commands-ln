package bittech.lib.commands.ln.channels;

import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataRequest;
import bittech.lib.protocol.common.NoDataResponse;

public class RegisterChannelsListenerCommand extends Command<NoDataRequest, NoDataResponse> {

	public static RegisterChannelsListenerCommand createStub() {
		return new RegisterChannelsListenerCommand();
	}
	
	public RegisterChannelsListenerCommand() {
		this.request = new NoDataRequest();
	}
	
}
