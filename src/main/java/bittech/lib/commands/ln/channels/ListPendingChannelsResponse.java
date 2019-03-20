package bittech.lib.commands.ln.channels;

import java.util.List;

import bittech.lib.commands.ln.channels.ListChannelsResponse.Channel;
import bittech.lib.protocol.Response;
import bittech.lib.utils.Btc;

public class ListPendingChannelsResponse implements Response {

	public static class PendingOpenChannel extends Channel {
		public int confirmation_height; // The height at which this channel will be confirmed
		public Btc commit_fee; // The amount calculated to be paid in fees for the current set of commitment
								// transactions. The fee amount is persisted with the channel in order to allow
								// the fee amount to be removed and recalculated with each channel state update,
								// including updates that happen after a system restart.
		public long commit_weight; // The weight of the commitment transaction
		public Btc fee_per_kw; // The required number of satoshis per kilo-weight that the requester will pay
								// at all times, for both the funding transaction and commitment transaction.
								// This value can later be updated once the channel is open.
	}

	public static class ClosedChannel extends Channel {
		public String closing_txid; // The transaction id of the closing transaction
	}

	public static class PendingHTLC extends Channel {
		public boolean incoming; // The direction within the channel that the htlc was sent
		public Btc amount; // The total value of the htlc
		public String outpoint; // The final output to be swept back to the user’s wallet
		public int maturity_height; // The next block height at which we can spend the current stage
		public int blocks_til_maturity; // The number of blocks remaining until the current stage can be swept. Negative
									// values indicate how many blocks have passed since becoming mature.
		public int stage; // Indicates whether the htlc is in its first or second stage of recovery
	}

	public static class ForceClosedChannel extends Channel {
		public String closing_txid; // The transaction id of the closing transaction
		public Btc limbo_balance; // The balance in satoshis encumbered in this pending channel
		public int maturity_height; // The height at which funds can be sweeped into the wallet
		public int blocks_til_maturity; // Remaining # of blocks until the commitment output can be swept. Negative
									// values indicate how many blocks have passed since becoming mature.
		public Btc recovered_balance; // The total value of funds successfully recovered from this channel
		public List<PendingHTLC> pending_htlcs;
	}

	public static class WaitingCloseChannel extends Channel {
		public Btc limbo_balance; // The balance in satoshis encumbered in this channel
	}

	public Btc total_limbo_balance; // The balance in satoshis encumbered in pending channels
	public List<PendingOpenChannel> pending_open_channels; // Channels pending opening
	public List<ClosedChannel> pending_closing_channels; // Channels pending closing
	public List<ForceClosedChannel> pending_force_closing_channels; // Channels pending force closing
	public List<WaitingCloseChannel> waiting_close_channels; // Channels waiting for closing tx to confirm

}
