/**
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2007 Sun Microsystems Inc. All Rights Reserved
 *
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the License). You may not use this file except in
 * compliance with the License.
 *
 * You can obtain a copy of the License at
 * https://opensso.dev.java.net/public/CDDLv1.0.html or
 * opensso/legal/CDDLv1.0.txt
 * See the License for the specific language governing
 * permission and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL
 * Header Notice in each file and include the License file
 * at opensso/legal/CDDLv1.0.txt.
 * If applicable, add the following below the CDDL Header,
 * with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * $Id: PWResetSuccessModelImpl.java,v 1.2 2008/06/25 05:43:43 qcheng Exp $
 *
 *    "Portions Copyrighted [2012] [Forgerock AS]"
 */

package org.forgerock.openam.authentication.modules.passphrase.ui.model;

/**
 * <code>PWResetSuccessModelImpl</code> defines a set of methods that are
 * required by password reset success viewbean.
 */
public class PPResetSuccessModelImpl extends PPResetModelImpl implements PPResetSuccessModel {

	/**
	 * Constructs a password reset success model object
	 * 
	 */
	public PPResetSuccessModelImpl() {
		super();
	}

	/**
	 * Returns title string for password reset.
	 * 
	 * @return title string for password reset.
	 */
	public String getTitleString() {
		return getLocalizedString("ppResetSuccess.title");
	}
}