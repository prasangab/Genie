package flow.subflow.SubMerchants;

/**
 * The Data class handles many types of server-side operations including data
 * collection (from a data sources such as a database, or web service), variable
 * assignments and operations (like copying variable values, performing mathematic
 * operations, and collection iteration), conditional evaluation to control callflow
 * execution based on variable values, and logging/tracing statements.
 * 
 * Items created in the getDataActions() method are executed/evaluated in order
 * and if a condional branch condition evaluates to "true" then the branch is
 * activated and the execution of data actions is halted.  If no "true" conditions
 * are encountered, then all data actions will be executed/evaluated and the 
 * application will proceed to the "Default" servlet.
 * Last generated by Dialog Designer at: 2016-AUG-10  09:53:48 AM
 */
public class merchantsData extends com.avaya.sce.runtime.Data {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Dialog Designer at: 2016-AUG-10  09:53:48 AM
	 */
	public merchantsData() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the Next item which will forward application execution
	 * to the next form in the call flow.
	 * Last generated by Dialog Designer at: 2016-SEP-08  11:21:21 AM
	 */
	public com.avaya.sce.runtime.Next getNext(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Next next = null;
		return next;
	}
	/**
	 * Creates and conditionally executes operations that have been configured
	 * in the Callflow.  This method will build a collection of operations and
	 * have the framework execute the operations by calling evaluateActions().
	 * If the evaluation causes the framework to forward to a different servlet
	 * then execution stops.
	 * Returning true from this method means that the framework has forwarded the
	 * request to a different servlet.  Returning false means that the default
	 * Next will be invoked.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Dialog Designer at: 2016-SEP-08  11:21:21 AM
	 */
	public boolean executeDataActions(com.avaya.sce.runtimecommon.SCESession mySession) throws Exception {
		java.util.Collection actions = null;

		actions = new java.util.ArrayList(2);
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("merchantsValue", "merchantsPromptAndCollect:value", false).setDebugId(118));
		actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_DEBUG, "merchant value", "merchantsValue").setDebugId(306));
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition1", "merchantsValue", com.avaya.sce.runtime.Condition.STRING_EQUAL, "1", false).setDebugId(11)).evaluate(mySession)) {
			actions = new java.util.ArrayList(2);
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_DEBUG, "merchant 1 selected", "merchantsValue").setDebugId(307));
			actions.add(new com.avaya.sce.runtime.Next("SubMerchants-merchant1PromptAndCollect", "option 1").setDebugId(12));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		}


		if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition2", "merchantsValue", com.avaya.sce.runtime.Condition.STRING_EQUAL, "2", false).setDebugId(32)).evaluate(mySession)) {
			actions = new java.util.ArrayList(2);
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_DEBUG, "merchant 2 selected", "merchantsValue").setDebugId(308));
			actions.add(new com.avaya.sce.runtime.Next("SubMerchants-merchant2PromptAndCollect", "option 2").setDebugId(34));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		}


		if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition3", "merchantsValue", com.avaya.sce.runtime.Condition.STRING_EQUAL, "3", false).setDebugId(33)).evaluate(mySession)) {
			actions = new java.util.ArrayList(2);
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_DEBUG, "merchant 3 selected", "merchantsValue").setDebugId(309));
			actions.add(new com.avaya.sce.runtime.Next("SubMerchants-merchant3PromptAndCollect", "option 3").setDebugId(35));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		}


		if(((com.avaya.sce.runtime.Condition)new com.avaya.sce.runtime.Condition("condition4", "merchantsValue", com.avaya.sce.runtime.Condition.STRING_EQUAL, "4", false).setDebugId(36)).evaluate(mySession)) {
			actions = new java.util.ArrayList(2);
			actions.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_DEBUG, "merchant 4 selected", "merchantsValue").setDebugId(310));
			actions.add(new com.avaya.sce.runtime.Next("SubMerchants-merchant4PromptAndCollect", "option 4").setDebugId(37));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;

		}

		actions = new java.util.ArrayList(1);
		actions.add(new com.avaya.sce.runtime.varoperations.Assign("checkMaxTries:noOfTries", "checkMaxTries:initialValue", false).setDebugId(189));
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		// return false if the evaluation of actions did not cause a servlet forward or redirect
		return false;
	}
}