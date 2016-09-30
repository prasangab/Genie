package flow.subflow.SubMerchants;

/**
 * Class that represents a form.  A form can contain prompts, fields  and links
 * as well as handlers for various events that may occur while the form is executing
 * Last generated by Dialog Designer at: 2016-AUG-17  09:34:34 PM
 */
public class merchant1PromptAndCollect extends com.avaya.sce.runtime.Form {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Dialog Designer at: 2016-AUG-17  09:34:34 PM
	 */
	public merchant1PromptAndCollect() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * This method is generated automatically and should not be manually edited.
	 * To manually edit the links for the node, override:
	 *     void updateLinks(Collection links, SCESession mySession)
	 * Last generated by Dialog Designer at: 2016-SEP-08  11:21:21 AM
	 * @return a collection of links
	 */
	public java.util.Collection getLinks(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Link link;
		java.util.List list;
		java.util.Collection grammarInfo = null;
		java.util.Collection<com.avaya.sce.runtime.CaptureExpression> captureExpr = null;
		// This item does not have any defined links
		list = new java.util.ArrayList();

		return(list);
	}
	/**
	 * This method is generated automatically and should not be manually edited.
	 * To manually edit the properties for the node, override:
	 *     void updateProperties(Collection properties, SCESession mySession)
	 * Last generated by Dialog Designer at: 2016-SEP-08  11:21:21 AM
	 * @return a collection of properties
	 */
	public java.util.Collection getProperties(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Property property;
		java.util.List list;
		// This item does not have any defined properties
		list = new java.util.ArrayList();

		return(list);
	}
	/**
	 * This method is generated automatically and should not be manually edited.
	 * To manually edit the event handlers for the node, override:
	 *    void updateEvents(Collection events, SCESession mySession)
	 * Last generated by Dialog Designer at: 2016-SEP-08  11:21:21 AM
	 * @return a collection of Events
	 */
	public java.util.Collection getEvents(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list;
		com.avaya.sce.runtime.Event event;
		list = new java.util.ArrayList();
		return(list);
	}
	/**
	 * Builds the list of fields for the form.  This list is built
	 * by the code generator based on items in the call flow editor.
	 * This method should not be manually edited as changes may be
	 * overwritten by the code generator.  <br>
	 * To update the fields for the form, override
	 *     public void updateFields(Collection fields, com.avaya.sce.runtimecommon.SCESession mySession)
	 * Last generated by Dialog Designer at: 2016-SEP-08  11:21:21 AM
	 */
	public java.util.Collection getFields(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		java.util.List promptNames = null;
		java.util.List grammarInfo = null;
		java.util.List events = null;
		java.util.List properties = null;
		com.avaya.sce.runtime.Field field = null;
		com.avaya.sce.runtime.Event event = null;
		com.avaya.sce.runtime.Property property = null;

		list = new java.util.ArrayList(1);

		// build prompt names for field: "merchant1PromptAndCollect"
		promptNames = new java.util.ArrayList();
		promptNames.add("prMerchant1");

		// build the list of grammar information objects for the field
		grammarInfo = new java.util.ArrayList(1);
		grammarInfo.add(new com.avaya.sce.runtime.GrammarInfo("grMerchants1", "1.0"));

		// build events for the field: "merchant1PromptAndCollect"
		events = new java.util.ArrayList(2);
		event = new com.avaya.sce.runtime.Event(com.avaya.sce.runtimecommon.SCERT.EVENT_NOINPUT, "prMerchant1NoInput", new com.avaya.sce.runtime.Goto("SubMerchants-merchant1PromptAndCollect", 0, true, ""));
		events.add(event);
		event = new com.avaya.sce.runtime.Event(com.avaya.sce.runtimecommon.SCERT.EVENT_NOMATCH, (String)null, new com.avaya.sce.runtime.Goto("SubMerchants-merchant1ExtraData", 0, true, ""));
		events.add(event);
		properties = new java.util.ArrayList();

		field = new com.avaya.sce.runtime.Field("merchant1PromptAndCollect", false, true, grammarInfo, promptNames, events, properties, 1, false, false);
		list.add(field);

		return(list);
	}
	/**
	 * Builds the list of prompts that are used by this flow item<br>
	 * This method is generated automatically and changes to it may
	 * be overwritten next time code is generated.  To modify the list
	 * of prompts for the flow item, override:
	 *     updatePrompts(Collection prompts, SCESession mySession)
	 * @return list of prompts for the menu
	 * Last generated by Dialog Designer at: 2016-SEP-08  11:21:21 AM
	 */
	public java.util.Collection getPrompts(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;

		// Item has no prompts associated
		list = new java.util.ArrayList();

		return(list);
	}
	/**
	 * Returns the submit item that identifies the next form to transition to.
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Dialog Designer at: 2016-SEP-08  11:21:21 AM
	 */
	public com.avaya.sce.runtime.Submit getSubmit(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Submit submit = null;
		submit = new com.avaya.sce.runtime.Submit("SubMerchants-merchant1Data");
		return submit;
	}
	/**
	 * Returns the record item for the form.
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Dialog Designer at: 2016-SEP-08  11:21:21 AM
	 */
	public com.avaya.sce.runtime.Record getRecord(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Record record = null;
		java.util.Collection events = null;
		java.util.Collection promptNames = null;
		java.util.Collection grammarInfo = null;
		com.avaya.sce.runtime.Event event = null;
		return record;
	}
	/**
	 * Returns the transfer item for the form.
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Dialog Designer at: 2016-SEP-08  11:21:21 AM
	 */
	public com.avaya.sce.runtime.Transfer getTransfer(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Transfer transfer = null;
		return transfer;
	}
	/**
	 * Returns a Throw object that will throw an event at runtime if set.
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Dialog Designer at: 2016-SEP-08  11:21:21 AM
	 */
	public com.avaya.sce.runtime.Throw getThrow(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Throw event = null;
		return event;
	}
	/**
	 * Builds the list of tracking items that are generated by this flow item<br>
	 * This method is generated automatically and changes to it may
	 * be overwritten next time code is generated.
	 * @return list of tracking items for the item
	 * Last generated by Dialog Designer at: 2016-SEP-08  11:21:21 AM
	 */
	public java.util.Collection getTrackingActions(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		list = new java.util.ArrayList(1);

		list.add(new com.avaya.sce.runtime.tracking.TraceInfo(com.avaya.sce.runtimecommon.ITraceInfo.TRACE_LEVEL_DEBUG, "merchant 1 p&c", "merchantsValue"));
		return(list);
	}
	/**
	 * Returns a collection of platform objects, or extensions to VXML.
	 * These objects result in the generation of the VXML object tag that
	 * the VXML platform attempts to use to load the runtime library that implements
	 * the extension.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Dialog Designer at: 2016-SEP-08  11:21:21 AM
	 */
	public java.util.Collection getPlatformObjects(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.Collection objectList = null;
		java.util.Collection promptNames = null;
		com.avaya.sce.runtime.PlatformObject platformObject = null;

		// Form has no extension objects defined
		objectList = new java.util.ArrayList();
		return(objectList);
	}
}