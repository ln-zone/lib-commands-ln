package bittech.lib.commands.ln.onchain;

import bittech.lib.protocol.Command;
import bittech.lib.utils.Btc;

public class SendOnChainCommand extends Command<SendOnChainRequest, SendOnChainResponse> {
	
	public static SendOnChainCommand createStub () {
		return new SendOnChainCommand("", new Btc());
	}
	
	public SendOnChainCommand(String addr,  Btc amount) {
		this.request = new SendOnChainRequest(addr, amount);
	}
}
