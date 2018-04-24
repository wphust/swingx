import java.io.InputStream;

import org.junit.Test;

import junit.framework.Assert;

public class GetResourcesTest {
	@Test
	public void testGetDemoList() {
		InputStream res = getClass().getResourceAsStream("/META-INF/demolist");
		Assert.assertNotNull(res);
	}
}
