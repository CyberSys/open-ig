/*
 * Copyright 2008-2013, David Karnok 
 * The file is part of the Open Imperium Galactica project.
 * 
 * The code should be distributed under the LGPL license.
 * See http://www.gnu.org/licenses/lgpl.html for details.
 */

package hu.openig.multiplayer.model;

import hu.openig.net.MessageObject;

/**
 * The answer of a successful login request.
 * @author akarnokd, 2013.04.22.
 */
public class WelcomeResponse implements MessageObjectIO {
	/** The assigned session id. */
	public String sessionId;
	@Override
	public void fromMessage(MessageObject mo) {
		sessionId = mo.getString("session");
	}
	@Override
	public MessageObject toMessage() {
		MessageObject mo = new MessageObject("WELCOME");
		
		mo.set("session", sessionId);
		
		return mo;
	}
}
