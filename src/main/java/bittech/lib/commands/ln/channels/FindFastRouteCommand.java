package bittech.lib.commands.ln.channels;

import bittech.lib.protocol.Command;
import bittech.lib.utils.Btc;
import bittech.lib.utils.Require;

public class FindFastRouteCommand extends Command<FindRouteRequest, FindRouteResponse> {

	public static FindFastRouteCommand createStub () {
		return new FindFastRouteCommand("031c1666c5272e57582b721eba80a579879900563ee5472165de8da4b4ff155ef6", "", Btc.noValue(), false, 144);
	}

	public FindFastRouteCommand(String sourceId, String destId, Btc amount, boolean feeIncluded, int finalCltvDelta) {
		request = new FindRouteRequest();
		request.sourceId = Require.notNull(sourceId, "sourceId");
		request.destId = Require.notNull(destId, "destId");
		request.amount = Require.notNull(amount, "amount");
		request.feeIncluded = feeIncluded;
		request.finalCltvDelta = finalCltvDelta;
//		request.fixedFeeLimt = Require.notNull(fixedFeeLimt, "fixedFeeLimt");
//		request.percentFeeLimit = Require.notNull(percentFeeLimit, "percentFeeLimit");
	}

}
