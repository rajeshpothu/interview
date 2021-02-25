<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Employees List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>CompanyName</th><th>FailureReason</th><th>Answer</th><th>InterviewDate</th>
<th>InterviewQuestion</th><th>View/Edit</th><th>Delete</th></tr>  
   <c:forEach var="interviewDetails" items="${list}">   
   <tr>  
   <td>${interviewDetails.interviewId}</td>  
   <td>${interviewDetails.companyName}</td>  
   <td>${interviewDetails.failureReason}</td>
   <td>${interviewDetails.answer}</td>  
   <td>${interviewDetails.interviewDate}</td>  
   <td>${interviewDetails.failureReason}</td>  
    
   <td><a href="interview/getAllinterviews/getInterviewById/${interview.interviewId}"><button
	type="button" class="btn btn-info btn-lg">view/edit</button></a></td>
	<td><a href="deleteInterview/${interview.interviewId}"><button
	type="button" class="btn btn-info btn-lg">Delete</button></a></td>
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="indexpage">Add New Interview</a>