package bittech.lib.commands.ln.onchain;

import bittech.lib.protocol.Response;
import bittech.lib.utils.Btc;

public class WalletBalanceResponse implements Response {

    public Btc total_balance;
    public Btc confirmed_balance;
    public Btc unconfirmed_balance;

	
}
