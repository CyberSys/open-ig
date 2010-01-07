/*
 * Copyright 2008-2009, David Karnok 
 * The file is part of the Open Imperium Galactica project.
 * 
 * The code should be distributed under the LGPL license.
 * See http://www.gnu.org/licenses/lgpl.html for details.
 */

package hu.openig.v1.model;

/**
 * @author karnokd, 2010.01.07.
 * @version $Revision 1.0$
 */
public enum FleetKnowledge {
	/** The fleet is visible, but nothing else is known. */
	VISIBLE,
	/** The fleet composition is known, but not the numbers. */
	COMPOSITION,
	/** The fleet composition, numbers and firepower is known. */
	FULL
}
