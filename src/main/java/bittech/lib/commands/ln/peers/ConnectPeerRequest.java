package bittech.lib.commands.ln.peers;

import bittech.lib.protocol.Request;
import bittech.lib.utils.Require;

public class ConnectPeerRequest implements Request {
	
	public String uri;
	
	public ConnectPeerRequest(String uri) {
		this.uri = Require.notNull(uri, "uri");
	}

}
