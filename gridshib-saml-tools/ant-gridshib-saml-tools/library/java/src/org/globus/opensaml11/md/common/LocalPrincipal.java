/*
 * Copyright [2005] [University Corporation for Advanced Internet Development, Inc.]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.globus.opensaml11.md.common;

import java.io.Serializable;
import java.security.Principal;

/**
 * Shibboleth basic <code>Principal</code> ipmlementation for internal use.
 * 
 * @author Walter Hoehn (wassa@columbia.edu)
 */

public class LocalPrincipal implements Principal, Serializable {

	static final long serialVersionUID = 1L;
	private String principalName;

	/**
	 * Constructor for LocalPrincipal.
	 */

	public LocalPrincipal(String principalName) {

		this.principalName = principalName;
	}

	/**
	 * @see java.security.Principal#getName()
	 */

	public String getName() {

		return principalName;
	}

	/**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object obj) {

		if (!(obj instanceof LocalPrincipal)) { return false; }
		return ((LocalPrincipal) obj).getName().equals(getName());
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {

		return "LocalPrincipal".hashCode() + principalName.hashCode();
	}

}
