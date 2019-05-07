package bittech.lib.commands.ln.channels;

import bittech.lib.protocol.Request;
import bittech.lib.utils.Btc;

public class FindFastRouteRequest implements Request {
	
	public String sourceId;
	public String destId;
	public Btc amount;
	public int finalCltvDelta;
	public Btc fixedFeeLimt;
	public int percentFeeLimit;

	public FindFastRouteRequest() {
		// TODO Auto-generated constructor stub
	}

}
