package bittech.lib.commands.ln;

import bittech.lib.protocol.Command;
import bittech.lib.utils.Btc;

public class LnChargeCommand extends Command<LnChargeRequest, LnChargeResponse> {

	public static LnChargeCommand createStub () {
		return new LnChargeCommand("request" + Math.random()*Long.MAX_VALUE, new Btc(""), "");
	}
	
	public LnChargeCommand(final String requestId, final Btc amount, final String addr) {
		request = new LnChargeRequest(requestId, amount, addr);
	}

}
