/*******************************************************************************
 * Copyright (c) 2009, 2017 Mountainminds GmbH & Co. KG and Contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Vladimir Farafonov - initial API and implementation
 *
 *******************************************************************************/
package org.jacoco.core.internal.analysis.filter.classfilter;

import org.jacoco.core.internal.analysis.filter.ExcludeAnnotationConst;

public class ExcludeAnnotationClassFilter
		extends AbstractAnnotationClassFilter {

	public ExcludeAnnotationClassFilter() {
		super(ExcludeAnnotationConst.ANNOTATION_EXCLUDE);
	}

}
