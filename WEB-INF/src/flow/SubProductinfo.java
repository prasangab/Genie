package flow;

/**
 * This servlet is used to forward the request to the entry point of a
 * project callflow (subflow).
 * Last generated by Dialog Designer at: 2016-SEP-05  01:53:00 PM
 */
public class SubProductinfo extends com.avaya.sce.runtime.Subflow {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Dialog Designer at: 2016-SEP-05  01:53:00 PM
	 */
	public SubProductinfo() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the name of the subflow that is being invoked.  This name is used for
	 * determining the URL mapping for the the entry point of the subflow..
	 *
	 * @return the name of the subflow
	 * Last generated by Dialog Designer at: 2016-SEP-27  09:04:58 AM
	 */
	protected String getSubflowName() {
		return("SubProductInfo");
	}
	/**
	 * Returns the name of the mapping of sub flow exit points to the URL mappings
	 * of the servlets to return back to in the calling flow.
	 *
	 * @return map of sub flow exit points to servlets in the calling flow.
	 * Last generated by Dialog Designer at: 2016-SEP-27  09:04:58 AM
	 */
	protected java.util.Map<String,String> getExitPoints() {
		java.util.Map<String, String> exitPoints;
		exitPoints = new java.util.HashMap<String, String>();
		exitPoints.put("SubProductInfo-MainMenu", "serviceSelectPromptAndCollect");
		exitPoints.put("SubProductInfo-Exit", "Discoonect");
		return exitPoints;
	}
}
