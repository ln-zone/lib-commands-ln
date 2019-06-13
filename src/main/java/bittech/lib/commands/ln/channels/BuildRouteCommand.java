package bittech.lib.commands.ln.channels;

import java.util.LinkedList;
import java.util.List;

import bittech.lib.protocol.Command;
import bittech.lib.utils.Btc;
import bittech.lib.utils.Require;

public class BuildRouteCommand extends Command<BuildRouteRequest, BuildRouteResponse> {

	public static BuildRouteCommand createStub () {
		return new BuildRouteCommand("", new LinkedList<String>(), Btc.noValue(), 144);
	}

	public BuildRouteCommand(String firstNodeId, List<String> channelIds, Btc amount, int finalCltvDelta) {
		request = new BuildRouteRequest();
		request.firstNodeId = Require.notNull(firstNodeId, "firstNodeId");
		request.channelsIds = Require.notNull(channelIds, "channelIds");
		request.amount = Require.notNull(amount, "amount");
		request.finalCltvDelta = finalCltvDelta;
	}

}
