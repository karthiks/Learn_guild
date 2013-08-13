/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/calendar/tags/calendar-2.9.2/calendar-util/util/src/java/org/sakaiproject/util/CalendarChannelReferenceMaker.java $
 * $Id: CalendarChannelReferenceMaker.java 59673 2009-04-03 23:02:03Z arwhyte@umich.edu $
 ***********************************************************************************
 *
 * Copyright (c) 2003, 2004, 2005, 2006, 2008, 2009 The Sakai Foundation
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

package org.sakaiproject.util;

import org.sakaiproject.calendar.cover.CalendarService;
import org.sakaiproject.site.cover.SiteService;

/**
 * Callback class so that we can form references in a generic way.
 */
public final class CalendarChannelReferenceMaker implements MergedList.ChannelReferenceMaker
{
    public String makeReference(String siteId)
    {
        return CalendarService.calendarReference(siteId, SiteService.MAIN_CONTAINER);
    }
}
