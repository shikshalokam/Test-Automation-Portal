package com.sikshalokam.utils.logger;

import com.sikshalokam.constants.IAutoConst;

/**
 * Created by Qualitrix Technologies Pvt Ltd.
 * 
 * @author: Sunil H N Date: 13/02/2022 Purpose: To initilize debug logs for
 *          Debugging and Trobleshooting
 */

public class DebugLogger {

	private static Logger logger;

	public static ILogger debugLogger() {
		if (logger == null)
			logger = new Logger(IAutoConst.DEBUG_LOG_PATH);
		return logger;
	}

}
