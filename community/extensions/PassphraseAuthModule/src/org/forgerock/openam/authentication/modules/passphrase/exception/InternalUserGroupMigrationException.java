/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright © 2012 ForgeRock Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the License). You may not use this file except in
 * compliance with the License.
 *
 * You can obtain a copy of the License at
 * http://forgerock.org/license/CDDLv1.0.html
 * See the License for the specific language governing
 * permission and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL
 * Header Notice in each file and include the License file
 * at http://forgerock.org/license/CDDLv1.0.html
 * If applicable, add the following below the CDDL Header,
 * with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [2012] [Forgerock AS]"
 */

package org.forgerock.openam.authentication.modules.passphrase.exception;

public class InternalUserGroupMigrationException extends Exception{

	public InternalUserGroupMigrationException()
	{
		super();
	}

	public InternalUserGroupMigrationException(String msg)
	{
		super(msg);
	}

	public InternalUserGroupMigrationException(Throwable cause)
	{
		super(cause);
	}

	public InternalUserGroupMigrationException(String msg, Throwable cause)
	{
		super(msg, cause);
	}

}
