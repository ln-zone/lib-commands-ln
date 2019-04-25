package bittech.lib.commands.ln.channels;

import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataResponse;
import bittech.lib.utils.Require;

public class PayToRouteCommand extends Command<PayToRouteRequest, NoDataResponse> {

	public static PayToRouteCommand createStub () {
		return new PayToRouteCommand("", new Route());
	}

	public PayToRouteCommand(String paymentHash, Route route) {
		request = new PayToRouteRequest();
		request.paymentHash = Require.notNull(paymentHash, "paymentHash");
		request.route = Require.notNull(route, "route");
	}

}
