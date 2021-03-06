/*
 * Copyright © 2017-2019 Bromine0x23 <bromine0x23@163.com>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See http://www.wtfpl.net/ for more details.
 */
package cn.bromine0x23.sgip.pdu;

import cn.bromine0x23.sgip.SgipConstants;
import lombok.EqualsAndHashCode;

/**
 * Unbind 命令
 *
 * @author <a href="mailto:bromine0x23@163.com">Bromine0x23</a>
 */
@SuppressWarnings("unused")
@EqualsAndHashCode(callSuper = true)
public class SgipUnbind extends SgipEmptyBody<SgipUnbindResp> {

	public SgipUnbind() {
		super(SgipConstants.COMMAND_ID_UNBIND, "Unbind");
	}

	@Override
	public SgipUnbindResp createResponse() {
		return new SgipUnbindResp();
	}

	@Override
	public Class<SgipUnbindResp> getResponseClass() {
		return SgipUnbindResp.class;
	}
}
