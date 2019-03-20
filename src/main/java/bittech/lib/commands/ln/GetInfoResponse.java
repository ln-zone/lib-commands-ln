package bittech.lib.commands.ln;

import java.util.List;

import bittech.lib.protocol.Response;

public class GetInfoResponse implements Response {

	/*
	 * 
{
    "identity_pubkey": "03800a65b5f3365ccd4cba89e6e049bf95e1bf36445a1f18e18b2d2f0027127046",
    "alias": "03800a65b5f3365ccd4c",
    "num_pending_channels": 0,
    "num_active_channels": 0,
    "num_peers": 3,
    "block_height": 561094,
    "block_hash": "0000000000000000000bb92e1718be7933c2ce57bfed0ce4139b2c5577a8d44d",
    "synced_to_chain": true,
    "testnet": false,
    "chains": [
        "bitcoin"
    ],
    "uris": [
    ],
    "best_header_timestamp": "1549043896",
    "version": "0.5.1-beta commit=v0.5.2-beta-rc1-dirty",
    "num_inactive_channels": 0
}
	 * 
	 */
	
	public String identity_pubkey;
	public String alias;
	public int num_pending_channels;
	public int num_active_channels;
	public int num_peers;
	public int block_height;
	public String block_hash;
	public boolean synced_to_chain;
	public List<String> chains;
	public List<String> uris;
	public long best_header_timestamp;
	public String version;
	public int num_inactive_channels;
	
}
