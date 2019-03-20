package bittech.lib.commands.ln;

import bittech.lib.protocol.Request;
import bittech.lib.utils.Require;

public class UnlockWalletRequest implements Request {
	
	public String password;
	
	public UnlockWalletRequest(String password) {
		this.password = Require.notNull(password, "password");
	}

}
