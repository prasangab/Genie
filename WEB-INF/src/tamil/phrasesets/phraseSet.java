package tamil.phrasesets;

/**
 * This phraseset class will be automatically populated with data from the 
 * phraseset project file.  Manual edits should only be outside of the tag 
 * areas or overridden methods. 
 * Class created on: 
 * Last generated by Dialog Designer at: 2016-AUG-05  10:58:01 AM
 */
public class phraseSet extends com.avaya.sce.runtime.Phraseset { 

	//{{START:CLASS:FIELDS
	private static final com.avaya.sce.runtime.Phraseset.PhraseMap PHRASE_MAP;
	//}}END:CLASS:FIELDS

	/**
	 * Static initializer
	 */
	static {
		//{{START:PHRASESET:STATIC

		// Create the phrase map, then populate with phrases
		PHRASE_MAP = new com.avaya.sce.runtime.Phraseset.PhraseMap(60);
		com.avaya.sce.runtime.Phrase phrase;

		// phrase: geniewelcome
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "geniewelcome", "geniewelcome.wav", ""); 

		// phrase: selectlang
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "selectlang", "selectlang.wav", ""); 

		// phrase: agent
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "agent", "agent.wav", ""); 

		// phrase: agentassistance
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "agentassistance", "agentassistance.wav", ""); 

		// phrase: geniem1
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "geniem1", "geniem1.wav", ""); 

		// phrase: geniem2
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "geniem2", "geniem2.wav", ""); 

		// phrase: geniem3
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "geniem3", "geniem3.wav", ""); 

		// phrase: geniem4
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "geniem4", "geniem4.wav", ""); 

		// phrase: geniem1info
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "geniem1info", "geniem1info.wav", ""); 

		// phrase: geniem2info
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "geniem2info", "geniem2info.wav", ""); 

		// phrase: geniem3info
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "geniem3info", "geniem3info.wav", ""); 

		// phrase: geniem4info1
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "geniem4info1", "geniem4info1.wav", ""); 

		// phrase: geniem4info2
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "geniem4info2", "geniem4info2.wav", ""); 

		// phrase: geniepayment
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "geniepayment", "geniepayment.wav", ""); 

		// phrase: genieservice
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "genieservice", "genieservice.wav", ""); 

		// phrase: lostphone
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "lostphone", "lostphone.wav", ""); 

		// phrase: merchants
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "merchants", "merchants.wav", ""); 

		// phrase: press9
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "press9", "press9.wav", ""); 

		// phrase: presshash
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "presshash", "presshash.wav", ""); 

		// phrase: pressstar
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "pressstar", "pressstar.wav", ""); 

		// phrase: productinfo
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "productinfo", "productinfo.wav", ""); 

		// phrase: promotions
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "promotions", "promotions.wav", ""); 

		// phrase: promotionsinfo
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "promotionsinfo", "promotionsinfo.wav", ""); 

		// phrase: geniem1list
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "geniem1list", "geniem1list.wav", ""); 

		// phrase: geniem3list
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "geniem3list", "geniem3list.wav", ""); 

		// phrase: pinfo
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "pinfo", "pinfo.wav", ""); 

		// phrase: noInput
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "noInput", "noInput.wav", ""); 

		// phrase: noMatch
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "noMatch", "noMatch.wav", ""); 

		// phrase: exceedmaxtries
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "exceedmaxtries", "exceedmaxtries.wav", ""); 

		// phrase: thanksforcalling
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "thanksforcalling", "thanksforcalling.wav", ""); 

		//}}END:PHRASESET:STATIC
	}
	/**
	 * Returns the Phrase with the given name.  To override the
	 * behavior and dynamically return a different Phrase object,
	 * override the method "hookGetPhrase(...)".
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Dialog Designer at: 2016-SEP-08  11:21:19 AM
	 * @see com.avaya.sce.runtime.Phraseset#getPhrase(String) 
	 */ 
	public com.avaya.sce.runtime.Phrase getPhrase(String phraseName) {
		return(getPhrase(phraseSet.PHRASE_MAP, phraseName));
	}
}
