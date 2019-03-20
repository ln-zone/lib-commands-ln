package bittech.lib.commands.ln.peers;

import java.util.List;

import bittech.lib.protocol.Response;
import bittech.lib.utils.Btc;

public class ListPeersResponse implements Response {

	public static class Peer {
		public String id; // The identity pubkey of the peer
		public String address; // Network address of the peer; eg 127.0.0.1:10011
		public long bytesSent; // Bytes of data transmitted to this peer
		public long bytesReceived; // Bytes of data transmitted from this peer
		public Btc sentAmount; // Satoshis sent to this peer
		public Btc receivedAmount; // Satoshis received from this peer
		public boolean inbound; // A channel is inbound if the counterparty initiated the channel
		public long pingTime; // Ping time to this peer
	}

	public List<Peer> peers;

}
