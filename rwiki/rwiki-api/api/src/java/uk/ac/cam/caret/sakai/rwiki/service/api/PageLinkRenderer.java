/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/rwiki/tags/sakai-2.9.2/rwiki-api/api/src/java/uk/ac/cam/caret/sakai/rwiki/service/api/PageLinkRenderer.java $
 * $Id: PageLinkRenderer.java 15276 2006-09-27 11:41:44Z andrew@caret.cam.ac.uk $
 ***********************************************************************************
 *
 * Copyright (c) 2003, 2004, 2005, 2006 The Sakai Foundation.
 *
 * Licensed under the Educational Community License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.opensource.org/licenses/ecl1.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **********************************************************************************/

package uk.ac.cam.caret.sakai.rwiki.service.api;

/**
 * A page link render renders links for the render engine
 * 
 * @author andrew
 */
// FIXME: Service
public interface PageLinkRenderer
{
	/**
	 * create a view link by appending it to the buffer
	 * 
	 * @param buffer
	 * @param name
	 * @param view
	 */
	void appendLink(StringBuffer buffer, String name, String view);

	/**
	 * Create a view link with an anchor by appending it to the buffer
	 * 
	 * @param buffer
	 * @param name
	 * @param view
	 * @param anchor
	 */
	void appendLink(StringBuffer buffer, String name, String view, String anchor);

	/**
	 * append a create link to the buffer
	 * 
	 * @param buffer
	 * @param name
	 * @param view
	 */
	void appendCreateLink(StringBuffer buffer, String name, String view);

	/**
	 * @param cachable
	 */
	void setCachable(boolean cachable);

	/**
	 * After rendering is the result cachable
	 * 
	 * @return
	 */
	boolean isCachable();

	/**
	 * Before rendering, can we use a chached version
	 * 
	 * @return
	 */
	boolean canUseCache();

	/**
	 * If true the rendered may use the cache, if false it should not
	 * 
	 * @param b
	 */
	void setUseCache(boolean b);

	/**
	 * append an auto generated link to the buffer.
	 * @param buffer
	 * @param name
	 * @param view
	 * @param anchor
	 * @param autoGenerated TODO
	 */
	void appendLink(StringBuffer buffer, String name, String view, String anchor, boolean autoGenerated);

}
