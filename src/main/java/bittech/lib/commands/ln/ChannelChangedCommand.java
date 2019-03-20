package bittech.lib.commands.ln;

import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataResponse;

public class ChannelChangedCommand extends Command<ChannelChangedRequest, NoDataResponse> {

	public static ChannelChangedCommand createStub () {
		return new ChannelChangedCommand(new ChannelChangedRequest());
	}

	public ChannelChangedCommand(ChannelChangedRequest req) {
		request = req;
	}

}
