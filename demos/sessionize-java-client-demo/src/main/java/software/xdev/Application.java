package software.xdev;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import software.xdev.sessionize.api.AllApi;
import software.xdev.sessionize.api.SessionsApi;
import software.xdev.sessionize.api.SpeakersApi;
import software.xdev.sessionize.client.ApiClient;


public final class Application
{
	public static final Logger LOG = LoggerFactory.getLogger(Application.class);
	public static final String TEST_ENDPOINT_ID = "jl4ktls0";
	
	@SuppressWarnings("java:S2629") // Just a demo
	public static void main(final String[] args)
	{
		final CustomApiClient apiClient = new CustomApiClient();
		
		LOG.info("*** Speakers-Endpoint ***");
		new SpeakersApi(apiClient).getAllSpeakers(TEST_ENDPOINT_ID)
			.forEach(x -> LOG.info(x.toString()));
		
		LOG.info("*** Sessions-Endpoint ***");
		new SessionsApi(apiClient).getAllSessions(TEST_ENDPOINT_ID)
			.forEach(x -> LOG.info(x.toString()));
		
		LOG.info("*** All-Endpoint ***");
		LOG.info(new AllApi(apiClient).getAll(TEST_ENDPOINT_ID).toString());
	}
	
	public static class CustomApiClient extends ApiClient
	{
		@SuppressWarnings("checkstyle:MagicNumber") // timeout
		public CustomApiClient()
		{
			this.setConnectTimeout(30_000);
			this.setUserAgent("Sessionize-Java-Client-Demo");
		}
	}
	
	private Application()
	{
	}
}
