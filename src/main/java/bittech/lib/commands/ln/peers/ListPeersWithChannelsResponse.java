package bittech.lib.commands.ln.peers;

import java.util.List;

import bittech.lib.commands.ln.channels.ListChannelsResponse.ActiveChannel;
import bittech.lib.commands.ln.channels.ListPendingChannelsResponse.ClosedChannel;
import bittech.lib.commands.ln.channels.ListPendingChannelsResponse.ForceClosedChannel;
import bittech.lib.commands.ln.channels.ListPendingChannelsResponse.PendingOpenChannel;
import bittech.lib.commands.ln.channels.ListPendingChannelsResponse.WaitingCloseChannel;
import bittech.lib.protocol.Response;
import bittech.lib.utils.Btc;

public class ListPeersWithChannelsResponse implements Response {

	public static class Peer {
		public String id; // The identity pubkey of the peer
		public String address; // Network address of the peer; eg 127.0.0.1:10011
		public long bytesSent; // Bytes of data transmitted to this peer
		public long bytesReceived; // Bytes of data transmitted from this peer
		public Btc sentAmount; // Satoshis sent to this peer
		public Btc receivedAmount; // Satoshis received from this peer
		public boolean inbound; // A channel is inbound if the counterparty initiated the channel
		public long pingTime; // Ping time to this peer
		
		public List<PendingOpenChannel> pending_open_channels; // Channels pending opening
		public List<ActiveChannel> openedChannels;
		public List<ClosedChannel> pending_closing_channels; // Channels pending closing
		public List<ForceClosedChannel> pending_force_closing_channels; // Channels pending force closing
		public List<WaitingCloseChannel> waiting_close_channels; // Channels waiting for closing tx to confirm

		
	}

	public List<Peer> peers;

}
