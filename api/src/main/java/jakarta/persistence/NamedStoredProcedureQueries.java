/*
 * Copyright (c) 2011, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//     Linda DeMichiel - 2.1

package jakarta.persistence; 

import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Specifies multiple named stored procedure queries.  Query names
 * are scoped to the persistence unit.  The {@code NamedStoredProcedureQueries} 
 * annotation can be applied to an entity or mapped superclass.
 *
 * @see NamedStoredProcedureQuery
 *
 * @since 2.1
 */
@Target({TYPE}) 
@Retention(RUNTIME)
public @interface NamedStoredProcedureQueries { 

    /** (Required) Array of {@code NamedStoredProcedureQuery} annotations. */
    NamedStoredProcedureQuery[] value ();
}
