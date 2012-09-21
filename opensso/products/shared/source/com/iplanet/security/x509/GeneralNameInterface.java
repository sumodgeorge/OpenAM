/**
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2005 Sun Microsystems Inc. All Rights Reserved
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
 * $Id: GeneralNameInterface.java,v 1.2 2008/06/25 05:52:46 qcheng Exp $
 *
 */

package com.iplanet.security.x509;

import java.io.IOException;

import com.iplanet.security.util.DerOutputStream;

/**
 * This interface specifies the abstract methods which have to be implemented by
 * all the members of the GeneralNames ASN.1 object.
 */
public interface GeneralNameInterface {
    /**
     * The list of names supported.
     */
    public static final int NAME_ANY = 0;

    public static final int NAME_RFC822 = 1;

    public static final int NAME_DNS = 2;

    public static final int NAME_X400 = 3;

    public static final int NAME_DIRECTORY = 4;

    public static final int NAME_EDI = 5;

    public static final int NAME_URI = 6;

    public static final int NAME_IP = 7;

    public static final int NAME_OID = 8;

    /**
     * Return the type of the general name, as defined above.
     */
    int getType();

    /**
     * Encode the name to the specified DerOutputStream.
     * 
     * @param out
     *            the DerOutputStream to encode the GeneralName to.
     * @exception IOException
     *                thrown if the GeneralName could not be encoded.
     */
    void encode(DerOutputStream out) throws IOException;
}
