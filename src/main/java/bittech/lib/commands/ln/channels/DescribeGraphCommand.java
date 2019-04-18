package bittech.lib.commands.ln.channels;

import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataRequest;

public class DescribeGraphCommand extends Command<NoDataRequest, DescribeGraphResponse> {

	public static DescribeGraphCommand createStub () {
		return new DescribeGraphCommand();
	}

	public DescribeGraphCommand() {
		this.request = new NoDataRequest();
	}

}
