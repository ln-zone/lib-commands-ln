package bittech.lib.commands.ln.onchain;

import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataResponse;
import bittech.lib.utils.Btc;

public class FundsReceivedCommand extends Command<FundsReceivedRequest, NoDataResponse> {
	
	public static FundsReceivedCommand createStub () {
		return new FundsReceivedCommand("", new Btc());
	}
	
	public FundsReceivedCommand(String address, Btc amount) {
		this.request = new FundsReceivedRequest(address, amount);
	}
}
