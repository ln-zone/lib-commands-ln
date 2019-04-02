package bittech.lib.commands.ln.onchain;

import java.util.List;

import bittech.lib.protocol.Response;
import bittech.lib.utils.Btc;

public class ListUnspentResponse implements Response {

	public static class Utxo {
		public String type; // The type of address
		public String address; // string The address
		public Btc amount; // amount_sat int64 The value of the unspent coin in satoshis
		public String scriptPubkey; // string The scriptpubkey in hex
		public String txId;
		public int txIndex;
		public long confirmations; // The number of confirmations for the Utxo
	}

	public List<Utxo> list;

}
