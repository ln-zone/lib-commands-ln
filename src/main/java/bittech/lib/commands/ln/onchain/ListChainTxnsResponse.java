package bittech.lib.commands.ln.onchain;

import java.util.LinkedList;
import java.util.List;

import bittech.lib.protocol.Response;
import bittech.lib.utils.Btc;

public class ListChainTxnsResponse implements Response {

/**
 * 
 * {
    "transactions": [
        {
            "tx_hash": "e344e5f4423ec26dedbb841572bc018b5e93061e428c4f148b3f17f9b71f552a",
            "amount": "100000",
            "num_confirmations": 427,
            "block_hash": "000000000000000000271b4f0370cdb2332a91e0f9133e54b67f1f01401cba6e",
            "block_height": 561100,
            "time_stamp": "1549046621",
            "total_fees": "0",
            "dest_addresses": [
                "bc1qggg5ngr5gqtvjz43wrkc5yxd5lg6u5jw4x27ly",
                "16MwppwLB9s5dwoSuCqj5vdPYMvpB3sTw1"
            ]
        },
        {
            "tx_hash": "41c9cd1492ae2e56c509bf4d2a5d15aa6169858a7ce50b683894cbe00a35d5b4",
            "amount": "100000",
            "num_confirmations": 0,
            "block_hash": "",
            "block_height": 0,
            "time_stamp": "1549297558",
            "total_fees": "0",
            "dest_addresses": [
            ]
        }
    ]
}

 * 
 */

	public static class OnchainTransaction {
        public String tx_hash;
        public Btc amount;
        public int num_confirmations;
        public String block_hash;
        public int block_height;
        public long time_stamp;
        public Btc total_fees;
        public List<String> dest_addresses;
	}
	
	public List<OnchainTransaction> transactions = new LinkedList<OnchainTransaction>();
	
}
