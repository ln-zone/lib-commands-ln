package bittech.lib.commands.ln.channels;

import bittech.lib.utils.Btc;

public class Hop {
	public long channelId;
	public Btc channelCapacity;
	public Btc amountToForward;
	public Btc fee;
	public int expiry;
	public String pubKey;
}
