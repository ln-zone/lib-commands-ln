package bittech.lib.commands.ln.channels;

import java.util.List;

import bittech.lib.protocol.Request;
import bittech.lib.utils.Btc;

public class BuildRouteRequest implements Request {
	
	public String firstNodeId;
	public List<String> channelsIds;
	public Btc amount;
	public int finalCltvDelta;
	
	public BuildRouteRequest() {
		// TODO Auto-generated constructor stub
	}

}
