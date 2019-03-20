package bittech.lib.commands.ln;

import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataResponse;

public class PaymentReceivedCommand extends Command<PaymentReceivedRequest, NoDataResponse> {

	public static PaymentReceivedCommand createStub () {
		return new PaymentReceivedCommand(new PaymentReceivedRequest());
	}

	public PaymentReceivedCommand(PaymentReceivedRequest req) {
		request = req;
	}

}
