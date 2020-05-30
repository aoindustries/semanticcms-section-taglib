/*
 * semanticcms-section-taglib - Sections nested within SemanticCMS pages and elements in a JSP environment.
 * Copyright (C) 2013, 2014, 2015, 2016, 2017, 2019, 2020  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of semanticcms-section-taglib.
 *
 * semanticcms-section-taglib is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * semanticcms-section-taglib is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with semanticcms-section-taglib.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.semanticcms.section.taglib.book;

import com.semanticcms.tagreference.TagReferenceInitializer;
import java.util.Collections;

public class SemanticCmsSectionTldInitializer extends TagReferenceInitializer {

	public SemanticCmsSectionTldInitializer() {
		super(
			Maven.properties.getProperty("project.name") + " Reference",
			"Taglib Reference",
			"/section/taglib",
			"/semanticcms-section.tld",
			Maven.properties.getProperty("documented.javadoc.link.javase"),
			Maven.properties.getProperty("documented.javadoc.link.javaee"),
			// Self
			Collections.singletonMap("com.semanticcms.section.taglib", Maven.properties.getProperty("project.url") + "apidocs/")
		);
	}
}
