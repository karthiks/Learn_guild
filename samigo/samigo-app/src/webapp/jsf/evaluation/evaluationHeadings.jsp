<!--
$Id: evaluationHeadings.jsp 6643 2006-03-13 19:38:07Z hquinn@stanford.edu $
<%--
***********************************************************************************
*
* Copyright (c) 2004, 2005, 2006 The Sakai Foundation.
*
* Licensed under the Educational Community License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.osedu.org/licenses/ECL-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License. 
*
**********************************************************************************/
--%>
-->
  <h:panelGroup rendered="#{authorization.adminAssessment or authorization.adminQuestionPool or authorization.adminTemplate}">

<f:verbatim><ul class="navIntraTool actionToolbar" role="menu">
<li role="menuitem" class="firstToolBarItem"><span></f:verbatim>

    <h:commandLink title="#{generalMessages.t_assessment}" action="author" immediate="true"  rendered="#{authorization.adminAssessment}">
       <f:actionListener
         type="org.sakaiproject.tool.assessment.ui.listener.author.AuthorActionListener" />
      <h:outputText value="#{generalMessages.assessment}" />
    </h:commandLink>

<f:verbatim></span></li></f:verbatim>
<h:panelGroup rendered="#{authorization.adminTemplate and template.showAssessmentTypes}">
<f:verbatim><li role="menuitem" ><span></f:verbatim>

    <h:commandLink title="#{generalMessages.t_template}" action="template" immediate="true">
      <h:outputText value="#{generalMessages.template}" />
      <f:actionListener type="org.sakaiproject.tool.assessment.ui.listener.author.TemplateListener" />
    </h:commandLink>
 
<f:verbatim></span></li></f:verbatim>
</h:panelGroup>
<f:verbatim><li role="menuitem" ><span></f:verbatim>

    <h:commandLink id="questionPoolsLink" title="#{generalMessages.t_questionPool}" action="poolList" immediate="true"  rendered="#{authorization.adminQuestionPool}">
      <h:outputText value="#{generalMessages.questionPool}" />
      <f:actionListener type="org.sakaiproject.tool.assessment.ui.listener.questionpool.QuestionPoolListener" />
    </h:commandLink>

<f:verbatim></span></li>
</ul></f:verbatim>
  </h:panelGroup>
