/*
 * Copyright © 2017-2019 Bromine0x23 <bromine0x23@163.com>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See http://www.wtfpl.net/ for more details.
 */
package cn.bromine0x23.sgip;

import lombok.Getter;

/**
 * Created by BR on 17/11/9.
 *
 * @author <a href="mailto:bromine0x23@163.com">Bromine0x23</a>
 */
@SuppressWarnings("unused")
public enum SgipLoginType {
	SP_TO_SMG(SgipConstants.LOGIN_TYPE_SP_TO_SMG),
	SMG_TO_SP(SgipConstants.LOGIN_TYPE_SMG_TO_SP),
	SMG_TO_SMG(SgipConstants.LOGIN_TYPE_SMG_TO_SMG),
	SMG_TO_GNS(SgipConstants.LOGIN_TYPE_SMG_TO_GNS),
	GNS_TO_SMG(SgipConstants.LOGIN_TYPE_GNS_TO_SMG),
	GNS_TO_GNS(SgipConstants.LOGIN_TYPE_GNS_TO_GNS),
	TEST(SgipConstants.LOGIN_TYPE_TEST);

	@Getter
	private final byte code;

	SgipLoginType(byte code) {
		this.code = code;
	}

}
