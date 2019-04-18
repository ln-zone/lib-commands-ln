package bittech.lib.commands.ln.channels;

import java.util.List;

import bittech.lib.protocol.Response;

public class DescribeGraphResponse implements Response {

	public static class NodeAddress {
		public String network;
		public String addr;
	}
	
	public static class NodeInGraph {
		public String id;	
		public int lastUpdate;
		public String alias;	
		public List<NodeAddress> addresses;	
		public String color;
	}
	
	public static class RoutingPolicy {
		public int time_lock_delta;
		public long min_htlc;
		public long fee_base_msat;
		public long fee_rate_milli_msat;
		public boolean disabled;	
		public long max_htlc_msat;
	}

	public static class ChannelInGraph {
		public long id;
		public String point;
		public int last_update;
		public String node1Id;
		public String node2Id;
		public long capacitySat;
		public RoutingPolicy node1_policy;
		public RoutingPolicy node2_policy;
	}

	public List<NodeInGraph> nodes;
	public List<ChannelInGraph> channels;

}
