package bittech.lib.commands.ln.onchain;

import java.util.List;

import bittech.lib.protocol.Response;
import bittech.lib.utils.Btc;

public class ListUnspentResponse implements Response {

	public static class Utxo {
		String type; // The type of address
		String address; // string The address
		Btc amount; // amount_sat int64 The value of the unspent coin in satoshis
		String scriptPubkey; // string The scriptpubkey in hex
		String txId;
		int txIndex;
		long confirmations; // The number of confirmations for the Utxo
	}

	public List<Utxo> list;

}
