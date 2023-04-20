<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleStringImplProxyid" scope="session" class="com.sk.StringImplProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleStringImplProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleStringImplProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleStringImplProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.sk.StringImpl getStringImpl10mtemp = sampleStringImplProxyid.getStringImpl();
if(getStringImpl10mtemp == null){
%>
<%=getStringImpl10mtemp %>
<%
}else{
        if(getStringImpl10mtemp!= null){
        String tempreturnp11 = getStringImpl10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String str_1id=  request.getParameter("str16");
            java.lang.String str_1idTemp = null;
        if(!str_1id.equals("")){
         str_1idTemp  = str_1id;
        }
        java.lang.String removeFirst13mtemp = sampleStringImplProxyid.removeFirst(str_1idTemp);
if(removeFirst13mtemp == null){
%>
<%=removeFirst13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(removeFirst13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 18:
        gotMethod = true;
        String str_2id=  request.getParameter("str21");
            java.lang.String str_2idTemp = null;
        if(!str_2id.equals("")){
         str_2idTemp  = str_2id;
        }
        java.lang.String removeLast18mtemp = sampleStringImplProxyid.removeLast(str_2idTemp);
if(removeLast18mtemp == null){
%>
<%=removeLast18mtemp %>
<%
}else{
        String tempResultreturnp19 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(removeLast18mtemp));
        %>
        <%= tempResultreturnp19 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>