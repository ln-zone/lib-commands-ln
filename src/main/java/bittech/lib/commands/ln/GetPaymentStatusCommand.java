package bittech.lib.commands.ln;

import bittech.lib.protocol.Command;

public class GetPaymentStatusCommand extends Command<GetPaymentStatusRequest, GetPaymentStatusResponse> {

	public static GetPaymentStatusCommand createStub () {
		return new GetPaymentStatusCommand("");
	}
	
	public GetPaymentStatusCommand(final String requestId) {
		request = new GetPaymentStatusRequest(requestId);
	}

}
