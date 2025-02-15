/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/search/tags/search-1.4.2/search-impl/impl/src/java/org/sakaiproject/search/indexer/api/IndexWorkerDocumentListener.java $
 * $Id: IndexWorkerDocumentListener.java 59685 2009-04-03 23:36:24Z arwhyte@umich.edu $
 ***********************************************************************************
 *
 * Copyright (c) 2003, 2004, 2005, 2006, 2007, 2008 The Sakai Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.osedu.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **********************************************************************************/

package org.sakaiproject.search.indexer.api;

/**
 * An IndexWorkerDocumentListener is notified as Documents are indexed
 * 
 * @author ieb
 */
public interface IndexWorkerDocumentListener
{

	/**
	 * Fired when a document starts to be indexed
	 * 
	 * @param worker
	 *        the worker performing the index operation
	 * @param ref
	 *        the document being indexed
	 */
	void indexDocumentStart(IndexWorker worker, String ref);

	/**
	 * fired when a document has completed indexing
	 * 
	 * @param worker
	 *        the worker performing the operation
	 * @param ref
	 *        a reference to the document
	 */
	void indexDocumentEnd(IndexWorker worker, String ref);

}
