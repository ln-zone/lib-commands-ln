package bittech.lib.commands.ln.onchain;

import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataRequest;

public class WalletBalanceCommand extends Command<NoDataRequest, WalletBalanceResponse> {
	
	public static WalletBalanceCommand createStub () {
		return new WalletBalanceCommand();
	}
	
	public WalletBalanceCommand() {
		this.request = new NoDataRequest();
	}
}
