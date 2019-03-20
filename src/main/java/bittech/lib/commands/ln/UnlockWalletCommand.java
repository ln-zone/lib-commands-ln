package bittech.lib.commands.ln;

import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataResponse;

public class UnlockWalletCommand extends Command<UnlockWalletRequest, NoDataResponse> {
	
	public static UnlockWalletCommand createStub () {
		return new UnlockWalletCommand("");
	}
	
	public UnlockWalletCommand(String password) {
		this.request = new UnlockWalletRequest(password);
	}
}
