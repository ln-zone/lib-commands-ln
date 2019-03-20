package bittech.lib.commands.ln.peers;

import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataResponse;

public class ConnectPeerCommand extends Command<ConnectPeerRequest, NoDataResponse> {
	
	public static ConnectPeerCommand createStub () {
		return new ConnectPeerCommand("");
	}
	
	public ConnectPeerCommand(String uri) {
		this.request = new ConnectPeerRequest(uri);
	}
}
