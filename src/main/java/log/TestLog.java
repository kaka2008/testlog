package log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TestLog {
	private static Log logger = LogFactory.getLog(TestLog.class);

	private static void test() {
		try {
			int a = 0 / 0;
		} catch (Exception e) {
			logger.error("分母是0", e);
			logger.info("info...");
			logger.debug("debug...");
			logger.warn("warn...");
		}
	}

	public static void main(String[] args) {
		test();
	}
}
