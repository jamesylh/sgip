package cn.bromine0x23.sgip.pdu;

import io.netty.buffer.ByteBuf;

/**
 * 空消息体请求
 *
 * @author <a href="mailto:bromine0x23@163.com">Bromine0x23</a>
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public abstract class SgipEmptyBody<TResponse extends SgipPduResponse> extends SgipPduRequest<TResponse> {

	protected SgipEmptyBody(int commandId, String name) {
		super(commandId, name);
	}

	@Override
	protected int calculateByteSizeOfBody() {
		return 0;
	}

	@Override
	public void readBody(ByteBuf buffer) {
	}

	@Override
	public void writeBody(ByteBuf buffer) {
	}

	@Override
	protected void appendBodyToString(StringBuilder builder) {
	}
}
